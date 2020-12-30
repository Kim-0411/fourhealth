package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

public class CategoryBoardInquiryUserDto {
	private String userInquiryBoardCategoryCode;
	private String userId;
	private String inquiryBoardCategoryCode;
	private String userInquiryBoardCategoryName;
	private String userInquiryBoardCategoryContents;
	private MultipartFile userInquiryBoardCategoryUploadFile;
	private String userInquiryBoardCategoryRegDate;
	public String getUserInquiryBoardCategoryCode() {
		return userInquiryBoardCategoryCode;
	}
	public void setUserInquiryBoardCategoryCode(String userInquiryBoardCategoryCode) {
		this.userInquiryBoardCategoryCode = userInquiryBoardCategoryCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getInquiryBoardCategoryCode() {
		return inquiryBoardCategoryCode;
	}
	public void setInquiryBoardCategoryCode(String inquiryBoardCategoryCode) {
		this.inquiryBoardCategoryCode = inquiryBoardCategoryCode;
	}
	public String getUserInquiryBoardCategoryName() {
		return userInquiryBoardCategoryName;
	}
	public void setUserInquiryBoardCategoryName(String userInquiryBoardCategoryName) {
		this.userInquiryBoardCategoryName = userInquiryBoardCategoryName;
	}
	public String getUserInquiryBoardCategoryContents() {
		return userInquiryBoardCategoryContents;
	}
	public void setUserInquiryBoardCategoryContents(String userInquiryBoardCategoryContents) {
		this.userInquiryBoardCategoryContents = userInquiryBoardCategoryContents;
	}
	public MultipartFile getUserInquiryBoardCategoryUploadFile() {
		return userInquiryBoardCategoryUploadFile;
	}
	public void setUserInquiryBoardCategoryUploadFile(MultipartFile userInquiryBoardCategoryUploadFile) {
		this.userInquiryBoardCategoryUploadFile = userInquiryBoardCategoryUploadFile;
	}
	public String getUserInquiryBoardCategoryRegDate() {
		return userInquiryBoardCategoryRegDate;
	}
	public void setUserInquiryBoardCategoryRegDate(String userInquiryBoardCategoryRegDate) {
		this.userInquiryBoardCategoryRegDate = userInquiryBoardCategoryRegDate;
	}
	@Override
	public String toString() {
		return "CategoryBoardInquiryUserDto [userInquiryBoardCategoryCode=" + userInquiryBoardCategoryCode + ", userId="
				+ userId + ", inquiryBoardCategoryCode=" + inquiryBoardCategoryCode + ", userInquiryBoardCategoryName="
				+ userInquiryBoardCategoryName + ", userInquiryBoardCategoryContents="
				+ userInquiryBoardCategoryContents + ", userInquiryBoardCategoryUploadFile="
				+ userInquiryBoardCategoryUploadFile + ", userInquiryBoardCategoryRegDate="
				+ userInquiryBoardCategoryRegDate + "]";
	}
	

}
