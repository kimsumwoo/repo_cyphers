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
	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmList")
	public String addressXdmList(Model model) {
		model.addAttribute("list",(addressService.addressList()));
		return "/xdm/v1/infra/address/addressXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmInst")
	public String addressXdmInst(addressDto addressDto) {
		addressService.Insert(addressDto);
	return "redirect:/xdm/v1/infra/address/addressXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmForm")
	public String addressXdmForm() {
	return "/xdm/v1/infra/address/addressXdmForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmMFom1")
	public String addressXdmMFom(addressDto addressDto,Model model) {
		model.addAttribute("item", addressService.selectOne(addressDto));
	return "/xdm/v1/infra/address/addressXdmMFom1";
	}

	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmUpdt")
	public String addressXdmUpdt(addressDto addressDto) {
		addressService.update(addressDto);
	return "redirect:/xdm/v1/infra/address/addressXdmList";
	}
	
	
	@RequestMapping(value ="/usr/v1/infra/address/addressUsrList")
	public String addressUsrList(){
		return "/usr/v1/infra/address/addressUsrList";
	}
}
	
	


