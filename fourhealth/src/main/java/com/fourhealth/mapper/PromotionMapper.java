package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.NoticePromotionTrainerDto;

@Mapper
public interface PromotionMapper {

	// 로그인된 트레이너의 본인 프로모션 전체 조회
	public List<NoticePromotionTrainerDto> getTrainerMyPromotionAllList(String trainerId);

	// 트레이너 프로모션 입력
	public int promotionInsert(NoticePromotionTrainerDto promotionDto);

	// 트레이너 프로모션 입력 전 체크
	public String promotionCheck(String proId);

	// 트레이너 프로모션 전체리스트
	public List<NoticePromotionTrainerDto> promotionList();

	// 트레이너 프로모션 상세정보
	public NoticePromotionTrainerDto promotionDetail(String proCode);

	// 트레이너 프로모션리스트의 게시글 페이징을 위한 전체 게시글 카운트
	public int getPromotionListCount();

	// 트레이너 프로모션리스트의 게시글 페이징을 위한 스타트페이지및 마지막페이지
	public List<Map<String, Object>> getPromotionListPaging(int startRow, int rowPerPage);

}
