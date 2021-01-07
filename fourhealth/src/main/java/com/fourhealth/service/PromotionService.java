
package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList = promotionMapper
				.getTrainerMyPromotionAllList(trainerId);

		return getTrainerMyPromotionAllList;

	}

	// 프로모션 입력전 체크 처리
	public String promotionCheck(String proId) {
		System.out.println(proId);
		String a = promotionMapper.promotionCheck(proId);

		return a;
	}

	// 프로모션 입력 처리
	public String promotionInsert(NoticePromotionTrainerDto promotionDto) {
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
	// public List<NoticePromotionTrainerDto> promotionList() {
	// List<NoticePromotionTrainerDto> promotionList =
	// promotionMapper.promotionList();
	// for (int i = 0; i < promotionList.size(); i++) {
	// String imgUrl = promotionList.get(i).getProImageUrl();
	// promotionList.get(i).setProImageUrl("image/" + imgUrl);
	// }
	// return promotionList;
	// }

	// 프로모션 상세정보 처리
	public NoticePromotionTrainerDto promotionDetail(String proCode) {
		NoticePromotionTrainerDto promotionDTO = promotionMapper.promotionDetail(proCode);
		String imgUrl = promotionDTO.getProImageUrl();
		promotionDTO.setProImageUrl("image/" + imgUrl);
		return promotionDTO;
	}

	// 프로모션 페이징 처리
	public Map<String, Object> getPromotionListPaging(int currentPage) {
		int startRow = 0;
		int rowPerPage = 12;
		int startPageNum = 1;

		// last 페이지 구하기
		double count = promotionMapper.getPromotionListCount();
		int lastPage = (int) Math.ceil(count / rowPerPage);

		int endPageNum = lastPage;

		// 페이지 알고리즘
		startRow = (currentPage - 1) * rowPerPage;

		List<Map<String, Object>> promotionList = promotionMapper.getPromotionListPaging(startRow, rowPerPage);

		if (currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;

			if (endPageNum >= lastPage) {
				startPageNum = (lastPage - 9);
				endPageNum = lastPage;
			}
		}

		System.out.println(lastPage);
		System.out.println(endPageNum);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("lastPage", lastPage);
		resultMap.put("promotionList", promotionList);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);

		System.out.println(resultMap + "--------->getPromotionListPaging");

		return resultMap;
	}

}
