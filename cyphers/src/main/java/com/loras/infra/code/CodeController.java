package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	@Autowired
		public CodeService CodeService;
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
		public String codeGroupXdmList2() {
			List<CodeDto> codes = CodeService.codeSelectList();
				for(CodeDto CodeDto :codes) {
					System.out.println(CodeDto.getCdName()+"/"+CodeDto.getCdUseNy()+"/"+CodeDto.getDelNy()+"/"+CodeDto.getCdDateTime()+"/"+CodeDto.getCodegroup_seq());
				}
			return "/xdm/v1/infra/code/codeXdmList";
}



	
	
	
	
	
	
	
	
	
}
