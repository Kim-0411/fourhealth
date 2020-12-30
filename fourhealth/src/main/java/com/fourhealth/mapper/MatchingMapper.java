package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MatchingUserTrainerDto;

@Mapper
public interface MatchingMapper {
	
	//프로모션 별 매칭된 유저전체
	public List<MatchingUserTrainerDto> getTrainerMatchingUserList(String promotionCode);
	
	
	
	

}
