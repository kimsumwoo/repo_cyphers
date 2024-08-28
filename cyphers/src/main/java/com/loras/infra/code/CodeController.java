package com.loras.infra.code;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	@Autowired
	CodeService CodeService;
	
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList() {
			List<CodeDto> codes = CodeService.codeSelectList();
			for(CodeDto codeDto : codes) {
				System.out.println(codeDto.getCdDateTime());
			}
				
			return "/xdm/v1/infra/code/codeXdmList";
	}

}
