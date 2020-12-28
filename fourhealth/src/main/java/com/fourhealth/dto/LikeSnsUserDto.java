package com.fourhealth.dto;

public class LikeSnsUserDto {

	private String userSnsLikeCode;
	private String userSnsCommentCode;
	private String userId;
	private int userSnsLikeCount;
	private String userSnsCommentRegDate;
	public String getUserSnsLikeCode() {
		return userSnsLikeCode;
	}
	public void setUserSnsLikeCode(String userSnsLikeCode) {
		this.userSnsLikeCode = userSnsLikeCode;
	}
	public String getUserSnsCommentCode() {
		return userSnsCommentCode;
	}
	public void setUserSnsCommentCode(String userSnsCommentCode) {
		this.userSnsCommentCode = userSnsCommentCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getUserSnsLikeCount() {
		return userSnsLikeCount;
	}
	public void setUserSnsLikeCount(int userSnsLikeCount) {
		this.userSnsLikeCount = userSnsLikeCount;
	}
	public String getUserSnsCommentRegDate() {
		return userSnsCommentRegDate;
	}
	public void setUserSnsCommentRegDate(String userSnsCommentRegDate) {
		this.userSnsCommentRegDate = userSnsCommentRegDate;
	}
	@Override
	public String toString() {
		return "LikeSnsUserDto [userSnsLikeCode=" + userSnsLikeCode + ", userSnsCommentCode=" + userSnsCommentCode
				+ ", userId=" + userId + ", userSnsLikeCount=" + userSnsLikeCount + ", userSnsCommentRegDate="
				+ userSnsCommentRegDate + "]";
	}
}
