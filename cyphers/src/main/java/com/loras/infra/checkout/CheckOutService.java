package com.loras.infra.checkout;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CheckOutService {
	@Autowired
	public CheckOutDao checkOutDao;
	
	public CheckOutDto selectCheckout(CheckOutDto checkOutDto) {
		return checkOutDao.selectCheckout(checkOutDto);
	}
	public int insert(CheckOutDto checkOutDto) {
		return checkOutDao.insert(checkOutDto);
	}
	public List<CheckOutDto> selectListAd(CheckOutDto checkOutDto){
		return checkOutDao.selectListAd(checkOutDto);
	}
	
	



}
