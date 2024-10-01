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
	
	@RequestMapping(value ="/xdm/v1/infra/login/logIn")
	public String logIn() {
		return "/xdm/v1/infra/login/logIn";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/login/xdmIndex")
	public String xdmIndex() {
		return "/xdm/v1/infra/login/xdmIndex";
	}
	
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/login/signinXdmProc")
	public Map<String, Object> signinXdmProc(LogInDto logInDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		LogInDto rtMember = logInService.logInSelectOne(logInDto); 

//		httpSession.setMaxInactiveInterval(60 * 30); // 60second * 30 = 30minute
		httpSession.setAttribute("sessSeqXdm", rtMember.getMmSeq());
		httpSession.setAttribute("sessIdXdm", rtMember.getMmId());
		httpSession.setAttribute("sessNameXdm", rtMember.getMmRealName());

		if (rtMember != null) {
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail"); 
		}
		return returnMap;
	}
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/login/signoutXdmProc")
	public Map<String, Object> signoutXdmProc(HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		httpSession.invalidate();
		returnMap.put("rt", "success");
		return returnMap;
	}
}
