package com.loras.infra.order;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
	
	public List<OrderDto> orderList(OrderDto orderDto);
	
	public List<OrderDto> orderListReturn(OrderDto orderDto);
	
	public int updateReturn(OrderDto orderDto);

}
