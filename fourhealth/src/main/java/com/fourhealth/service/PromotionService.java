package com.fourhealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.mapper.PromotionMapper;

@Transactional
@Service
public class PromotionService {
	
	@Autowired
	private PromotionMapper promotionMapper;
	
	public List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList(String trainerId) {
		
		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionMapper.getTrainerMyPromotionAllList(trainerId);
			
			
		
		return getTrainerMyPromotionAllList;
		
		
	}
	
	

}
