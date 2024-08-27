package com.loras.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
@Autowired
	public CodeDao CodeDao;
	List<CodeDto> codeSelectList(){
		List<CodeDto> codes = CodeDao.codeSelectList();
			return codes;
	}

	
		
	
}
