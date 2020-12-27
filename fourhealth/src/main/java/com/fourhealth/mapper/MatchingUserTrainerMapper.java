package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MatchingUserTrainer;
import com.fourhealth.dto.User;

@Mapper
public interface MatchingUserTrainerMapper {
	
	// 내프로모션별 등록 회원리스트
	public List<MatchingUserTrainer> getMatchingUserList(String promotionCode);
	
	public User getUserInfo(String userId);
}
