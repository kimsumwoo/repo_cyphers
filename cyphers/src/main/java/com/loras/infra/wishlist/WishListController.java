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
		model.addAttribute("list", wishListService.selectWishList(wishListDto));
		return "/usr/v1/infra/wish/wishList";
	}

}
