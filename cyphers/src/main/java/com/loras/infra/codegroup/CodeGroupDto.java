package com.loras.infra.codegroup;

import java.util.Date;

public class CodeGroupDto {
	
	private String seq;
	private String cgName;
	private	Integer cgUseNy;
	private Integer cgTurn;
	private String cgDesc;
	private	Integer delNy;
	private	Date cgDateTime;
	private Date cgFixDate;
	
//	-----
	public Date getCgDateTime() {
		return cgDateTime;
	}
	public void setCgDateTime(Date cgDateTime) {
		this.cgDateTime = cgDateTime;
	}
	

	public String getSeq() {
		return seq;
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
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getUseNy() {
		return cgUseNy;
	}
	public void setUseNy(Integer useNy) {
		this.cgUseNy = useNy;
	}
	
	public String getCgDesc() {
		return cgDesc;
	}
	public void setCgDesc(String cgDesc) {
		this.cgDesc = cgDesc;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public Date getCgFixDate() {
		return cgFixDate;
	}
	public void setCgFixDate(Date cgFixDate) {
		this.cgFixDate = cgFixDate;
	}
	public Integer getCgTurn() {
		return cgTurn;
	}
	public void setCgTurn(Integer cgTurn) {
		this.cgTurn = cgTurn;
	}
	

	
	
	
	
	

}
