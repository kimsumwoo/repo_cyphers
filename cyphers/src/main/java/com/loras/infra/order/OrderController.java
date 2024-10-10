package com.loras.infra.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@Autowired
	public OrderService orderService;
	
	@RequestMapping(value = "/usr/v1/infra/order/OrderList")
	public String OrderList() {
		return "/usr/v1/infra/order/OrderList";
	}
}
