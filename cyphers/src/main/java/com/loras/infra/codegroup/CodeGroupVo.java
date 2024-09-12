package com.loras.infra.codegroup;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CodeGroupVo {
	private Integer shcgDelNy;
	private Integer shcgUseNy;
	private Integer shOption;
	private String shValue;
	private String shDateStart;
	private String shDateEnd;
	private Integer shOptionDate;
	//---------

	public Integer getShcgDelNy() {
		return shcgDelNy;
	}

	public void setShcgDelNy(Integer shcgDelNy) {
		this.shcgDelNy = shcgDelNy;
	}

	public Integer getShcgUseNy() {
		return shcgUseNy;
	}

	public void setShcgUseNy(Integer shcgUseNy) {
		this.shcgUseNy = shcgUseNy;
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
