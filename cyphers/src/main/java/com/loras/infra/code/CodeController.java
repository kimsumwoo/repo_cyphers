package com.loras.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.infra.codegroup.CodeGroupDto;

@Controller
public class CodeController {
	@Autowired
	CodeService CodeService;
	
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList(Model model) {
			model.addAttribute("list", CodeService.codeSelectList());
			return "/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmForm")
	public String codeXdmForm(CodeDto codeDto,Model model) {
		model.addAttribute("item",CodeService.selectOne(codeDto));
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		CodeService.insert(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmMfom")
	public String codeXdmMfom(CodeDto codeDto, Model model) {
	
		return "/xdm/v1/infra/code/codeXdmMfom";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		CodeService.update(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	
	
}
