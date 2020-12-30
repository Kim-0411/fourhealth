package com.fourhealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MsgDto;
import com.fourhealth.mapper.MessageMapper;


@Transactional
@Service
public class MessageService {
	
	
	  @Autowired private MessageMapper messageMapper;
	  //고민좀
	  public String sendTrainerSelectPromotionMember(MsgDto msg) {
		  String result = "";
		  int tmp = messageMapper.addTrainerSelectPromotionAllMessage(msg);
		  if(tmp >0) {
			  result = "성공";
		  }else {
			  result ="실패";
		  }
		  return result;
	  }
	 
	

}
