package com.loras.infra.codegroup;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService service;
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
//		여기에서 함수를 호출해야 된다는
//		service 에 있는 함수를 호출
		service.selectList();
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
//	여기에서 함수를 호출해야 된다는
//	service 에 있는 함수를 호출
	
	
	

}
