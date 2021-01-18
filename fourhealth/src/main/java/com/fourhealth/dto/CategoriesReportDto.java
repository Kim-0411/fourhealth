package com.fourhealth.dto;

public class CategoriesReportDto {
	private String reportCategoriesCode;
	private String reportCategoriesContents;
	private String reportCategoriesRegDate;
	public String getReportCategoriesCode() {
		return reportCategoriesCode;
	}
	public void setReportCategoriesCode(String reportCategoriesCode) {
		this.reportCategoriesCode = reportCategoriesCode;
	}
	public String getReportCategoriesContents() {
		return reportCategoriesContents;
	}
	public void setReportCategoriesContents(String reportCategoriesContents) {
		this.reportCategoriesContents = reportCategoriesContents;
	}
	public String getReportCategoriesRegDate() {
		return reportCategoriesRegDate;
	}
	public void setReportCategoriesRegDate(String reportCategoriesRegDate) {
		this.reportCategoriesRegDate = reportCategoriesRegDate;
	}
	@Override
	public String toString() {
		return "CategoriesReportDto [reportCategoriesCode=" + reportCategoriesCode + ", reportCategoriesContents="
				+ reportCategoriesContents + ", reportCategoriesRegDate=" + reportCategoriesRegDate + "]";
	}

}
