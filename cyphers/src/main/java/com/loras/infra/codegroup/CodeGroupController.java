package com.loras.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService CodeGroupService;
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList() {
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
//	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmForm")
//	public String codeGroupXdmForm(Model model) {
////		여기에서 함수를 호출해야 된다는
////		service 에 있는 함수를 호출
////		service.selectList();
//		List<CodeGroupDto> codeGroups = CodeGroupService.selectList();
//		
//		model.addAttribute("list", codeGroups);
//		
//		
////		for(CodeGroupDto codeGroupDto:codeGroups) {
////			System.out.println(codeGroupDto.getSeq() + "/" + codeGroupDto.getCgName());
////		}
////		System.out.println(codeGroups.size());
//		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
//	}
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm(Model model) {
		
		model.addAttribute("list", CodeGroupService.selectList());
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}


}