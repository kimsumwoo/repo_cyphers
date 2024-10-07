package com.loras.infra.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
	@Autowired
	public SignUpService SignUpService;
//	관리자
	@RequestMapping(value ="/xdm/v1/infra/signup/signUp")
	public String signUp() {
		return "/xdm/v1/infra/signup/signUp";
	}
//	사용자
	@RequestMapping(value = "/usr/v1/infra/signUp/signUpUsrForm")
	public String signUpUsrForm() {
		return "/usr/v1/infra/signUp/signUpUsrForm";
	}
	@RequestMapping(value = "/usr/v1/infra/signUp/signUpUsrInst")
	public String signUpUsrInst(SignUpDto signUpDto) {
		SignUpService.insert(signUpDto);
		return "redirect:/usr/v1/infra/login/loginUsrForm";
	}
}
