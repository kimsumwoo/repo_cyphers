package com.loras.infra.address;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

@Repository
public interface addressDao {
	
	public List<addressDto> addressList();
	
	public int insert(addressDto addressDto);

}
