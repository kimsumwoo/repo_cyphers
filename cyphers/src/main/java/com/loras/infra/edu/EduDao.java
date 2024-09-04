package com.loras.infra.edu;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EduDao {
	List<EduDto> eduSelectList();
	
public int insert(EduDto eduDto);

public EduDto selectOne(EduDto eduDto);

public int update(EduDto eduDto);

}
