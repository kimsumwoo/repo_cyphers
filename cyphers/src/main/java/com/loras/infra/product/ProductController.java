package com.loras.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	@Autowired
	public ProductService productService;
	
	@RequestMapping(value = "/xdm/v1/infra/product/productList")
		public String productList(Model model,productVo vo) {
		model.addAttribute("list",productService.productList(vo));
		return "/xdm/v1/infra/product/productList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productForm")
	public String productForm() {
		return "/xdm/v1/infra/product/productForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productInst")
	public String productInst(ProductDto productDto) {
		productService.insert(productDto);
		return "redirect:/xdm/v1/infra/product/productList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productMFom")
	public String productMFom(ProductDto productDto,Model model) {
		model.addAttribute("item",productService.SelectOne(productDto));
		return "/xdm/v1/infra/product/productMFom";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productUpdt")
	public String productUpdt(ProductDto productDto) {
		productService.update(productDto);
		return "redirect:/xdm/v1/infra/product/productList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productDete")
	public String productDete(ProductDto productDto) {
		productService.delete(productDto);
		return "redirect:/xdm/v1/infra/product/productList";
	}
	
	

}
	

