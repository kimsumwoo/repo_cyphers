package com.loras.infra.review;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDao {
	public List<ReviewDto> reviewSelectList();
	public int insert(ReviewDto reviewDto);
	public ReviewDto selectOne(ReviewDto reviewDto);
	public int update(ReviewDto reviewDto);

}
