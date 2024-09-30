package com.loras.infra.member;

import java.net.Inet4Address;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MemberDto {
	private String mmSeq;
	private String mmRealName;	
	private String mmNickName;
	private String mmEmail;
	private String mmTell;
	private String mmBirthDay;
	private Integer mmDelNy;
	private Integer mmUseNy;
	private String mmGender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date mmDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date mmFixDate;
	private String mmDesc;
	private String mmId;
	private String mmPasswd;
//	--------------------
	
	public String getMmSeq() {
		return mmSeq;
	}
	public void setMmSeq(String mmSeq) {
		this.mmSeq = mmSeq;
	}
	public String getMmRealName() {
		return mmRealName;
	}
	public void setMmRealName(String mmRealName) {
		this.mmRealName = mmRealName;
	}
	public String getMmNickName() {
		return mmNickName;
	}
	public void setMmNickName(String mmNickName) {
		this.mmNickName = mmNickName;
	}
	public String getMmEmail() {
		return mmEmail;
	}
	public void setMmEmail(String mmEmail) {
		this.mmEmail = mmEmail;
	}
	public String getMmTell() {
		return mmTell;
	}
	public void setMmTell(String mmTell) {
		this.mmTell = mmTell;
	}
	public String getMmBirthDay() {
		return mmBirthDay;
	}
	public void setMmBirthDay(String mmBirthDay) {
		this.mmBirthDay = mmBirthDay;
	}
	public Integer getMmDelNy() {
		return mmDelNy;
	}
	public void setMmDelNy(Integer mmDelNy) {
		this.mmDelNy = mmDelNy;
	}
	public Integer getMmUseNy() {
		return mmUseNy;
	}
	public void setMmUseNy(Integer mmUseNy) {
		this.mmUseNy = mmUseNy;
	}
	public Date getMmDate() {
		return mmDate;
	}
	public void setMmDate(Date mmDate) {
		this.mmDate = mmDate;
	}
	public Date getMmFixDate() {
		return mmFixDate;
	}
	public void setMmFixDate(Date mmFixDate) {
		this.mmFixDate = mmFixDate;
	}
	public String getMmDesc() {
		return mmDesc;
	}
	public void setMmDesc(String mmDesc) {
		this.mmDesc = mmDesc;
	}
	public String getMmGender() {
		return mmGender;
	}
	public void setMmGender(String mmGender) {
		this.mmGender = mmGender;
	}
	public String getMmId() {
		return mmId;
	}
	public void setMmId(String mmId) {
		this.mmId = mmId;
	}
	public String getMmPasswd() {
		return mmPasswd;
	}
	public void setMmPasswd(String mmPasswd) {
		this.mmPasswd = mmPasswd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
