package com.loras.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface MemberDao {
	
	public List<MemberDto> MemberSelectList(MemberVo vo);
	
	public int insert(MemberDto memberDto);
	
	public MemberDto selectOne(MemberDto memberDto);
	
	public int update(MemberDto memberDto);
	
	public int delete(MemberDto memberDto);
	
	public int selectOneCount(MemberVo vo);
}
