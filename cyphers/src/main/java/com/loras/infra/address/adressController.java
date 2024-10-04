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
	@RequestMapping(value = "/xdm/v1/infra/address/addressXdmDete")
	public String addressXdmDete(addressDto addressDto) {
		addressService.delete(addressDto);
	return "redirect:/xdm/v1/infra/address/addressXdmList";
	}
	
//	유저
	@RequestMapping(value ="/usr/v1/infra/address/addressUsrList")
	public String addressUsrList(Model model){
		model.addAttribute("list", addressService.addressList());
		return "/usr/v1/infra/address/addressUsrList";
	}
	@RequestMapping(value = "/usr/v1/infra/address/addressUsrInst")
	public String addressUsrInst(addressDto addressDto) {
		addressService.usrInsert(addressDto);
	return "redirect:/usr/v1/infra/address/addressUsrList";
	}
	@RequestMapping(value = "/xdm/v1/infra/address/addressUsrDete")
	public String addressUsrDete(addressDto addressDto) {
		addressService.delete(addressDto);
	return "redirect:/usr/v1/infra/address/addressUsrList";
	}
	@RequestMapping(value ="/usr/v1/infra/address/addressUsrForm")
	public String addressUsrForm(){
		return "/usr/v1/infra/address/addressUsrForm";
	}
	@RequestMapping(value ="/usr/v1/infra/address/addressUsrMFom")
	public String addressUsrMFom(addressDto addressDto,Model model){
		model.addAttribute("item", addressService.selectOne(addressDto));
		return "/usr/v1/infra/address/addressUsrMFom";
	}
	@RequestMapping(value = "/usr/v1/infra/address/addressUsrUpdt")
	public String addressUsrUpdt(addressDto addressDto) {
		addressService.update(addressDto);
	return "redirect:/usr/v1/infra/address/addressUsrList";
	}

}
	
	


