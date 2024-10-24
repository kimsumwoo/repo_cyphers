package com.loras.infra.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WishListController {
	@Autowired
	public WishListService wishListService;
	
	@RequestMapping(value = "/usr/v1/infra/wish/wishList")
	public String wishList(Model model, WishListDto wishListDto, HttpServletRequest request) {
		wishListDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		model.addAttribute("list", wishListService.selectWishList(wishListDto));
		return "/usr/v1/infra/wish/wishList";
	}
	@RequestMapping(value ="/usr/v1/infra/wish/wishDete")
	public String wishDete(WishListDto wishListDto) {
		wishListService.deleteWish(wishListDto);
		System.out.println(wishListDto.getWhSeq());
		return "redirect:/usr/v1/infra/wish/wishList";
	}

}
