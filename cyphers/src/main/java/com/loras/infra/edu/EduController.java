package com.loras.infra.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EduController {
	@Autowired
	public EduService EduService;
	@RequestMapping(value ="/xdm/v1/infra/education/educationList")
	public String educationList(Model model) {
		model.addAttribute("edu",EduService.eduSelectList());
		return "/xdm/v1/infra/education/educationList";
	}
		
		@RequestMapping(value ="/xdm/v1/infra/education/eduForm")
		public String eduForm() {
			return "/xdm/v1/infra/education/eduForm";
	}
		@RequestMapping(value ="/xdm/v1/infra/education/eduInst")
		public String eduInst(EduDto eduDto) {
			
			EduService.insert(eduDto);
			
			return "redirect:/xdm/v1/infra/education/educationList";
	}
}
