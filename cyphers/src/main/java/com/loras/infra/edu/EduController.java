package com.loras.infra.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EduController {
	@Autowired
	public EduService EduService;
	@RequestMapping(value ="/xdm/v1/infra/education/educationList")
	public String educationList() {
		List<EduDto> edus = EduService.eduSelectList();
		for(EduDto EduDto:edus) {
			System.out.println(EduDto.getName()+"/"+EduDto.getDate()+"/"+EduDto.getPlace()+"/"+EduDto.getPlaceDesc());
		}
		return "/xdm/v1/infra/education/educationList";
	}
}
