package com.loras.infra.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduService {
	@Autowired
	public EduDao EduDao;
	
	List<EduDto> eduSelectList(){
		List<EduDto> edus = EduDao.eduSelectList();
		return edus;
	}

}
