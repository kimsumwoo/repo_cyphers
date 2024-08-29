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

}
