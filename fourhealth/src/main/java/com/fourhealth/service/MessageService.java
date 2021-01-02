package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.MsgDto;
import com.fourhealth.mapper.MemberMapper;
import com.fourhealth.mapper.MessageMapper;

import ch.qos.logback.core.db.dialect.MsSQLDialect;


@Transactional
@Service
public class MessageService {
	
	  @Autowired 
	  private MessageMapper messageMapper;
	  @Autowired
	  private MemberMapper memberMapper;
	  
	  MemberDto member;
	  MsgDto msg;
	  
	  //트레이너가 회원에게 메시지 전송할때 (모든 아이디 조회하여 없으면 실패)
	  public String sendTrainerToUser(MsgDto msg) {
		  String result = ""; //성공 실패 여부.
		  int tmp  =-1; //초기값(임의로)
		  
		  
		  List<MemberDto> idList = memberMapper.getAllUserId();
		  //받은 사람 아이디존재 여부 확인 
		  for(int i = 0; i<idList.size(); i++) {
			  member = idList.get(i);
			  if(msg.getReceiveId().equals(member.getMemberId())) {
				  tmp = messageMapper.sendTrainerToUser(msg);
				  break;
			  }
		  }
		  if(tmp >0) {
			  result = "성공";
		  }else {
			  result ="실패";
		  }
		  return result;
	  }
	  
	  ////특정회원의 자신이 보낸 메시지 함 (전체)
	  public List<MsgDto> getAllSendMessageList(String userId){
		
		  List<MsgDto> getAllSendMessageList = messageMapper.getAllSendMessageList(userId);
		  for(int i = 0; i<getAllSendMessageList.size(); i++) {
			 
			  
			  String setTest = "읽지않음";
			  
			  if(getAllSendMessageList.get(i).getMsgReadDate() == null ) {
				  getAllSendMessageList.get(i).setMsgReadDate(setTest);
			  }
		  }
		  
		  return getAllSendMessageList;
	  }
	//트레이너가 메시지 보낸거 발송취소
	  public int modifyAllcancelMsg(String msgCode) {
		  int modifyAllcancelMsg = messageMapper.modifyAllcancelMsg(msgCode);
		  System.out.println(modifyAllcancelMsg);
		  
		  
		  return modifyAllcancelMsg;
	  }
	//트레이너 받은 메시지 관리
	  public List<MsgDto> getAllReceiveMessageList(String userId){
		  List<MsgDto> getAllReceiveMessageList = messageMapper.getAllReceiveMessageList(userId);
		  return getAllReceiveMessageList;
	  }
}
