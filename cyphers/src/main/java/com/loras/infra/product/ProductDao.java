package com.loras.infra.product;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao {
	public List<ProductDto> productList(productVo vo);
	public int insert(ProductDto productDto);
	public ProductDto SelectOne(ProductDto productDto);
	public int update(ProductDto productDto);
	public int delete(ProductDto productDto);
	public int selectOneCount(productVo vo);

}
