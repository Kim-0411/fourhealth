package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.mapper.MatchingMapper;

@Service
@Transactional
public class MatchingService {

	@Autowired
	private MatchingMapper matchingMapper;

	// 트레이너가 자신의 프로모션중 관리할 프로모션에 접근시 등록된 사용자들 목록조회
	public List<MatchingUserTrainerDto> getTrainerMatchingUserList(String promotionCode) {
		List<MatchingUserTrainerDto> getTrainerMatchingUserList = matchingMapper
				.getTrainerMatchingUserList(promotionCode);
		return getTrainerMatchingUserList;
	}

}
