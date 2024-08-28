package com.loras.infra.eats;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eatsController {
	@Autowired
	public EatsService EatsService;
	@RequestMapping(value = "/xdm/v1/infra/eats/eatsList")
	public String eatsList() {
		List<EatsDto> eatss = EatsService.eatsSelectList();
		for(EatsDto eatsDto:eatss) {
			System.out.println(eatsDto.getName()+"/"+eatsDto.getSite()+"/"+eatsDto.getEatsDesc()+"/"+eatsDto.getTimeStart()+"/"+eatsDto.getTimeEnd()+"/"+eatsDto.getBookingNy()+"/"+eatsDto.getFreecallNy());
		}
		return "/xdm/v1/infra/eats/eatsList";
	}

}
