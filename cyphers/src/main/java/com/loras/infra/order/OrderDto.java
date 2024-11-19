package com.loras.infra.order;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderDto {
	private String odSeq;
	private Integer odSituation;
	private Integer odUseNy;
	private Integer odDelNy;
	@DateTimeFormat(pattern = "yyyy년 MM월 dd일")
	private Date odDate;
	@DateTimeFormat(pattern = "yyyy년 MM월 dd일")
	private Date odFixDate;
	private String product_pdSeq;
	private String address_adSeq;
	private String member_mmSeq;
	private String mmSeq;
	private String mmRealName;
	private String adSeq;
	private String adName;
	private String adTell;
	private String adZipCode;
	private String ad1;
	private String ad2;
	private String ad3;
	private String pdSeq;
	private String pdName;
	private String pdPrice;
	private String path;
	
//	-------------------------
	
	public String getOdSeq() {
		return odSeq;
	}
	public void setOdSeq(String odSeq) {
		this.odSeq = odSeq;
	}
	public Integer getOdSituation() {
		return odSituation;
	}
	public void setOdSituation(Integer odSituation) {
		this.odSituation = odSituation;
	}
	public Integer getOdUseNy() {
		return odUseNy;
	}
	public void setOdUseNy(Integer odUseNy) {
		this.odUseNy = odUseNy;
	}
	public Integer getOdDelNy() {
		return odDelNy;
	}
	public void setOdDelNy(Integer odDelNy) {
		this.odDelNy = odDelNy;
	}
	public Date getOdDate() {
		return odDate;
	}
	public void setOdDate(Date odDate) {
		this.odDate = odDate;
	}
	public Date getOdFixDate() {
		return odFixDate;
	}
	public void setOdFixDate(Date odFixDate) {
		this.odFixDate = odFixDate;
	}
	public String getProduct_pdSeq() {
		return product_pdSeq;
	}
	public void setProduct_pdSeq(String product_pdSeq) {
		this.product_pdSeq = product_pdSeq;
	}
	public String getAddress_adSeq() {
		return address_adSeq;
	}
	public void setAddress_adSeq(String address_adSeq) {
		this.address_adSeq = address_adSeq;
	}
	public String getMember_mmSeq() {
		return member_mmSeq;
	}
	public void setMember_mmSeq(String member_mmSeq) {
		this.member_mmSeq = member_mmSeq;
	}
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
	public String getAdSeq() {
		return adSeq;
	}
	public void setAdSeq(String adSeq) {
		this.adSeq = adSeq;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdTell() {
		return adTell;
	}
	public void setAdTell(String adTell) {
		this.adTell = adTell;
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
	public String getAd3() {
		return ad3;
	}
	public void setAd3(String ad3) {
		this.ad3 = ad3;
	}
	public String getPdSeq() {
		return pdSeq;
	}
	public void setPdSeq(String pdSeq) {
		this.pdSeq = pdSeq;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String getPdPrice() {
		return pdPrice;
	}
	public void setPdPrice(String pdPrice) {
		this.pdPrice = pdPrice;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

	
	
	
	
	
	
	
}
