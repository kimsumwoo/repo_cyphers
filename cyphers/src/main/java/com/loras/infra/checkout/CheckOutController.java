package com.loras.infra.checkout;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CheckOutController {
	@Autowired
	CheckOutService checkOutService;
	
	@RequestMapping(value = "/usr/v1/infra/checkout/checkOutForm")
	public String CheckOutForm(CheckOutDto checkOutDto,Model model) {
		model.addAttribute("list", checkOutService.selectListAd(checkOutDto));
		model.addAttribute("item", checkOutService.selectCheckout(checkOutDto));
		return "/usr/v1/infra/checkout/checkOutForm";
	}
	@RequestMapping(value = "/usr/v1/infra/checkout/checkOutInst")
	public String checkOutInst(CheckOutDto checkOutDto) {
		System.out.println(checkOutDto.getPdSeq());
		checkOutService.insert(checkOutDto);
		return "redirect:/usr/v1/infra/order/OrderList";
	}

		
}

