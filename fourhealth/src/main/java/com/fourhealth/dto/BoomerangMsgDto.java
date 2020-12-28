package com.fourhealth.dto;

public class BoomerangMsgDto {
	private String msgBoomerangCode;
	private String msgBoomerangStatus;
	private String msgBoomerangRegDate;
	public String getMsgBoomerangCode() {
		return msgBoomerangCode;
	}
	public void setMsgBoomerangCode(String msgBoomerangCode) {
		this.msgBoomerangCode = msgBoomerangCode;
	}
	public String getMsgBoomerangStatus() {
		return msgBoomerangStatus;
	}
	public void setMsgBoomerangStatus(String msgBoomerangStatus) {
		this.msgBoomerangStatus = msgBoomerangStatus;
	}
	public String getMsgBoomerangRegDate() {
		return msgBoomerangRegDate;
	}
	public void setMsgBoomerangRegDate(String msgBoomerangRegDate) {
		this.msgBoomerangRegDate = msgBoomerangRegDate;
	}
	@Override
	public String toString() {
		return "BoomerangMsgDto [msgBoomerangCode=" + msgBoomerangCode + ", msgBoomerangStatus=" + msgBoomerangStatus
				+ ", msgBoomerangRegDate=" + msgBoomerangRegDate + "]";
	}

}