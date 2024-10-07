package com.loras.infra.address;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class addressDto {
	private String adSeq;
	private Integer adDefaultNy;
	private String adZipCode;
	private String ad1;
	private String ad2;
	private Integer adUseNy;
	private Integer adDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date adDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date adFixDate;
	private String member_mmSeq;
	private String adTell;
	private String mmSeq;
	private String adName;
	private String ad3;
	
	//---------------
	
	public String getAdSeq() {
		return adSeq;
	}
	public void setAdSeq(String adSeq) {
		this.adSeq = adSeq;
	}
	public Integer getAdDefaultNy() {
		return adDefaultNy;
	}
	public void setAdDefaultNy(Integer adDefaultNy) {
		this.adDefaultNy = adDefaultNy;
	}
	public String getAdZipCode() {
		return adZipCode;
	}
	public void setAdZipCode(String adZipCode) {
		this.adZipCode = adZipCode;
	}
	public String getAd1() {
		return ad1;
	}
	public void setAd1(String ad1) {
		this.ad1 = ad1;
	}
	public String getAd2() {
		return ad2;
	}
	public void setAd2(String ad2) {
		this.ad2 = ad2;
	}
	public Integer getAdUseNy() {
		return adUseNy;
	}
	public void setAdUseNy(Integer adUseNy) {
		this.adUseNy = adUseNy;
	}
	public Integer getAdDelNy() {
		return adDelNy;
	}
	public void setAdDelNy(Integer adDelNy) {
		this.adDelNy = adDelNy;
	}
	public Date getAdDate() {
		return adDate;
	}
	public void setAdDate(Date adDate) {
		this.adDate = adDate;
	}
	public Date getAdFixDate() {
		return adFixDate;
	}
	public void setAdFixDate(Date adFixDate) {
		this.adFixDate = adFixDate;
	}
	public String getMember_mmSeq() {
		return member_mmSeq;
	}
	public void setMember_mmSeq(String member_mmSeq) {
		this.member_mmSeq = member_mmSeq;
	}
	public String getAdTell() {
		return adTell;
	}
	public void setAdTell(String adTell) {
		this.adTell = adTell;
	}
	public String getMmSeq() {
		return mmSeq;
	}
	public void setMmSeq(String mmSeq) {
		this.mmSeq = mmSeq;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAd3() {
		return ad3;
	}
	public void setAd3(String ad3) {
		this.ad3 = ad3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
