package com.fourhealth.dto;

public class UserReportDto {
	//Field
	
	private int reportUserCode; //사용자 코드
	private String reportTitle; //신고글 제목
	private String trainerUserMatchingCode; // 트레이너 사용자 매칭코드
	private String userId;	//신고글 작성자 아이디
	private String reportUserReasonDetail; // 신고 상세 내용
	private String reportUserRegDate;  // 신고 등록 일자
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserReportDto [reportBoardIdx=");
		builder.append(", reportTitle=");
		builder.append(reportTitle);
		builder.append(", reportUserCode=");
		builder.append(reportUserCode);
		builder.append(", trainerUserMatchingCode=");
		builder.append(trainerUserMatchingCode);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", reportUserReasonDetail=");
		builder.append(reportUserReasonDetail);
		builder.append(", reportUserRegDate=");
		builder.append(reportUserRegDate);
		builder.append("]");
		return builder.toString();
	}
		public String getReportTitle() {
		return reportTitle;
	}
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}
	public int getReportUserCode() {
		return reportUserCode;
	}
	//getter % setter
	public void setReportUserCode(int reportUserCode) {
		this.reportUserCode = reportUserCode;
	}
	public String getTrainerUserMatchingCode() {
		return trainerUserMatchingCode;
	}
	public void setTrainerUserMatchingCode(String trainerUserMatchingCode) {
		this.trainerUserMatchingCode = trainerUserMatchingCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
