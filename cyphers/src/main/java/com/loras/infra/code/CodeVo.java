package com.loras.infra.code;

public class CodeVo {
	private Integer shcdDelNy;
	private Integer shcdUseNy;
	private String shValue;
	private Integer shOption;
	private String shDateStart;
	private String shDateEnd;
	private Integer shOptionDate;
	//--------
	public Integer getShcdDelNy() {
		return shcdDelNy;
	}
	public void setShcdDelNy(Integer shcdDelNy) {
		this.shcdDelNy = shcdDelNy;
	}
	public Integer getShcdUseNy() {
		return shcdUseNy;
	}
	public void setShcdUseNy(Integer shcdUseNy) {
		this.shcdUseNy = shcdUseNy;
	}
	public String getShValue() {
		return shValue;
	}
	public void setShValue(String shValue) {
		this.shValue = shValue;
	}
	public Integer getShOption() {
		return shOption;
	}
	public void setShOption(Integer shOption) {
		this.shOption = shOption;
	}
	public String getShDateStart() {
		return shDateStart + " 00:00:00";
	}
	public void setShDateStart(String shDateStart) {
		this.shDateStart = shDateStart;
	}
	public String getShDateEnd() {
		return shDateEnd + " 23:59:59";
	}
	public void setShDateEnd(String shDateEnd) {
		this.shDateEnd = shDateEnd;
	}
	public Integer getShOptionDate() {
		return shOptionDate;
	}
	public void setShOptionDate(Integer shOptionDate) {
		this.shOptionDate = shOptionDate;
	}
	
	
	
	
	
	
	

}
