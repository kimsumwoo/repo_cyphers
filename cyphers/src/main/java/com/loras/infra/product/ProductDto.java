package com.loras.infra.product;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductDto {
	private String pdSeq;
	private String pdName;
	private String pdPrice;
	private Integer pdUseNy;
	private Integer pdDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pdDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pdFixDate;
	private String pdDesc;
	private String pdType;
	private String pdMeat;
	private String revSeq;
	private Integer rvRank;
	private String rvComment;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvFixDate;
	private String product_pdSeq;
	private String member_mmSeq;
	private String mmSeq;
	private String mmRealName;
	private String mmNickName;
	
//--------------------------
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
	public Integer getPdUseNy() {
		return pdUseNy;
	}
	public void setPdUseNy(Integer pdUseNy) {
		this.pdUseNy = pdUseNy;
	}
	public Integer getPdDelNy() {
		return pdDelNy;
	}
	public void setPdDelNy(Integer pdDelNy) {
		this.pdDelNy = pdDelNy;
	}
	public Date getPdDate() {
		return pdDate;
	}
	public void setPdDate(Date pdDate) {
		this.pdDate = pdDate;
	}
	public Date getPdFixDate() {
		return pdFixDate;
	}
	public void setPdFixDate(Date pdFixDate) {
		this.pdFixDate = pdFixDate;
	}
	public String getPdDesc() {
		return pdDesc;
	}
	public void setPdDesc(String pdDesc) {
		this.pdDesc = pdDesc;
	}
	public String getPdType() {
		return pdType;
	}
	public void setPdType(String pdType) {
		this.pdType = pdType;
	}
	public String getPdMeat() {
		return pdMeat;
	}
	public void setPdMeat(String pdMeat) {
		this.pdMeat = pdMeat;
	}
	public String getRevSeq() {
		return revSeq;
	}
	public void setRevSeq(String revSeq) {
		this.revSeq = revSeq;
	}
	public Integer getRvRank() {
		return rvRank;
	}
	public void setRvRank(Integer rvRank) {
		this.rvRank = rvRank;
	}
	public String getRvComment() {
		return rvComment;
	}
	public void setRvComment(String rvComment) {
		this.rvComment = rvComment;
	}
	public Date getRvDate() {
		return rvDate;
	}
	public void setRvDate(Date rvDate) {
		this.rvDate = rvDate;
	}
	public Date getRvFixDate() {
		return rvFixDate;
	}
	public void setRvFixDate(Date rvFixDate) {
		this.rvFixDate = rvFixDate;
	}
	public String getProduct_pdSeq() {
		return product_pdSeq;
	}
	public void setProduct_pdSeq(String product_pdSeq) {
		this.product_pdSeq = product_pdSeq;
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
	public String getMmNickName() {
		return mmNickName;
	}
	public void setMmNickName(String mmNickName) {
		this.mmNickName = mmNickName;
	}
	
	
	
	
	
	
	

}
