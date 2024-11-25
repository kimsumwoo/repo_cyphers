package com.loras.infra.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.infra.mail.MailService;

@Controller
public class SignUpController {
	@Autowired
	public SignUpService SignUpService;
	@Autowired
	public MailService mailService;
//	관리자
	@RequestMapping(value ="/xdm/v1/infra/signup/signUp")
	public String signUp() {
		return "xdm/v1/infra/signup/signUp";
	}
//	사용자
	@RequestMapping(value = "/usr/v1/infra/signUp/signUpUsrForm")
	public String signUpUsrForm() {
		return "usr/v1/infra/signUp/signUpUsrForm";
	}
	@RequestMapping(value = "/usr/v1/infra/signUp/signUpUsrInst")
	public String signUpUsrInst(SignUpDto signUpDto) {
		signUpDto.setMmPasswd(encodeBcrypt(signUpDto.getMmPasswd(), 10));
		SignUpService.insert(signUpDto);
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				mailService.sendMailSimple();
			}
		});
		
		thread.start();
		return "redirect:/usr/v1/infra/login/loginUsrForm";
	}
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}	
}
