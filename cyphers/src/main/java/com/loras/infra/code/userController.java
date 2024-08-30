package com.loras.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
	@Autowired
	public userService userService;
	@RequestMapping(value ="/xdm/v1/infra/code/usercodeXdmList")
	public String usercodeXdmList(Model model) {
		model.addAttribute("user", userService.userSelectList());
		
		return "/xdm/v1/infra/code/usercodeXdmList";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/code/userInst")
	public String userFormInst(userDto userDto) {
		userService.insert(userDto);	
		return "redirect:/xdm/v1/infra/code/usercodeXdmList";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/code/userForm")
	public String userForm() {
		return "/xdm/v1/infra/code/userForm";
	}
	

}
