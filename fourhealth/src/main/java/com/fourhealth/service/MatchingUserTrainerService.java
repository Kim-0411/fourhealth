package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainer;
import com.fourhealth.dto.User;
import com.fourhealth.mapper.MatchingUserTrainerMapper;

@Service
@Transactional
public class MatchingUserTrainerService {
	
	@Autowired
	private MatchingUserTrainerMapper matchingUserTrainerMapper;
	
	public List<MatchingUserTrainer> getMatchingUserList(String promotionCode){
		List<MatchingUserTrainer> getMatchingUserList = matchingUserTrainerMapper.getMatchingUserList(promotionCode);
		
		return getMatchingUserList;
	}
	//시간별 나랑 매칭된 사람 칼로리 계산해주기위해 가져와야할 정보
	public User getUserInfo(String userId) {
		
		User user = matchingUserTrainerMapper.getUserInfo(userId);
		return user;
	}

}
