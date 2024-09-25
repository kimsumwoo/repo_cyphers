package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;

@Controller
public class CodeController {
	@Autowired
	CodeService CodeService;
	
	@RequestMapping(value = "/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList(Model model,@ModelAttribute("vo") CodeVo vo) {
//		/* 초기값 세팅이 없는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
			vo.setParamsPaging(CodeService.selectOneCount(vo));
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
