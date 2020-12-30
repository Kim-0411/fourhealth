package com.fourhealth.dto;

import java.util.List;

public class MsgDto {

	private String msgCode;							//메시지 관리 코드
	private String userId;							//사용자 아이디
	private String TrainerId;						//트레이너 아이디
	private String msgBoomerangCode;				//수신 및 발신 구분코드 
	private String msgContents;						//메시지 내용
	private String msgReadDate;						//읽은 일자
	private String msgSendDate;						//발송 일자
	
	private List<MatchingUserTrainerDto> matchingUserTrainer;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerId() {
		return TrainerId;
	}
	public void setTrainerId(String trainerId) {
		TrainerId = trainerId;
	}
	public List<MatchingUserTrainerDto> getMatchingUserTrainer() {
		return matchingUserTrainer;
	}
	public void setMatchingUserTrainer(List<MatchingUserTrainerDto> matchingUserTrainer) {
		this.matchingUserTrainer = matchingUserTrainer;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	
	public String getMsgBoomerangCode() {
		return msgBoomerangCode;
	}
	public void setMsgBoomerangCode(String msgBoomerangCode) {
		this.msgBoomerangCode = msgBoomerangCode;
	}
	public String getMsgContents() {
		return msgContents;
	}
	public void setMsgContents(String msgContents) {
		this.msgContents = msgContents;
	}
	public String getMsgReadDate() {
		return msgReadDate;
	}
	public void setMsgReadDate(String msgReadDate) {
		this.msgReadDate = msgReadDate;
	}
	public String getMsgSendDate() {
		return msgSendDate;
	}
	public void setMsgSendDate(String msgSendDate) {
		this.msgSendDate = msgSendDate;
	}
	@Override
	public String toString() {
		return "MsgDto [msgCode=" + msgCode + ", userId=" + userId + ", TrainerId=" + TrainerId + ", msgBoomerangCode="
				+ msgBoomerangCode + ", msgContents=" + msgContents + ", msgReadDate=" + msgReadDate + ", msgSendDate="
				+ msgSendDate + ", matchingUserTrainer=" + matchingUserTrainer + ", getUserId()=" + getUserId()
				+ ", getTrainerId()=" + getTrainerId() + ", getMatchingUserTrainer()=" + getMatchingUserTrainer()
				+ ", getMsgCode()=" + getMsgCode() + ", getMsgBoomerangCode()=" + getMsgBoomerangCode()
				+ ", getMsgContents()=" + getMsgContents() + ", getMsgReadDate()=" + getMsgReadDate()
				+ ", getMsgSendDate()=" + getMsgSendDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}