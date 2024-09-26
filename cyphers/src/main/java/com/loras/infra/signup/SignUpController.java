package com.loras.infra.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
	@Autowired
	public SignUpService SignUpService;
	
	@RequestMapping(value ="/xdm/v1/infra/signup/signUp")
	public String signUp() {
		return "/xdm/v1/infra/signup/signUp";
	}
}
