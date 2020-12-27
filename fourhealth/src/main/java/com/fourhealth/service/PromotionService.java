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

	// 프로모션 입력전 체크 처리
	public String promotionCheck(String proId) {
		System.out.println(proId);
		String a = promotionMapper.promotionCheck(proId);

		return a;
	}

	// 프로모션 입력 처리
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

	// 프로모션 전체리스트 처리
	public List<PromotionDTO> promotionList() {
		List<PromotionDTO> promotionList = promotionMapper.promotionList();
		for (int i = 0; i < promotionList.size(); i++) {
			String imgUrl = promotionList.get(i).getProImageUrl();
			promotionList.get(i).setProImageUrl("image/" + imgUrl);
		}
		return promotionList;
	}

	// 프로모션 상세정보 처리
	public PromotionDTO proDetail(String proCode) {
		PromotionDTO promotionDTO = promotionMapper.proDetail(proCode);
		String imgUrl = promotionDTO.getProImageUrl();
		promotionDTO.setProImageUrl("image/" + imgUrl);
		return promotionDTO;
	}
}
