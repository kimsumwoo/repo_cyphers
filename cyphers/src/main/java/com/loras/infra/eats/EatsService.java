package com.loras.infra.eats;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EatsService {
	@Autowired
	public EatsDao EatsDao;
	List<EatsDto> eatsSelectList(){
		List<EatsDto> eatss = EatsDao.eatsSelectList();
		return eatss;
	}
	public int insert(EatsDto eatsDto) {
		return EatsDao.insert(eatsDto);
	}
	public EatsDto selectOne(EatsDto eatsDto) {
		return EatsDao.selectOne(eatsDto);
	}
	public int update(EatsDto eatsDto) {
		return EatsDao.update(eatsDto);
	}
}
