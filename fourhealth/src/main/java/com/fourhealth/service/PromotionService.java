package com.fourhealth.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.PromotionDTO;
import com.fourhealth.mapper.PromotionMapper;


@Service
@Transactional
public class PromotionService {
	
	 @Autowired
	    private PromotionMapper promotionMapper;
	 
	 public String promotionCheck(String userId) {
	        String a = promotionMapper.promotionCheck(userId);
	        return a;
	    }
	 
	 
	 public String promotionInsert(PromotionDTO promotionDto) {
	        int a = promotionMapper.promotionInsert(promotionDto);

	        String re = null;
	        if (a > 0) {
	            re = "등록성공";
	        } else {
	            re = "등록실패";
	        }

	        return re;
	    }
	 
	 public List<PromotionDTO> promotionList(){
		 List<PromotionDTO> promotionList = promotionMapper.promotionList();
		 for(int i=0; i<promotionList.size(); i++) {
			String imgUrl = promotionList.get(i).getProImageUrl();
			promotionList.get(i).setProImageUrl("image/"+imgUrl);
		 }
		 return promotionList;
	 }

	 
}
