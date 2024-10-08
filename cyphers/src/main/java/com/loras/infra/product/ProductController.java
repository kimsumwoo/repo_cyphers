package com.loras.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpServerErrorException;

import com.loras.common.config.util.UtilDateTime;
import com.loras.infra.review.ReviewDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;


@Controller
public class ProductController {
	@Autowired
	public ProductService productService;
	
//	사용자
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmList")
		public String productXdmList(Model model,@ModelAttribute("vo") productVo vo) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(productService.selectOneCount(vo));
		model.addAttribute("list",productService.productList(vo));
		return "/xdm/v1/infra/product/productXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmForm")
	public String productXdmForm() {
		return "/xdm/v1/infra/product/productXdmForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmInst")
	public String productXdmInst(ProductDto productDto) {
		productService.insert(productDto);
		return "redirect:/xdm/v1/infra/product/productXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmMFom")
	public String productXdmMFom(ProductDto productDto,Model model) {
		model.addAttribute("item",productService.SelectOne(productDto));
		return "/xdm/v1/infra/product/productXdmMFom";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmUpdt")
	public String productXdmUpdt(ProductDto productDto) {
		productService.update(productDto);
		return "redirect:/xdm/v1/infra/product/productXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/product/productXdmDete")
	public String productXdmDete(ProductDto productDto) {
		productService.delete(productDto);
		return "redirect:/xdm/v1/infra/product/productXdmList";
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
		System.out.println(productDto.getPdSeq());
		model.addAttribute("item", productService.SelectOne(productDto));
		model.addAttribute("list", productService.rvSelectList(productDto));
		return "/usr/v1/infra/productUsrDetail/productUsrDetail";
	}
	/*
	  @RequestMapping(value = "/usr/v1/infra/productUsrDetail/productUsrInst")
	  public String productUsrInst(ProductDto productDto) {
	  productService.rvInsert(productDto); return
	  "redirect:/usr/v1/infra/productUsrDetail/productUsrDetail?pdSeq=" +
	  productDto.getProduct_pdSeq(); }
	 */


	

}
	


