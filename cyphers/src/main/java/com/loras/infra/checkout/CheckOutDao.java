package com.loras.infra.checkout;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CheckOutDao {
	
	public CheckOutDto selectCheckout(CheckOutDto checkOutDto);
	
	public int insert(CheckOutDto checkOutDto);
	
	public List<CheckOutDto> selectListAd(CheckOutDto checkOutDto);
	
	
}

