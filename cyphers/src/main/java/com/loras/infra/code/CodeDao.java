package com.loras.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.loras.infra.codegroup.CodeGroupDto;

@Repository
public interface CodeDao {
	public List<CodeDto> codeSelectList();
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	


}
