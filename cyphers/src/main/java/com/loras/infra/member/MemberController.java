package com.loras.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.loras.common.config.util.UtilDateTime;
import com.loras.infra.codegroup.CodeGroupDto;


@Controller
public class MemberController {
	@Autowired
	public MemberService memberService;
	@RequestMapping(value ="/xdm/v1/infra/member/memberList")
		public String memberList(Model model,@ModelAttribute("vo") MemberVo vo) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(memberService.selectOneCount(vo));
		model.addAttribute("list", memberService.memberSelectList(vo));
		return "/xdm/v1/infra/member/memberList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberForm")
		public String memberForm() {
		return "/xdm/v1/infra/member/memberForm";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberInst")
		public String memberInst(MemberDto memberDto) {
			memberService.insert(memberDto);
		return "redirect:/xdm/v1/infra/member/memberList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberMFom")
	public String memberMFom(MemberDto memberDto, Model model) {
		model.addAttribute("item",memberService.selectOne(memberDto));
	return "/xdm/v1/infra/member/memberMFom";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberUpdt")
	public String memberUpdt(MemberDto memberDto) {
		memberService.update(memberDto);
		return "redirect:/xdm/v1/infra/member/memberList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberDete")
	public String memberDete(MemberDto memberDto) {
		memberService.delete(memberDto);
		return "redirect:/xdm/v1/infra/member/memberList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberSignUp")
	public String memberSignUp() {
		return "/xdm/v1/infra/member/memberSignUp";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberlogIn")
	public String memberlogIn() {
		return "/xdm/v1/infra/member/memberlogIn";
	}

}
	
	
	
	
	


