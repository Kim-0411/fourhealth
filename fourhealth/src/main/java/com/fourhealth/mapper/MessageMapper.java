package com.fourhealth.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MsgDto;

@Mapper
public interface MessageMapper {
	//고민좀..
	//트레이너가 만들어놓은 프로모션중 하나의 프로모션에 등록되에 있는 회원에게 전체 메시지 보내는 메서드
	public int addTrainerSelectPromotionAllMessage(MsgDto msg);

}
