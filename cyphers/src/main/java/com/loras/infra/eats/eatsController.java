package com.loras.infra.eats;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eatsController {
	@Autowired
	public EatsService EatsService;
	@RequestMapping(value = "/xdm/v1/infra/eats/eatsList")
	public String eatsList(Model model) {
		model.addAttribute("eats", EatsService.eatsSelectList());
	
		return "/xdm/v1/infra/eats/eatsList";
	}

	@RequestMapping(value = "/xdm/v1/infra/eats/eatsInst")
	public String eatsInst(EatsDto eatsDto) {
		
		EatsService.insert(eatsDto);
		
		return "redirect:/xdm/v1/infra/eats/eatsList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/eats/eatsForm")
	public String eatsFrom() {
		
		return "/xdm/v1/infra/eats/eatsForm";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/eats/eatsMfom")
	public String eatsMfom(EatsDto eatsDto, Model model) {
		model.addAttribute("item", EatsService.selectOne(eatsDto));
		return "/xdm/v1/infra/eats/eatsMfom";
	}
	@RequestMapping(value = "/xdm/v1/infra/eats/eatsUpdt")
	public String eatsUpdt(EatsDto eatsDto) {
		EatsService.update(eatsDto);
		return "redirect:/xdm/v1/infra/eats/eatsList";
	}
	

}
