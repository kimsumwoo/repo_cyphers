package com.loras.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;


@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService CodeGroupService;
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(Model model,@ModelAttribute("vo") CodeGroupVo vo) {
//		/* 초기값 세팅이 없는 경우 사용 */
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(CodeGroupService.selectOneCount(vo));
		model.addAttribute("list", CodeGroupService.selectList(vo));
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
	public String codeGroupXdmForm() {

		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
								
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {
		
		CodeGroupService.insert(codeGroupDto);
		
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmMfom")
	public String codeGroupXdmMfom(CodeGroupDto codeGroupDto, Model model) {
		model.addAttribute("item", CodeGroupService.selectOne(codeGroupDto));
		return "/xdm/v1/infra/codegroup/codeGroupXdmMfom";
	}
	
	@RequestMapping(value ="/xdm/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {
		CodeGroupService.update(codeGroupDto);
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codeGroupXdmUete")
	public String codeGroupXdmuete(CodeGroupDto codeGroupDto) {
		CodeGroupService.uelete(codeGroupDto);
		
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmDete")
	public String codegroupXdmDete(CodeGroupDto codeGroupDto) {
		CodeGroupService.delete(codeGroupDto);
		return "redirect:/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	
	
		
	
	
	


}
