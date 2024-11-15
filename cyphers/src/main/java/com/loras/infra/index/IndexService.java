package com.loras.infra.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	@Autowired
	public IndexDao indexDao;
	
	public List<IndexDto> productMostList(){
		return indexDao.productMostList();
	}
	
	public List<IndexDto> productNewList(){
		return indexDao.productNewList();
	}
	public List<IndexDto> reviewSelectList(){
		return indexDao.reviewSelectList();
	}

}
