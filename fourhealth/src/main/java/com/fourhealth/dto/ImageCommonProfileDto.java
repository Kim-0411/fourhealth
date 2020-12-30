package com.fourhealth.dto;

import java.sql.Blob;

public class ImageCommonProfileDto {

	private String profileCommonImageCode;
	private String userId;
	private Blob profileSImage;
	private Blob profileMImage;
	private Blob profileLImage;
	private String profileImageRegDate;
	public String getProfileCommonImageCode() {
		return profileCommonImageCode;
	}
	public void setProfileCommonImageCode(String profileCommonImageCode) {
		this.profileCommonImageCode = profileCommonImageCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Blob getProfileSImage() {
		return profileSImage;
	}
	public void setProfileSImage(Blob profileSImage) {
		this.profileSImage = profileSImage;
	}
	public Blob getProfileMImage() {
		return profileMImage;
	}
	public void setProfileMImage(Blob profileMImage) {
		this.profileMImage = profileMImage;
	}
	public Blob getProfileLImage() {
		return profileLImage;
	}
	public void setProfileLImage(Blob profileLImage) {
		this.profileLImage = profileLImage;
	}
	public String getProfileImageRegDate() {
		return profileImageRegDate;
	}
	public void setProfileImageRegDate(String profileImageRegDate) {
		this.profileImageRegDate = profileImageRegDate;
	}
	@Override
	public String toString() {
		return "ImageCommonProfileDto [profileCommonImageCode=" + profileCommonImageCode + ", userId=" + userId
				+ ", profileSImage=" + profileSImage + ", profileMImage=" + profileMImage + ", profileLImage="
				+ profileLImage + ", profileImageRegDate=" + profileImageRegDate + "]";
	}
}
