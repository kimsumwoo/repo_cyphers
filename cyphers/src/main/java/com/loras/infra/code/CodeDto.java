package com.loras.infra.code;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
public class CodeDto {
	
	private String cdSeq;
	private String cdName;
	private Integer cdUseNy;
	private	String cdTurn;
	private String cdDesc;
	private Integer cdDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private	Date cdDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private	Date cdFixDate;
	private String codegroup_seq;
	private String cgName;
	private String cgSeq;
	
	
//	------
	public String getCdSeq() {
		return cdSeq;
	}
	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public Integer getCdUseNy() {
		return cdUseNy;
	}
	public void setCdUseNy(Integer cdUseNy) {
		this.cdUseNy = cdUseNy;
	}
	public String getCdTurn() {
		return cdTurn;
	}
	public void setCdTurn(String cdTurn) {
		this.cdTurn = cdTurn;
	}
	public String getCdDesc() {
		return cdDesc;
	}
	public void setCdDesc(String cdDesc) {
		this.cdDesc = cdDesc;
	}
	public Integer getCdDelNy() {
		return cdDelNy;
	}
	public void setCdDelNy(Integer cdDelNy) {
		this.cdDelNy = cdDelNy;
	}
	public Date getCdDateTime() {
		return cdDateTime;
	}
	public void setCdDateTime(Date cdDateTime) {
		this.cdDateTime = cdDateTime;
	}
	public Date getCdFixDate() {
		return cdFixDate;
	}
	public void setCdFixDate(Date cdFixDate) {
		this.cdFixDate = cdFixDate;
	}
	public String getCodegroup_seq() {
		return codegroup_seq;
	}
	public void setCodegroup_seq(String codegroup_seq) {
		this.codegroup_seq = codegroup_seq;
	}
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}
	public String getCgSeq() {
		return cgSeq;
	}
	public void setCgSeq(String cgSeq) {
		this.cgSeq = cgSeq;
	}


	

	
	
	
}
