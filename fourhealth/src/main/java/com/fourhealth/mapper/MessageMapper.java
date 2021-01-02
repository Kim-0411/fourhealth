package com.fourhealth.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MsgDto;

@Mapper
public interface MessageMapper {
	//트레이너가 회원에게 메시지 보내기.
	public int sendTrainerToUser(MsgDto msg);
	
	//특정회원의 자신이 보낸 메시지 함 (전체)
	public List<MsgDto> getAllSendMessageList(String userId);
	
	//특정회원이 메시지를 보내고 상대가 보기전에 발송 취소(전체)
	public int modifyAllcancelMsg(String msgCode);
	
	//나에게 온 메시지 확인(전체)
	public List<MsgDto> getAllReceiveMessageList(String userId);

}
