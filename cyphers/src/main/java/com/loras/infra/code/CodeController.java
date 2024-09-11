package com.loras.infra.code;

import java.awt.print.Pageable;
import java.util.List;

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
		public String codeXdmList(Model model, CodeVo vo) {
			model.addAttribute("list", CodeService.codeSelectList(vo));
			return "/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		List<CodeDto> codeGroups = CodeService.selectListCodeGroup();
		model.addAttribute("listCodeGroup",codeGroups);
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		System.out.println(codeDto.getCodegroup_seq());
		CodeService.insert(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmMfom")
	public String codeXdmMfom(CodeDto codeDto, Model model) {
		model.addAttribute("item", CodeService.selectOne(codeDto));
		List<CodeDto> codes = CodeService.selectListMfom();
		model.addAttribute("mfom", codes);
		return "/xdm/v1/infra/code/codeXdmMfom";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		CodeService.update(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmUete")
	public String codeXdmUete(CodeDto codeDto) {
		CodeService.uelete(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmDete")
	public String codeXdmDete(CodeDto codeDto) {
		CodeService.delete(codeDto);
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	
	
}
