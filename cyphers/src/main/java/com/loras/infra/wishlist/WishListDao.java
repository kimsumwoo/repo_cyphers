package com.loras.infra.wishlist;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface WishListDao {
	public List<WishListDto> selectWishList(WishListDto wishListDto);

}
