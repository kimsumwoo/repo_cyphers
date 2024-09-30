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
	@RequestMapping(value ="/xdm/v1/infra/login/helloworld")
	public String helloworld(LogInDto logInDto) {
		logInService.logInSelectOne();
		return "/xdm/v1/infra/login/helloworld";
	}
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/login/signinXdmProc")
	public Map<String, Object> signinXdmProc(LogInDto logInDto) throws Exception {
		System.out.println("sadsadsad");
		Map<String, Object> returnMap = new HashMap<String, Object>();
		
		LogInDto rtMember2 = logInService.logInSelectOne(); 

		if (rtMember2 != null) {
			returnMap.put("rt", "success");
		} else {
			returnMap.put("rt", "fail"); 
		}
		return returnMap;
	}
}
