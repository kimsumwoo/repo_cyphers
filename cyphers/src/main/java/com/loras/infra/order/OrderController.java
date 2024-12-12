package com.loras.infra.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class OrderController {
	@Autowired
	public OrderService orderService;
	
	@RequestMapping(value = "/usr/v1/infra/order/orderList")
	public String OrderList(Model model,OrderDto orderDto, HttpServletRequest request) {
		orderDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		model.addAttribute("list", orderService.orderList(orderDto));
		model.addAttribute("returnList", orderService.orderListReturn(orderDto));
		return "usr/v1/infra/order/orderList";
	}
	@RequestMapping(value = "/usr/v1/infra/order/OrderReturnUpte")
	public String OrderReturnUpte(OrderDto orderDto) {
		orderService.updateReturn(orderDto);
		return "redirect:/usr/v1/infra/order/orderList";
	}
}
