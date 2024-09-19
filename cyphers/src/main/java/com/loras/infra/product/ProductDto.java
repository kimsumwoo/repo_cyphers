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
	
	
	

}
