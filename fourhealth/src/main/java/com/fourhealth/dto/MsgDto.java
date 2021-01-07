package com.fourhealth.dto;


public class MsgDto {

	private String msgCode;							//메시지 관리 코드
	private String sendId;							//송신자 아이디 
	private String receiveId;						//수신자 아이디
	private String msgContents;						//메시지 내용
	private String msgSendCancel;					//발송 취소 여부
	private String msgReadDate;						//읽은 일자
	private String msgSendDate;						//발송 일자
	
	
	public String getMsgCode() {
		return msgCode;
	}
	public String getSendId() {
		return sendId;
	}
	public String getMsgSendCancel() {
		return msgSendCancel;
	}
	public void setMsgSendCancel(String msgSendCancel) {
		this.msgSendCancel = msgSendCancel;
	}
	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
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
		return "MsgDto [msgCode=" + msgCode + ", sendId=" + sendId + ", receiveId=" + receiveId + ", msgContents="
				+ msgContents + ", msgReadDate=" + msgReadDate + ", msgSendDate=" + msgSendDate + ", getMsgCode()="
				+ getMsgCode() + ", getSendId()=" + getSendId() + ", getReceiveId()=" + getReceiveId()
				+ ", getMsgContents()=" + getMsgContents() + ", getMsgReadDate()=" + getMsgReadDate()
				+ ", getMsgSendDate()=" + getMsgSendDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}