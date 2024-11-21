package com.loras.infra.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;


@Controller
public class ReviewController {
	@Autowired
	public ReviewService reviewService;
	
	@RequestMapping(value ="/xdm/v1/infra/review/reviewXdmList")
	public String reviewXdmList(Model model, @ModelAttribute("vo") ReviewVo vo){
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(reviewService.selectOneCountRv(vo));
		model.addAttribute("list", reviewService.reviewSelectList(vo));
		return "/xdm/v1/infra/review/reviewXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewXdmForm")
	public String reviewXdmForm() {
		return "/xdm/v1/infra/review/reviewXdmForm";
	}
	@RequestMapping(value ="xdm/v1/infra/review/reviewXdmInst")
	public String reviewXdmInst(ReviewDto reviewDto) {
		reviewService.insertXdm(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewXdmMFom")
	public String reviewXdmMFom(Model model, ReviewDto reviewDto) {
		model.addAttribute("item", reviewService.selectOne(reviewDto));
		return "/xdm/v1/infra/review/reviewXdmMFom";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewXdmUpdt")
	public String reviewXdmUpdt(ReviewDto reviewDto) {
		reviewService.update(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/review/reviewXdmDete")
	public String reviewXdmDete(ReviewDto reviewDto) {
		reviewService.delete(reviewDto);
		return "redirect:/xdm/v1/infra/review/reviewXdmList";
	}
	@RequestMapping(value ="/usr/v1/infra/review/reviewUsrInst")
	public String reviewUsrInst(ReviewDto reviewDto) {
		reviewService.insert(reviewDto);
		return "redirect:/usr/v1/infra/productUsrDetail/productUsrDetail?pdSeq="+reviewDto.getPdSeq();
	}
	
	@RequestMapping(value = "/usr/v1/infra/review/reviewUsrDete")
	public String reviewUsrDete(ReviewDto reviewDto) {
		reviewService.delete(reviewDto);
		return "redirect:/usr/v1/infra/productUsrDetail/productUsrDetail?pdSeq="+reviewDto.getPdSeq();
	}
	




}
