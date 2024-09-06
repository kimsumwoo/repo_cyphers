package com.loras.infra.code;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
public class CodeDto {
	
	private String seq;
	private String cdName;
	private Integer cdUseNy;
	private	String cdTurn;
	private String cdDesc;
	private Integer delNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private	Date cdDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private	Date cdFixDate;
	private String codegroup_seq;
	private String cdseq;
	private String cgName;
//	------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
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
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
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
	public Date getCdDateTime() {
		return cdDateTime;
	}
	public void setCdDateTime(Date cdDateTime) {
		this.cdDateTime = cdDateTime;
	}
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}
	public String getCdseq() {
		return cdseq;
	}
	public void setCdseq(String cdseq) {
		this.cdseq = cdseq;
	}
	
	

	
	
	
}
