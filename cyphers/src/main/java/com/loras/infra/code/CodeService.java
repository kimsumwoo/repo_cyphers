package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loras.infra.codegroup.CodeGroupDto;
import com.loras.infra.codegroup.CodeGroupVo;

@Service
public class CodeService {
	@Autowired
	public CodeDao CodeDao;
	
	public List<CodeDto> codeSelectList(CodeVo vo){
		return CodeDao.codeSelectList(vo);
	}
	public int insert(CodeDto codeDto) {
		return CodeDao.insert(codeDto);
	}
	public CodeDto selectOne(CodeDto codeDto) {
		return CodeDao.selectOne(codeDto);
	}
	public int update(CodeDto codeDto) {
		return CodeDao.update(codeDto);
	}
	public List<CodeDto> selectListCodeGroup(){
		return CodeDao.selectListCodeGroup();
	}
	public List<CodeDto> selectListMfom(){
		return CodeDao.selectListMfom();
	}
	public int uelete(CodeDto codeDto) {
		return CodeDao.uelete(codeDto);
	}
	public int delete(CodeDto codeDto) {
		return CodeDao.delete(codeDto);
	}
	public int selectOneCount(CodeVo vo) {
		return CodeDao.selectOneCount(vo);
	}

}
