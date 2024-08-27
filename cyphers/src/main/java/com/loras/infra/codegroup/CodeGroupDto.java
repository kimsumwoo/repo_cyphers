package com.loras.infra.codegroup;

public class CodeGroupDto {
	
	private String seq;
	private String cgName;
	private	Integer cgUseNy;
	private	String cgTurn;
	private String cgDesc;
	private	Integer delNy;
	private	String cgDateTime;
	private String cgFixDate;
//	-----
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
	public String getCgTurn() {
		return cgTurn;
	}
	public void setCgTurn(String cgTurn) {
		this.cgTurn = cgTurn;
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
	public String getCgDateTime() {
		return cgDateTime;
	}
	public void setCgDateTime(String cgDateTime) {
		this.cgDateTime = cgDateTime;
	}
	public String getCgFixDate() {
		return cgFixDate;
	}
	public void setCgFixDate(String cgFixDate) {
		this.cgFixDate = cgFixDate;
	}
	
	
	
	

}
