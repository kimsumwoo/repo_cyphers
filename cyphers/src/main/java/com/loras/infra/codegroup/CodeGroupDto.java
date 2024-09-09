package com.loras.infra.codegroup;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CodeGroupDto {
	
	private String cgSeq;
	private String cgName;
	private	Integer cgUseNy;
	private Integer cgTurn;
	private String cgDesc;
	private	Integer cgDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private	Date cgDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date cgFixDate;
	//-----------
	public String getCgSeq() {
		return cgSeq;
	}
	public void setCgSeq(String cgSeq) {
		this.cgSeq = cgSeq;
	}
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}
	public Integer getCgUseNy() {
		return cgUseNy;
	}
	public void setCgUseNy(Integer cgUseNy) {
		this.cgUseNy = cgUseNy;
	}
	public Integer getCgTurn() {
		return cgTurn;
	}
	public void setCgTurn(Integer cgTurn) {
		this.cgTurn = cgTurn;
	}
	public String getCgDesc() {
		return cgDesc;
	}
	public void setCgDesc(String cgDesc) {
		this.cgDesc = cgDesc;
	}
	public Integer getCgDelNy() {
		return cgDelNy;
	}
	public void setCgDelNy(Integer cgDelNy) {
		this.cgDelNy = cgDelNy;
	}
	public Date getCgDateTime() {
		return cgDateTime;
	}
	public void setCgDateTime(Date cgDateTime) {
		this.cgDateTime = cgDateTime;
	}
	public Date getCgFixDate() {
		return cgFixDate;
	}
	public void setCgFixDate(Date cgFixDate) {
		this.cgFixDate = cgFixDate;
	}
	
	
	

	
	
	
	
	

}
