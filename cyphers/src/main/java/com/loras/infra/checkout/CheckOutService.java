package com.loras.infra.checkout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutService {
	@Autowired
	public CheckOutDao checkOutDao;

}
