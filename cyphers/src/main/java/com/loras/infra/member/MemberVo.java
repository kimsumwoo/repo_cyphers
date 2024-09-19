package com.loras.infra.member;

import java.util.Date;

public class MemberVo {
	private Integer shmmDelNy;
	private Integer shmmUseNy;
	private Integer shOption;
	private String shValue;
	private String shDateStart;
	private String shDateEnd;
	private Integer shOptionDate;
//------------------
	public Integer getShmmDelNy() {
		return shmmDelNy;
	}
	public void setShmmDelNy(Integer shmmDelNy) {
		this.shmmDelNy = shmmDelNy;
	}
	public Integer getShmmUseNy() {
		return shmmUseNy;
	}
	public void setShmmUseNy(Integer shmmUseNy) {
		this.shmmUseNy = shmmUseNy;
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
