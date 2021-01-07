package com.fourhealth.dto;

import org.springframework.web.multipart.MultipartFile;

public class NoticePromotionTrainerDto {

	private String trainerPromotionNoticeCode; // 트레이너 프로모션 모집 공고 코드
	private String userId; // 회원공통 관리 아이디 (트레이너아이디)
	private String trainerPromotionName; // 트레이너 프로모션 명
	private String trainerPromotionGoal; // 트레이너 프로모션 목표
	private String trainerPromotionShortContents; // 트레이너 프로모션 간략 내용
	private String trainerPromotionDetailsContents; // 트레이너 프로모션 상세내용
	private int trainerPromotionRecruitPeople; // 트레이너 프로모션 모집 인원
	private int trainerPromotionLiveAddPeople; // 트레이너 프로모션 현재 등록 인원
	private int trainerPromotionPrice; // 트레이너 프로모션 가격
	private String trainerPromotionRecruitStartDate; // 트레이너 프로모션 모집 시작일
	private String trainerPromotionRecruitEndDate; // 트레이너 프로모션 모집 종료일
	private String trainerPromotionAttendStartDate; // 트레이너 프로모션 참여 시작 일자
	private String trainerPromotionRecruitCloseDate; // 트레이너 프로모션 참여 마감 일자
	private String trainerPromotionRecruitTotalDate; // 트레이너 프로모션 모집 총일자
	private String trainerMatchingSystemAddDate; // 트레이너 매칭 시스템 등록 일자
	private MultipartFile trainerPromotionBgImage; // 화면에서 사진 가져오는 DTO
	private String proImageUrl; // 디비에 들어가는 DTO

	public MultipartFile getTrainerPromotionBgImage() {
		return trainerPromotionBgImage;
	}

	public void setTrainerPromotionBgImage(MultipartFile trainerPromotionBgImage) {
		this.trainerPromotionBgImage = trainerPromotionBgImage;
	}

	public String getProImageUrl() {
		return proImageUrl;
	}

	public void setProImageUrl(String proImageUrl) {
		this.proImageUrl = proImageUrl;
	}

	public String getTrainerPromotionNoticeCode() {
		return trainerPromotionNoticeCode;
	}

	public void setTrainerPromotionNoticeCode(String trainerPromotionNoticeCode) {
		this.trainerPromotionNoticeCode = trainerPromotionNoticeCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTrainerPromotionName() {
		return trainerPromotionName;
	}

	public void setTrainerPromotionName(String trainerPromotionName) {
		this.trainerPromotionName = trainerPromotionName;
	}

	public String getTrainerPromotionGoal() {
		return trainerPromotionGoal;
	}

	public void setTrainerPromotionGoal(String trainerPromotionGoal) {
		this.trainerPromotionGoal = trainerPromotionGoal;
	}

	public String getTrainerPromotionShortContents() {
		return trainerPromotionShortContents;
	}

	public void setTrainerPromotionShortContents(String trainerPromotionShortContents) {
		this.trainerPromotionShortContents = trainerPromotionShortContents;
	}

	public String getTrainerPromotionDetailsContents() {
		return trainerPromotionDetailsContents;
	}

	public void setTrainerPromotionDetailsContents(String trainerPromotionDetailsContents) {
		this.trainerPromotionDetailsContents = trainerPromotionDetailsContents;
	}

	public int getTrainerPromotionRecruitPeople() {
		return trainerPromotionRecruitPeople;
	}

	public void setTrainerPromotionRecruitPeople(int trainerPromotionRecruitPeople) {
		this.trainerPromotionRecruitPeople = trainerPromotionRecruitPeople;
	}

	public int getTrainerPromotionLiveAddPeople() {
		return trainerPromotionLiveAddPeople;
	}

	public void setTrainerPromotionLiveAddPeople(int trainerPromotionLiveAddPeople) {
		this.trainerPromotionLiveAddPeople = trainerPromotionLiveAddPeople;
	}

	public int getTrainerPromotionPrice() {
		return trainerPromotionPrice;
	}

	public void setTrainerPromotionPrice(int trainerPromotionPrice) {
		this.trainerPromotionPrice = trainerPromotionPrice;
	}

	public String getTrainerPromotionRecruitStartDate() {
		return trainerPromotionRecruitStartDate;
	}

	public void setTrainerPromotionRecruitStartDate(String trainerPromotionRecruitStartDate) {
		this.trainerPromotionRecruitStartDate = trainerPromotionRecruitStartDate;
	}

	public String getTrainerPromotionRecruitEndDate() {
		return trainerPromotionRecruitEndDate;
	}

	public void setTrainerPromotionRecruitEndDate(String trainerPromotionRecruitEndDate) {
		this.trainerPromotionRecruitEndDate = trainerPromotionRecruitEndDate;
	}

	public String getTrainerPromotionAttendStartDate() {
		return trainerPromotionAttendStartDate;
	}

	public void setTrainerPromotionAttendStartDate(String trainerPromotionAttendStartDate) {
		this.trainerPromotionAttendStartDate = trainerPromotionAttendStartDate;
	}

	public String getTrainerPromotionRecruitCloseDate() {
		return trainerPromotionRecruitCloseDate;
	}

	public void setTrainerPromotionRecruitCloseDate(String trainerPromotionRecruitCloseDate) {
		this.trainerPromotionRecruitCloseDate = trainerPromotionRecruitCloseDate;
	}

	public String getTrainerPromotionRecruitTotalDate() {
		return trainerPromotionRecruitTotalDate;
	}

	public void setTrainerPromotionRecruitTotalDate(String trainerPromotionRecruitTotalDate) {
		this.trainerPromotionRecruitTotalDate = trainerPromotionRecruitTotalDate;
	}

	public String getTrainerMatchingSystemAddDate() {
		return trainerMatchingSystemAddDate;
	}

	public void setTrainerMatchingSystemAddDate(String trainerMatchingSystemAddDate) {
		this.trainerMatchingSystemAddDate = trainerMatchingSystemAddDate;
	}

	@Override
	public String toString() {
		return "NoticePromotionTrainerDto [proImageUrl=" + proImageUrl + ", trainerMatchingSystemAddDate="
				+ trainerMatchingSystemAddDate + ", trainerPromotionAttendStartDate=" + trainerPromotionAttendStartDate
				+ ", trainerPromotionBgImage=" + trainerPromotionBgImage + ", trainerPromotionDetailsContents="
				+ trainerPromotionDetailsContents + ", trainerPromotionGoal=" + trainerPromotionGoal
				+ ", trainerPromotionLiveAddPeople=" + trainerPromotionLiveAddPeople + ", trainerPromotionName="
				+ trainerPromotionName + ", trainerPromotionNoticeCode=" + trainerPromotionNoticeCode
				+ ", trainerPromotionPrice=" + trainerPromotionPrice + ", trainerPromotionRecruitCloseDate="
				+ trainerPromotionRecruitCloseDate + ", trainerPromotionRecruitEndDate="
				+ trainerPromotionRecruitEndDate + ", trainerPromotionRecruitPeople=" + trainerPromotionRecruitPeople
				+ ", trainerPromotionRecruitStartDate=" + trainerPromotionRecruitStartDate
				+ ", trainerPromotionRecruitTotalDate=" + trainerPromotionRecruitTotalDate
				+ ", trainerPromotionShortContents=" + trainerPromotionShortContents + ", userId=" + userId + "]";
	}

}