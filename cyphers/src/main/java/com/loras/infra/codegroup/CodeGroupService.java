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
	public List<CodeGroupDto> selectList(CodeGroupVo vo){
		return CodeGroupDao.selectList(vo);
	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.insert(codeGroupDto);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.selectOne(codeGroupDto);
	}
	
	public int update(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.update(codeGroupDto);
	}
	
	public int uelete(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.uelete(codeGroupDto);
	}
	
	public int delete(CodeGroupDto codeGroupDto) {
		return CodeGroupDao.delete(codeGroupDto);
	}
	
	 public int selectOneCount(CodeGroupVo vo) { 
	    	return CodeGroupDao.selectOneCount(vo); 
	    }
	

	

}
