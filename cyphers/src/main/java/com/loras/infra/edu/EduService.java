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
	public int insert(EduDto eduDto) {
		return EduDao.insert(eduDto);
	}
	public EduDto selectOne(EduDto eduDto) {
		return EduDao.selectOne(eduDto);
	}
	public int update(EduDto eduDto) {
		return EduDao.update(eduDto);
	}

}
