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
	
	//	paging
	private int thisPage = 1;								// 현재 페이지
	private int rowNumToShow = 5;								// 화면에 보여줄 데이터 줄 갯수
	private int pageNumToShow = 10;								// 화면에 보여줄 페이징 번호 갯수

	private int totalRows;										// 전체 데이터 갯수
	private int totalPages;										// 전체 페이지 번호
	private int startPage;										// 시작 페이지 번호
	private int endPage;										// 마지막 페이지 번호

	private int startRnumForMysql = 0;							// 쿼리 시작 row
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
	//	paging
	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	public int getRowNumToShow() {
		return rowNumToShow;
	}

	public void setRowNumToShow(int rowNumToShow) {
		this.rowNumToShow = rowNumToShow;
	}

	public int getPageNumToShow() {
		return pageNumToShow;
	}

	public void setPageNumToShow(int pageNumToShow) {
		this.pageNumToShow = pageNumToShow;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartRnumForMysql() {
		return startRnumForMysql;
	}

	public void setStartRnumForMysql(int startRnumForMysql) {
		this.startRnumForMysql = startRnumForMysql;
	}
	
	
public void setParamsPaging(int totalRows) {
		
//		setThisPage(3);

		setTotalRows(totalRows);

		if (getTotalRows() == 0) {
			setTotalPages(1);
		} else {
			setTotalPages(getTotalRows() / getRowNumToShow());
		}

		if (getTotalRows() % getRowNumToShow() > 0) {
			setTotalPages(getTotalPages() + 1);
		}

		if (getTotalPages() < getThisPage()) {
			setThisPage(getTotalPages());
		}
		
		setStartPage(((getThisPage() - 1) / getPageNumToShow()) * getPageNumToShow() + 1);

		setEndPage(getStartPage() + getPageNumToShow() - 1);

		if (getEndPage() > getTotalPages()) {
			setEndPage(getTotalPages());
		}
		
		/*오라클 전용
		 * setEndRnumForOracle((getRowNumToShow() * getThisPage()));
		 * setStartRnumForOracle((getEndRnumForOracle() - getRowNumToShow()) + 1); if
		 * (getStartRnumForOracle() < 1) setStartRnumForOracle(1);
		 */
		
		if (thisPage == 1) {
			setStartRnumForMysql(0);
		} else {
			setStartRnumForMysql((getRowNumToShow() * (getThisPage()-1)));
		}	
		System.out.println("getThisPage() 현재 페이지: "+getThisPage());
		System.out.println("getRowNumToShow() 화면에 보여줄 데이터 줄 갯수: "+getRowNumToShow());
		System.out.println("getPageNumToShow() 화면에 보여줄 페이징 번호 갯수: "+getPageNumToShow());
		System.out.println("getTotalRows() 전체 데이터 갯수: "+getTotalRows());
		System.out.println("getTotalPages() 전체 페이지 번호: "+getTotalPages());
		System.out.println("getStartPage() 시작 페이지 번호: "+getStartPage());
		System.out.println("getEndPage() 마지막 페이지 번호: "+getEndPage());
		System.out.println("getStartRnumForMysql() 쿼리 시작 row: "+getStartRnumForMysql());
	}

	
	

	
	
	
	
	

	
	

	
	
	

}
