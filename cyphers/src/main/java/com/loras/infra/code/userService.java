package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
	@Autowired
	public userDao userDao;
	public List<userDto> userSelectList(){
		List<userDto> users = userDao.userSelectList();
			return users;
	}
}
