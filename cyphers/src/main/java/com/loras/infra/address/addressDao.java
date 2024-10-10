package com.loras.infra.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface addressDao {
	
	public List<addressDto> addressList(addressDto addressDto);
	
	public int insert(addressDto addressDto);
	
	public addressDto selectOne(addressDto addressDto);
	
	public int update(addressDto addressDto);
	
	public int delete(addressDto addressDto);
	
	public int usrInsert(addressDto addressDto);
	
	public List<addressDto> addressUsrList(addressDto addressDto);
	
	public int deleteUsr(addressDto addressDto);
	

}
