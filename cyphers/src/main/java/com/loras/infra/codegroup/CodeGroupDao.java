package com.loras.infra.codegroup;


import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	
	public List<CodeGroupDto> selectList(CodeGroupVo vo);
	
	public int insert(CodeGroupDto codeGroupDto);
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto);
	
	public int update(CodeGroupDto codeGroupDto);
	
	public int uelete(CodeGroupDto codeGroupDto);
	
	public int delete(CodeGroupDto codeGroupDto);
	
	public int selectOneCount(CodeGroupVo vo);

	public int insertUploaded(CodeGroupDto codeGroupDto);
	
	

	

	
	
	
	
	
	
	
	
	
	
}
