package com.loras.infra.eats;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface EatsDao {
	List<EatsDto> eatsSelectList();

}
