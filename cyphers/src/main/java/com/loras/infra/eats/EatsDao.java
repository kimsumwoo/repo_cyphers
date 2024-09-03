package com.loras.infra.eats;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface EatsDao {
	List<EatsDto> eatsSelectList();
	
public int insert(EatsDto eatsDto);

public EatsDto selectOne(EatsDto eatsDto);





}
