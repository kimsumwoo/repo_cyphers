package com.loras.infra.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.loras.common.config.kakaoApi.KakaoApi;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogInController {
	@Autowired
	public LogInService logInService;
	@Autowired
	public KakaoApi kakaoApi;
	
	@RequestMapping(value ="/xdm/v1/infra/login/logInXdmForm")
	public String LogInXdmForm() {
		return "/xdm/v1/infra/login/logInXdmForm";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/login/indexXdmList")
	public String indexXdmList() {
		return "/xdm/v1/infra/login/indexXdmList";
	}
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/login/loginXdmProc")
	public Map<String, Object> LoginXdmProc(LogInDto logInDto, HttpSession httpSession) throws Exception {
	    Map<String, Object> returnMap = new HashMap<>();

	    LogInDto rtMember = logInService.logInSelectOne(logInDto); 

	    if (rtMember != null) {
	        // 로그인 성공 시 세션에 사용자 정보 저장
	        httpSession.setAttribute("sessSeqXdm", rtMember.getMmSeq());
	        httpSession.setAttribute("sessIdXdm", rtMember.getMmId());
	        httpSession.setAttribute("sessNameXdm", rtMember.getMmRealName());
	        
	        returnMap.put("rt", "success");
	    } else {
	        // 로그인 실패 시
	        returnMap.put("rt", "fail"); 
	        returnMap.put("message", "일치하는 회원이 존재하지 않습니다."); // 추가적인 메시지
	    }
	    return returnMap;
	}
//	사용자 로그인화면
	@RequestMapping(value = "/usr/v1/infra/login/loginUsrForm")
	public String loginUsrForm() {
		return "/usr/v1/infra/login/loginUsrForm";
	}
//	사용자로그인
	@ResponseBody
	@RequestMapping(value = "/usr/v1/infra/login/loginusrFormProc")
	public Map<String, Object> LoginUsrFormProc(LogInDto logInDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		LogInDto rtMember = logInService.logInSelectOne(logInDto); 

//		httpSession.setMaxInactiveInterval(60 * 30); // 60second * 30 = 30minute
		httpSession.setAttribute("sessSeqUsr", rtMember.getMmSeq());
		httpSession.setAttribute("sessIdUsr", rtMember.getMmId());
		httpSession.setAttribute("sessNameUsr", rtMember.getMmRealName());
		if (rtMember != null) {
			if(matchesBcrypt(logInDto.getMmPasswd(), rtMember.getMmPasswd(), 10)) {
				returnMap.put("rt", "success");
			} else {
				returnMap.put("rt", "fail");
				returnMap.put("message", "일치하는 회원이 존재하지 않습니다.");
			}
		}
		return returnMap;
	}
	@RequestMapping(value = "/usr/v1/infra/login/loginUsrKakao")
	public ModelAndView loginUsrKakao(@RequestParam("code") String code, HttpSession session) {
	    ModelAndView mav = new ModelAndView();
	    try {
	        String accessToken = kakaoApi.getAccessToken(code);
	        HashMap<String, Object> userInfo = kakaoApi.getUserInfo(accessToken);
	        
	        System.out.println("login info: " + userInfo.toString());
	        System.out.println("nickname: " + userInfo.get("nickname"));
	        if (userInfo.get("email") != null) {
	            session.setAttribute("userId", userInfo.get("email"));
	            session.setAttribute("access_token", accessToken);
	            session.setAttribute("nickname", userInfo.get("nickname"));
	            mav.setViewName("redirect:/usr/v1/infra/index/indexUsr"); // 리다이렉트 설정

	        } else {
	            mav.setViewName("error"); // 이메일이 없는 경우 오류 페이지
	            System.out.println("Error: No email found in user info."); // 오류 메시지 출력
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // 로그 출력
	        mav.setViewName("error"); // 오류 페이지로 이동
	        System.out.println("Error occurred: " + e.getMessage()); // 오류 메시지 출력
	    }
	    return mav;
	}


	
	@RequestMapping(value = "/usr/v1/infra/login/logoutUsrKakao")
	public ModelAndView logoutUsrKakao(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		kakaoApi.kakaoLogout((String)session.getAttribute("access_token"));
		session.removeAttribute("access_token");
		session.removeAttribute("userId");
		mav.setViewName("redirect:/usr/v1/infra/index/indexUsr");
		return mav;
	}
//	사용자로그아웃
	@ResponseBody
	@RequestMapping(value = "/usr/v1/infra/login/logoutUsrFormProc")
	public Map<String, Object> logoutUsrProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
	
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}	
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/login/logoutXdmProc")
	public Map<String, Object> logoutXdmProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
	
	public String encodeBcrypt1(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt1(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}	
	
}
