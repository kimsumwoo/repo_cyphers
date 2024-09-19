package com.loras.infra.product;

public class productVo {
	private Integer shpdDelNy;
	private Integer shpdUseNy;
	private Integer shOption;
	private String shValue;
	private Integer shOptionDate;
	private String shDateStart;
	private String shDateEnd;
	//---------------------------
	public Integer getShpdDelNy() {
		return shpdDelNy;
	}
	public void setShpdDelNy(Integer shpdDelNy) {
		this.shpdDelNy = shpdDelNy;
	}
	public Integer getShpdUseNy() {
		return shpdUseNy;
	}
	public void setShpdUseNy(Integer shpdUseNy) {
		this.shpdUseNy = shpdUseNy;
	}
	public Integer getShOption() {
		return shOption;
	}
	public void setShOption(Integer shOption) {
		this.shOption = shOption;
	}
	public String getShValue() {
		return shValue;
	}
	public void setShValue(String shValue) {
		this.shValue = shValue;
	}
	public Integer getShOptionDate() {
		return shOptionDate;
	}
	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}
	public String getShDateStart() {
		return shDateStart;
	}
	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart + " 00:00:00";
	}
	public String getShDateEnd() {
		return shDateEnd;
	}
	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd + " 23:59:59";
	}
	
	


	
	
	
	
	

}
