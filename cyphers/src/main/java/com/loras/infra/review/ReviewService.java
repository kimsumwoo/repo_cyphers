package com.loras.infra.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
	@Autowired
	public ReviewDao reviewDao;

	public List<ReviewDto> reviewSelectList(ReviewVo vo){
		return reviewDao.reviewSelectList(vo);
		}
	public int insertXdm(ReviewDto reviewDto) {
		return reviewDao.insertXdm(reviewDto);
		}
	public int insert(ReviewDto reviewDto) {
		return reviewDao.insert(reviewDto);
	}
	public ReviewDto selectOne(ReviewDto reviewDto) {
		return reviewDao.selectOne(reviewDto);
	}
	public int update(ReviewDto reviewDto) {
		return reviewDao.update(reviewDto);
	}
	public int delete(ReviewDto reviewDto) {
		return reviewDao.delete(reviewDto);
	}
	public int selectOneCount(ReviewVo reviewVo) {
		return reviewDao.selectOneCount(reviewVo);
	}





}
