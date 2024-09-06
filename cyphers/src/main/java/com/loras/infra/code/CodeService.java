package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loras.infra.codegroup.CodeGroupDto;

@Service
public class CodeService {
	@Autowired
	public CodeDao CodeDao;
	
	public List<CodeDto> codeSelectList(){
		List<CodeDto> codes = CodeDao.codeSelectList();
				return codes;
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

}
