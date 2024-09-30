package com.loras.infra.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
