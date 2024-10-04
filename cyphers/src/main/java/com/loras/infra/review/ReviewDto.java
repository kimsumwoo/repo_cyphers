package com.loras.infra.review;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ReviewDto {
	private String rvSeq;
	private Integer rvRank;
	private String rvComment;
	private Integer rvUseNy;
	private Integer rvDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvFixDate;
	private String product_pdSeq;
	private String member_mmSeq;
	private String pdNickName;
//	---------------------------
	public String getRvSeq() {
		return rvSeq;
	}
	public void setRvSeq(String rvSeq) {
		this.rvSeq = rvSeq;
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
	public Integer getRvUseNy() {
		return rvUseNy;
	}
	public void setRvUseNy(Integer rvUseNy) {
		this.rvUseNy = rvUseNy;
	}
	public Integer getRvDelNy() {
		return rvDelNy;
	}
	public void setRvDelNy(Integer rvDelNy) {
		this.rvDelNy = rvDelNy;
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
	public String getPdNickName() {
		return pdNickName;
	}
	public void setPdNickName(String pdNickName) {
		this.pdNickName = pdNickName;
	}
	
	

	
	
	
	
	
	
	

}
