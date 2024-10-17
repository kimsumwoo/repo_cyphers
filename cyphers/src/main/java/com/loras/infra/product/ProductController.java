package com.loras.infra.product;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loras.common.config.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;


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
	public String productUsrGridList(Model model,@ModelAttribute("vo") productVo vo,ProductDto productDto) {
		model.addAttribute("list", productService.productList(vo));
		vo.setParamsPaging(productService.selectOneCount(vo));
		return "/usr/v1/infra/productUsrgrid/productUsrGridList";
	}
//	@RequestMapping(value = "/usr/v1/infra/productUsrgrid/productUsrWishInst")
//	public String productUsrWishInst(ProductDto productDto) {
//		productService.insertWish(productDto);
//		return "redirect:/usr/v1/infra/wish/wishList";
//	}
	
	@ResponseBody
	@RequestMapping(value = "/usr/v1/infra/productUsrgrid/productUsrWishInst", method = RequestMethod.POST)
	public Map<String, Object> productUsrWishInst(@RequestBody ProductDto productDto, HttpSession httpSession) throws Exception {
	    Map<String, Object> returnMap = new HashMap<>();

	    try {
	        int rtMember = productService.insertWish(productDto);

	        // 성공적인 삽입인 경우
	        if (rtMember > 0) {
	            httpSession.setAttribute("sesswish", rtMember);
	            returnMap.put("status", "success");
	            returnMap.put("message", "찜목록에 상품이 추가되었습니다.");
	        } else {
	            returnMap.put("status", "error");
	            returnMap.put("message", "찜목록을 상품 추가에 실패했습니다.");
	        }
	    } catch (Exception e) {
	        returnMap.put("status", "error");
	        returnMap.put("message", "오류가 발생했습니다: " + e.getMessage());
	    }

	    return returnMap;
	}
	@ResponseBody
	@RequestMapping(value = "/usr/v1/infra/productUsrgrid/productUsrGridDete")
	public Map<String, Object> productUsrGridDete(@RequestBody ProductDto productDto, HttpSession httpSession) throws Exception {
	    Map<String, Object> returnMap = new HashMap<>();

	    try {
	        int rtMember = productService.deleteWish(productDto);

	        // 성공적인 삽입인 경우
	        if (rtMember > 0) {
	            httpSession.setAttribute("sesswish", rtMember);
	            returnMap.put("status", "success");
	            returnMap.put("message", "찜목록이 해제 되었습니다.");
	        } else {
	            returnMap.put("status", "error");
	            returnMap.put("message", "찜목록을 해제하지 못했습니다.");
	        }
	    } catch (Exception e) {
	        returnMap.put("status", "error");
	        returnMap.put("message", "오류가 발생했습니다: " + e.getMessage());
	    }

	    return returnMap;
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
	


