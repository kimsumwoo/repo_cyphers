package com.loras.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
	@Service
public class CodeGroupService {
	@Autowired
	public CodeGroupDao CodeGroupDao;
	
//	public List<CodeGroupDto> selectList(){
//		List<CodeGroupDto> CodeGroups = CodeGroupDao.selectList();
//		return CodeGroups;
//	}
	
//	안에 내용이 없을때
	public List<CodeGroupDto> selectList(){
		return CodeGroupDao.selectList();
	}
	

}
