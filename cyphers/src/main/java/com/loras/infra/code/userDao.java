package com.loras.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface userDao {
	List<userDto> userSelectList();
	

}
