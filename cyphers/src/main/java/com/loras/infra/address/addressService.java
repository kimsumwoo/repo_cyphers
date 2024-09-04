package com.loras.infra.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

@Service
public class addressService {
	@Autowired
	addressDao addressDao;
	public List<addressDto> addressList(){
		return addressDao.addressList();
	}
	public int Insert(addressDto addressDto){
		return addressDao.insert(addressDto);
	}
	public addressDto selectOne(addressDto addressDto) {
		return addressDao.selectOne(addressDto);
	}
	public int update(addressDto addressDto) {
		return addressDao.update(addressDto);
	}
}