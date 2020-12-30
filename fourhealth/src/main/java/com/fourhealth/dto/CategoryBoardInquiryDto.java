package com.fourhealth.dto;

public class CategoryBoardInquiryDto {
	private String inquiryBoardCategoryCode;
	private String userid;
	private String inquiryBoardCategoryName;
	private String inquiryBoardCategoryRegDate;
	public String getInquiryBoardCategoryCode() {
		return inquiryBoardCategoryCode;
	}
	public void setInquiryBoardCategoryCode(String inquiryBoardCategoryCode) {
		this.inquiryBoardCategoryCode = inquiryBoardCategoryCode;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getInquiryBoardCategoryName() {
		return inquiryBoardCategoryName;
	}
	public void setInquiryBoardCategoryName(String inquiryBoardCategoryName) {
		this.inquiryBoardCategoryName = inquiryBoardCategoryName;
	}
	public String getInquiryBoardCategoryRegDate() {
		return inquiryBoardCategoryRegDate;
	}
	public void setInquiryBoardCategoryRegDate(String inquiryBoardCategoryRegDate) {
		this.inquiryBoardCategoryRegDate = inquiryBoardCategoryRegDate;
	}
	@Override
	public String toString() {
		return "CategoryBoardInquiryDto [inquiryBoardCategoryCode=" + inquiryBoardCategoryCode + ", userid=" + userid
				+ ", inquiryBoardCategoryName=" + inquiryBoardCategoryName + ", inquiryBoardCategoryRegDate="
				+ inquiryBoardCategoryRegDate + "]";
	}

}
