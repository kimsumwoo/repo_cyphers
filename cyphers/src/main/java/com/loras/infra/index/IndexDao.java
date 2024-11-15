package com.loras.infra.index;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface IndexDao {
	public List<IndexDto> productMostList();
	
	public List<IndexDto> productNewList();
	
	public List<IndexDto> reviewSelectList();

}
