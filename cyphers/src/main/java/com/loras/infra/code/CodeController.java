package com.loras.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CodeController {
	@Autowired
	CodeService Service;
	public void ccc() {
		Service.bbb();
		
	}
	
	
}
