package com.loras.infra.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

@Service
public class addressService {
	@Autowired
	addressDao addressDao;
	public List<addressDto> addressList(addressDto addressDto){
		return addressDao.addressList(addressDto);
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
	public int delete(addressDto addressDto) {
		return addressDao.delete(addressDto);
	}
	public int usrInsert(addressDto addressDto) {
		return addressDao.usrInsert(addressDto);
	}
	public List<addressDto> addressUsrList(addressDto addressDto){
		return addressDao.addressUsrList(addressDto);
	}
	public int deleteUsr(addressDto addressDto) {
		return addressDao.deleteUsr(addressDto);
	}
}