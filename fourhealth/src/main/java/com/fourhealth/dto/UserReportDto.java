package com.fourhealth.dto;

public class UserReportDto {
	//Field
	private String reportUserCode; //사용자 코드
	private String trainerUserMatchingCode; // 트레이너 사용자 매칭코드
	private String reportCategoriesCode; //신고게시판 카테고리 코드
	private String reportUserReasonDetail; // 유저신고 상세 내용
	private String reportUserRegDate;  // 신고 등록 일자
	public String getReportUserCode() {
		return reportUserCode;
	}
	//toString
	@Override
	public String toString() {
		return "UserReportDto [reportUserCode=" + reportUserCode + ", trainerUserMatchingCode="
				+ trainerUserMatchingCode + ", reportCategoriesCode=" + reportCategoriesCode
				+ ", reportUserReasonDetail=" + reportUserReasonDetail + ", reportUserRegDate=" + reportUserRegDate
				+ "]";
	}
	//getter % setter
	public void setReportUserCode(String reportUserCode) {
		this.reportUserCode = reportUserCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getReportCategoriesCode() {
		return reportCategoriesCode;
	}
	public void setReportCategoriesCode(String reportCategoriesCode) {
		this.reportCategoriesCode = reportCategoriesCode;
	}
	public String getReportUserReasonDetail() {
		return reportUserReasonDetail;
	}
	public void setReportUserReasonDetail(String reportUserReasonDetail) {
		this.reportUserReasonDetail = reportUserReasonDetail;
	}
	public String getReportUserRegDate() {
		return reportUserRegDate;
	}
	public void setReportUserRegDate(String reportUserRegDate) {
		this.reportUserRegDate = reportUserRegDate;
	}

}
