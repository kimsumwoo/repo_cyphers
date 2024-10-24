package com.loras.infra.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loras.infra.member.MemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogInController {
	@Autowired
	public LogInService logInService;
	
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
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail");
			returnMap.put("message", "일치하는 회원이 존재하지 않습니다.");
		}
		return returnMap;
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
	
}
