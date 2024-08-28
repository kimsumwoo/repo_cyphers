package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
	@Autowired
	public userService userService;
	@RequestMapping(value ="/xdm/v1/infra/code/usercodeXdmList")
	public String usercodeXdmList() {
		List<userDto> users = userService.userSelectList();
		for(userDto userDto:users) {
			System.out.print(userDto.getName()+"/"+userDto.getAdminNy()+"/"+userDto.getId()+"/"+userDto.getPasswd());
		}
		return "/xdm/v1/infra/code/usercodeXdmList";
	}

}
