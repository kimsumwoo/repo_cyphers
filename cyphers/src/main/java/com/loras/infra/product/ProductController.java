package com.loras.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;


@Controller
public class ProductController {
	@Autowired
	public ProductService productService;
	
//	사용자
	@RequestMapping(value = "/xdm/v1/infra/product/productList")
		public String productList(Model model,@ModelAttribute("vo") productVo vo) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(productService.selectOneCount(vo));
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
	
//	유저
	@RequestMapping(value ="/usr/v1/infra/productUsrgrid/productUsrGridList")
	public String productUsrGridList(Model model,@ModelAttribute("vo") productVo vo) {
		model.addAttribute("list", productService.productList(vo));
		vo.setParamsPaging(productService.selectOneCount(vo));
		return "/usr/v1/infra/productUsrgrid/productUsrGridList";
	}
	@RequestMapping(value ="/usr/v1/infra/productUsrDetail/productUsrDetail")
	public String productUsrDetail(Model model,ProductDto productDto) {
		model.addAttribute("item", productService.SelectOne(productDto));
		return "/usr/v1/infra/productUsrDetail/productUsrDetail";
	}
	
	

}
	


