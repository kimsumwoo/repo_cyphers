package com.loras.infra.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.infra.codegroup.CodeGroupDto;

@Controller
public class adressController {
	@Autowired
	addressService addressService;
	@RequestMapping(value = "/xdm/v1/infra/address/address2")
		public String address(Model model) {
			model.addAttribute("address", addressService.addressList());
		return "/xdm/v1/infra/address/address2";
	}
	@RequestMapping(value = "/xdm/v1/infra/address/address2Inst")
	public String addressInst(addressDto addressDto) {
		addressService.Insert(addressDto);
	return "redirect:/xdm/v1/infra/address/address2";
}
}
	
	


