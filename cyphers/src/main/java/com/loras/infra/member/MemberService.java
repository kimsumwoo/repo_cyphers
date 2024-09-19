package com.loras.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loras.infra.codegroup.CodeGroupDao;

@Service
public class MemberService {
	@Autowired
	public MemberDao memberDao;
	
	public List<MemberDto> memberSelectList(MemberVo vo){
		return memberDao.MemberSelectList(vo);
	}
	
	public int insert(MemberDto memberDto) {
		return memberDao.insert(memberDto);
	}
	
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	public int update(MemberDto memberDto) {
		return memberDao.update(memberDto);
	}
	public int delete(MemberDto memberDto) {
		return memberDao.delete(memberDto);
	}

}
