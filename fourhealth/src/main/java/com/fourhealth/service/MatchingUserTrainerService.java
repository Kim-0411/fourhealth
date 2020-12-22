package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.MatchingUserTrainer;
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

}
