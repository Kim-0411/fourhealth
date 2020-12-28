package com.fourhealth.dto;

public class MsgDto {

	private String msgCode;
	private String userId;
	private String trainerId;
	private String msgBoomerangCode;
	private String msgContents;
	private String msgReadDate;
	private String msgSendDate;
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
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
		return "MsgDto [msgCode=" + msgCode + ", userId=" + userId + ", trainerId=" + trainerId + ", msgBoomerangCode="
				+ msgBoomerangCode + ", msgContents=" + msgContents + ", msgReadDate=" + msgReadDate + ", msgSendDate="
				+ msgSendDate + "]";
	}
	
}
