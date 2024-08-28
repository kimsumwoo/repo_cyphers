package com.loras.infra.edu;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface EduDao {
	List<EduDto> eduSelectList();

}
