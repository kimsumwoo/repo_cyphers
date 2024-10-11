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
	public String CheckOutForm() {
		return "/usr/v1/infra/checkout/checkOutForm";
	}

		
}

