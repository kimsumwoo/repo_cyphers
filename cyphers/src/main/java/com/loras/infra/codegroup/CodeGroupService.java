package com.loras.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;

public class CodeGroupService {
	@Autowired
	CodeGroupDao dao;
	
	public void selectList() {
//		codeGroupDao.selectList
		dao.selectList();
		
		
	}

}
