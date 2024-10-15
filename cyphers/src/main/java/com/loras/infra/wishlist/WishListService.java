package com.loras.infra.wishlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListService {
	@Autowired
	public WishListDao wishListDao;
	
	public List<WishListDto> selectWishList(WishListDto wishListDto){
		return wishListDao.selectWishList(wishListDto);
	}

}
