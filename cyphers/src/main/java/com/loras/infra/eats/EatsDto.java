package com.loras.infra.eats;

import java.util.Date;

public class EatsDto {
	private String seq;
	private String type;
	private String name;
	private String timeStart;
	private String timeEnd;
	private String number;
	private String site;
	private Integer pakingNy;
	private Integer bookingNy;
	private Integer freecallNy;
	private String eatsDesc;
	private Date date;
	private Date fixDate;
//	------
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Integer getPakingNy() {
		return pakingNy;
	}
	public void setPakingNy(Integer pakingNy) {
		this.pakingNy = pakingNy;
	}
	public Integer getBookingNy() {
		return bookingNy;
	}
	public void setBookingNy(Integer bookingNy) {
		this.bookingNy = bookingNy;
	}
	public Integer getFreecallNy() {
		return freecallNy;
	}
	public void setFreecallNy(Integer freecallNy) {
		this.freecallNy = freecallNy;
	}
	public String getEatsDesc() {
		return eatsDesc;
	}
	public void setEatsDesc(String eatsDesc) {
		this.eatsDesc = eatsDesc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getFixDate() {
		return fixDate;
	}
	public void setFixDate(Date fixDate) {
		this.fixDate = fixDate;
	}
	
	

}
