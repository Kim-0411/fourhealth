package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.NoticePromotionTrainerDto;

@Mapper
public interface PromotionMapper {
	
	//로그인된 트레이너의 본인 프로모션 전체 조회 
	public List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList(String trainerId);

}
