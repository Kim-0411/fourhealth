package com.fourhealth.dto;

public class CommentSnsUserDto {
	private String userSnsCommentCode;
	private String userSnsCode;
	private String userId;
	private String userSnsCommentContents;
	private String userSnsCommentRegDate;
	public String getUserSnsCommentCode() {
		return userSnsCommentCode;
	}
	public void setUserSnsCommentCode(String userSnsCommentCode) {
		this.userSnsCommentCode = userSnsCommentCode;
	}
	public String getUserSnsCode() {
		return userSnsCode;
	}
	public void setUserSnsCode(String userSnsCode) {
		this.userSnsCode = userSnsCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserSnsCommentContents() {
		return userSnsCommentContents;
	}
	public void setUserSnsCommentContents(String userSnsCommentContents) {
		this.userSnsCommentContents = userSnsCommentContents;
	}
	public String getUserSnsCommentRegDate() {
		return userSnsCommentRegDate;
	}
	public void setUserSnsCommentRegDate(String userSnsCommentRegDate) {
		this.userSnsCommentRegDate = userSnsCommentRegDate;
	}
	@Override
	public String toString() {
		return "CommentSnsUserDto [userSnsCommentCode=" + userSnsCommentCode + ", userSnsCode=" + userSnsCode
				+ ", userId=" + userId + ", userSnsCommentContents=" + userSnsCommentContents
				+ ", userSnsCommentRegDate=" + userSnsCommentRegDate + "]";
	}
	
}
