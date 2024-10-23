package com.loras.infra.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.loras.infra.wishlist.WishListDto;

@Repository
public interface ProductDao {
	public List<ProductDto> productList(productVo vo);
	public int insert(ProductDto productDto);
	public ProductDto SelectOne(ProductDto productDto);
	public int update(ProductDto productDto);
	public int delete(ProductDto productDto);
	public int selectOneCount(productVo vo);
	public List<ProductDto> rvSelectList(ProductDto productDto);
	public int rvInsert(ProductDto productDto);
	public int insertWish(ProductDto productDto);
	public int deleteWish(ProductDto productDto);
	
}
