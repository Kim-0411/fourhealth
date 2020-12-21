package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourhealth.dto.NoticePromotionTrainer;
import com.fourhealth.mapper.NoticePromotionTrainerMapper;

@Service
public class NoticePromotionTrainerService {
	@Autowired
	private NoticePromotionTrainerMapper noticePromotionTrainer;
	
	public List<NoticePromotionTrainer> getMyPromotionList(String trainerId){
		List<NoticePromotionTrainer> myPromotionList = noticePromotionTrainer.getMyMemberList(trainerId);
		return myPromotionList;
	}

}
