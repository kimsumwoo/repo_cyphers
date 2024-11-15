package com.loras.infra.codegroup;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

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
	private Integer count;
	private MultipartFile uploadFile;
	private MultipartFile[] uploadFiles;
	private String Seq;
	private Integer type;
	private Integer defaultNy;
	private Integer sort;
	private String path;
	private String originalName;
	private String uuId;
	private String ext;
	private long size;
	private Integer delNy;
	private String pSeq;
	private String regIp;
	private String regSeq;
	private String regDeviceCd;
	private Date regDateTime;
	private Date regDateTimeSvr;

	
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public MultipartFile[] getUploadFiles() {
		return uploadFiles;
	}
	public void setUploadFiles(MultipartFile[] uploadFiles) {
		this.uploadFiles = uploadFiles;
	}
	public String getSeq() {
		return Seq;
	}
	public void setSeq(String seq) {
		Seq = seq;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDefaultNy() {
		return defaultNy;
	}
	public void setDefaultNy(Integer defaultNy) {
		this.defaultNy = defaultNy;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getUuId() {
		return uuId;
	}
	public void setUuId(String uuId) {
		this.uuId = uuId;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	public String getpSeq() {
		return pSeq;
	}
	public void setpSeq(String pSeq) {
		this.pSeq = pSeq;
	}
	public String getRegIp() {
		return regIp;
	}
	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}
	public String getRegSeq() {
		return regSeq;
	}
	public void setRegSeq(String regSeq) {
		this.regSeq = regSeq;
	}
	public String getRegDeviceCd() {
		return regDeviceCd;
	}
	public void setRegDeviceCd(String regDeviceCd) {
		this.regDeviceCd = regDeviceCd;
	}
	public Date getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(Date regDateTime) {
		this.regDateTime = regDateTime;
	}
	public Date getRegDateTimeSvr() {
		return regDateTimeSvr;
	}
	public void setRegDateTimeSvr(Date regDateTimeSvr) {
		this.regDateTimeSvr = regDateTimeSvr;
	}


	
	

	
	
	
	
	
	
	

	
	
	
	
	

}
