package com.fourhealth.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.NoticePromotionTrainer;

@Mapper
public interface NoticePromotionTrainerMapper {
	//로그인된(트레이너) 내 프로모션 전체 조회
	public List<NoticePromotionTrainer> getMyMemberList(String trainerId);

}
