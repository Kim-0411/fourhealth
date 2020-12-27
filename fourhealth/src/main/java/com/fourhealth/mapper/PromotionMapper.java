package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.PromotionDTO;

@Mapper
public interface PromotionMapper {
	
	 public int promotionInsert(PromotionDTO promotionDto);
	 public String promotionCheck(String proId);
	 public List<PromotionDTO> promotionList();
	 public PromotionDTO proDetail(String proCode);
}
