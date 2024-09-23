package com.loras.infra.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	public ProductDao productDao;
	
	public List<ProductDto> productList(productVo vo){
		return productDao.productList(vo);
	}
	public int insert(ProductDto productDto) {
		return productDao.insert(productDto);
	}
	public ProductDto SelectOne(ProductDto productDto) {
		return productDao.SelectOne(productDto);
	}
	public int update(ProductDto productDto) {
		return productDao.update(productDto);
	}
	public int delete(ProductDto productDto) {
		return productDao.delete(productDto);
	}
	public int selectOneCount(productVo vo) {
		return productDao.selectOneCount(vo);
	}

}
