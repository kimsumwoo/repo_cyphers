package com.loras.infra.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;


@Controller
public class ReviewController {
	@Autowired
	public ReviewService reviewService;
	
	@RequestMapping(value ="/xdm/v1/infra/review/reviewList")
	public String reviewList(Model model, @ModelAttribute("vo") ReviewVo vo){
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(reviewService.selectOneCount(vo));
		model.addAttribute("list", reviewService.reviewSelectList(vo));
		return "/xdm/v1/infra/review/reviewList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewForm")
	public String reviewForm() {
		return "/xdm/v1/infra/review/reviewForm";
	}
	@RequestMapping(value ="xdm/v1/infra/review/reviewInst")
	public String reviewInst(ReviewDto reviewDto) {
		reviewService.insert(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewMFom")
	public String reviewMFom(Model model, ReviewDto reviewDto) {
		model.addAttribute("item", reviewService.selectOne(reviewDto));
		return "/xdm/v1/infra/review/reviewMFom";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewUete")
	public String reviewUete(ReviewDto reviewDto) {
		reviewService.update(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewDete")
	public String reviewDete(ReviewDto reviewDto) {
		reviewService.delete(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewList";
	}
	



}
