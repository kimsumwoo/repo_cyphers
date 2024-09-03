package com.loras.infra.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface addressDao {
	
	public List<addressDto> addressList();
	
	public int insert(addressDto addressDto);
	
	public addressDto selectOne(addressDto addressDto);
	

}
