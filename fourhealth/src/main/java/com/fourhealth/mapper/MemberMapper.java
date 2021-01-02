package com.fourhealth.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MatchingUserTrainerDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;

@Mapper
public interface MemberMapper {

	//관리자 단에서 회원 삭제
	int deleteMember(String memberId);
	//관리자 단에서 전체 회원 조회
	public List<MemberDto> viewMember();
	//로그인 처리
	public MemberDto getMemberById(String memberId);
	//회원 가입시 중복 체크 
	public int userIdCheck(String userId);

	//회원가입
	public int addMember(MemberDto member);

	//로그인된(트레이너) 내 프로모션 전체 조회(이부분 화면 구성 부터 필요)
	public List<NoticePromotionTrainerDto> trainerGetMyPromotionList(String trainerId);

	/*
	 * // 내프로모션별 등록 회원리스트 (트레이너) public List<MatchingUserTrainerDto>
	 * trainerGetMatchingUserList(String promotionCode);
	 */
	// 내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	public UserDto trainerGetMatchingUserInfo(String userId);






}
