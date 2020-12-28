package com.fourhealth.dto;

public class AnswerBoardInquiryUserDto {
	
	private String userInquiryBoardAnswerCode;
	private String userInquiryBoardCategoryCode;
	private String useId;
	private String userInquiryBoardAnswerContents;
	private String userInquiryBoardAnswerRegDate;
	public String getUserInquiryBoardAnswerCode() {
		return userInquiryBoardAnswerCode;
	}
	public void setUserInquiryBoardAnswerCode(String userInquiryBoardAnswerCode) {
		this.userInquiryBoardAnswerCode = userInquiryBoardAnswerCode;
	}
	public String getUserInquiryBoardCategoryCode() {
		return userInquiryBoardCategoryCode;
	}
	public void setUserInquiryBoardCategoryCode(String userInquiryBoardCategoryCode) {
		this.userInquiryBoardCategoryCode = userInquiryBoardCategoryCode;
	}
	public String getUseId() {
		return useId;
	}
	public void setUseId(String useId) {
		this.useId = useId;
	}
	public String getUserInquiryBoardAnswerContents() {
		return userInquiryBoardAnswerContents;
	}
	public void setUserInquiryBoardAnswerContents(String userInquiryBoardAnswerContents) {
		this.userInquiryBoardAnswerContents = userInquiryBoardAnswerContents;
	}
	public String getUserInquiryBoardAnswerRegDate() {
		return userInquiryBoardAnswerRegDate;
	}
	public void setUserInquiryBoardAnswerRegDate(String userInquiryBoardAnswerRegDate) {
		this.userInquiryBoardAnswerRegDate = userInquiryBoardAnswerRegDate;
	}
	@Override
	public String toString() {
		return "AnswerBoardInquiryUserDto [userInquiryBoardAnswerCode=" + userInquiryBoardAnswerCode
				+ ", userInquiryBoardCategoryCode=" + userInquiryBoardCategoryCode + ", useId=" + useId
				+ ", userInquiryBoardAnswerContents=" + userInquiryBoardAnswerContents
				+ ", userInquiryBoardAnswerRegDate=" + userInquiryBoardAnswerRegDate + "]";
	}
}
