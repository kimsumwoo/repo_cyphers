package com.loras.infra.product;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
	private String pdSeq;
	private String pdName;
	private String pdPrice;
	private Integer pdUseNy;
	private Integer pdDelNy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pdDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pdFixDate;
	private String pdDesc;
	private String pdType;
	private String pdMeat;
	private String rvSeq;
	private Integer rvRank;
	private String rvComment;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rvFixDate;
	private String product_pdSeq;
	private String member_mmSeq;
	private String mmSeq;
	private String mmRealName;
	private String mmNickName;
	private String whSeq;
	private Integer whWishNy;
	private Integer whUseNy;
	private Integer whDelNy;
	private Integer whDate;
	private Integer whFixDate;
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
	private String regDeviceCd;
	private Date regDate;
	private Date modDate;
	
//--------------------------
	public String getPdSeq() {
		return pdSeq;
	}
	public void setPdSeq(String pdSeq) {
		this.pdSeq = pdSeq;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String getPdPrice() {
		return pdPrice;
	}
	public void setPdPrice(String pdPrice) {
		this.pdPrice = pdPrice;
	}
	public Integer getPdUseNy() {
		return pdUseNy;
	}
	public void setPdUseNy(Integer pdUseNy) {
		this.pdUseNy = pdUseNy;
	}
	public Integer getPdDelNy() {
		return pdDelNy;
	}
	public void setPdDelNy(Integer pdDelNy) {
		this.pdDelNy = pdDelNy;
	}
	public Date getPdDate() {
		return pdDate;
	}
	public void setPdDate(Date pdDate) {
		this.pdDate = pdDate;
	}
	public Date getPdFixDate() {
		return pdFixDate;
	}
	public void setPdFixDate(Date pdFixDate) {
		this.pdFixDate = pdFixDate;
	}
	public String getPdDesc() {
		return pdDesc;
	}
	public void setPdDesc(String pdDesc) {
		this.pdDesc = pdDesc;
	}
	public String getPdType() {
		return pdType;
	}
	public void setPdType(String pdType) {
		this.pdType = pdType;
	}
	public String getPdMeat() {
		return pdMeat;
	}
	public void setPdMeat(String pdMeat) {
		this.pdMeat = pdMeat;
	}
	
	public String getRvSeq() {
		return rvSeq;
	}
	public void setRvSeq(String rvSeq) {
		this.rvSeq = rvSeq;
	}
	public Integer getRvRank() {
		return rvRank;
	}
	public void setRvRank(Integer rvRank) {
		this.rvRank = rvRank;
	}
	public String getRvComment() {
		return rvComment;
	}
	public void setRvComment(String rvComment) {
		this.rvComment = rvComment;
	}
	public Date getRvDate() {
		return rvDate;
	}
	public void setRvDate(Date rvDate) {
		this.rvDate = rvDate;
	}
	public Date getRvFixDate() {
		return rvFixDate;
	}
	public void setRvFixDate(Date rvFixDate) {
		this.rvFixDate = rvFixDate;
	}
	public String getProduct_pdSeq() {
		return product_pdSeq;
	}
	public void setProduct_pdSeq(String product_pdSeq) {
		this.product_pdSeq = product_pdSeq;
	}
	public String getMember_mmSeq() {
		return member_mmSeq;
	}
	public void setMember_mmSeq(String member_mmSeq) {
		this.member_mmSeq = member_mmSeq;
	}
	public String getMmSeq() {
		return mmSeq;
	}
	public void setMmSeq(String mmSeq) {
		this.mmSeq = mmSeq;
	}
	public String getMmRealName() {
		return mmRealName;
	}
	public void setMmRealName(String mmRealName) {
		this.mmRealName = mmRealName;
	}
	public String getMmNickName() {
		return mmNickName;
	}
	public void setMmNickName(String mmNickName) {
		this.mmNickName = mmNickName;
	}
	public String getWhSeq() {
		return whSeq;
	}
	public void setWhSeq(String whSeq) {
		this.whSeq = whSeq;
	}
	public Integer getWhWishNy() {
		return whWishNy;
	}
	public void setWhWishNy(Integer whWishNy) {
		this.whWishNy = whWishNy;
	}
	public Integer getWhUseNy() {
		return whUseNy;
	}
	public void setWhUseNy(Integer whUseNy) {
		this.whUseNy = whUseNy;
	}
	public Integer getWhDelNy() {
		return whDelNy;
	}
	public void setWhDelNy(Integer whDelNy) {
		this.whDelNy = whDelNy;
	}
	public Integer getWhDate() {
		return whDate;
	}
	public void setWhDate(Integer whDate) {
		this.whDate = whDate;
	}
	public Integer getWhFixDate() {
		return whFixDate;
	}
	public void setWhFixDate(Integer whFixDate) {
		this.whFixDate = whFixDate;
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
	
	public String getRegDeviceCd() {
		return regDeviceCd;
	}
	public void setRegDeviceCd(String regDeviceCd) {
		this.regDeviceCd = regDeviceCd;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	
	
	
	
	
	
	
	
	
	
	

}
