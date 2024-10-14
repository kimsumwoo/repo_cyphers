package com.loras.infra.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	public OrderDao orderDao;
	
	public List<OrderDto> orderList(OrderDto orderDto){
		return orderDao.orderList(orderDto);
	}
}
