package com.loras.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loras.common.config.util.UtilDateTime;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class MemberController {
	@Autowired
	public MemberService memberService;

	
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmList")
		public String memberXdmList(Model model,@ModelAttribute("vo") MemberVo vo) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(memberService.selectOneCount(vo));
		model.addAttribute("list", memberService.memberSelectList(vo));
		return "/xdm/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmForm")
		public String memberForm() {
		return "/xdm/v1/infra/member/memberXdmForm";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmInst")
		public String memberXdmInst(MemberDto memberDto) {
			memberService.insert(memberDto);
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmMFom")
	public String memberXdmMFom(MemberDto memberDto, Model model) {
		model.addAttribute("item",memberService.selectOne(memberDto));
	return "/xdm/v1/infra/member/memberXdmMFom";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmUpdt")
	public String memberXdmUpdt(MemberDto memberDto) {
		memberService.update(memberDto);
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value ="/xdm/v1/infra/member/memberXdmDete")
	public String memberXdmDete(MemberDto memberDto) {
		memberService.delete(memberDto);
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
//	유저정보폼
	@RequestMapping(value = "/usr/v1/infra/editmember/editMemberForm")
	public String editMemberForm(Model model, MemberDto memberDto, HttpServletRequest request) {
		memberDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		model.addAttribute("item", memberService.selectOneFixUsr(memberDto));
		return "/usr/v1/infra/editmember/editMemberForm";
	}
//	유저정보수정
	@RequestMapping(value ="/usr/v1/infra/editMember/updateFixUsr")
	public String updateFixUsr(MemberDto memberDto, HttpServletRequest request) {
		memberDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		memberService.updateFixUsr(memberDto);
		return "redirect:/usr/v1/infra/editmember/editMemberForm";
	}
//	유저비밀번호수정
	@RequestMapping(value = "/usr/v1/infra/editMember/updateFixPasswd")
	public String updateFixPasswd(MemberDto memberDto, HttpServletRequest request) {
		memberDto.setMmPasswd(encodeBcrypt(memberDto.getMmPasswd(), 10));
		memberDto.setMmSeq((String) request.getSession().getAttribute("sessSeqUsr"));
		memberService.updateFixPasswd(memberDto);
		return "redirect:/usr/v1/infra/editmember/editMemberForm";
	}
	
	public String encodeBcrypt(String planeText, int strength) {
		  return new BCryptPasswordEncoder(strength).encode(planeText);
	}

			
	public boolean matchesBcrypt(String planeText, String hashValue, int strength) {
	  BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
	  return passwordEncoder.matches(planeText, hashValue);
	}	

	

}
	
	
	
	
	


