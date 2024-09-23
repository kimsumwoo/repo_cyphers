package com.loras.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.loras.infra.codegroup.CodeGroupDto;
import com.loras.infra.codegroup.CodeGroupVo;

@Repository
public interface CodeDao {
	public List<CodeDto> codeSelectList(CodeVo Vo);
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	
	public List<CodeDto> selectListCodeGroup();
	
	public List<CodeDto> selectListMfom();
	
	public int uelete(CodeDto codeDto);

	
	public int delete(CodeDto codeDto);
	
	public int selectOneCount(CodeVo vo);


}
