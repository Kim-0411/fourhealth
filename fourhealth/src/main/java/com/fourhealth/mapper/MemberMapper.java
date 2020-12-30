package com.fourhealth.mapper;

/*
 * 회원가입, 로그인, 사용자/트레이너 정보 수정, 프로필, 공통 데이터 , 사용자/트레이너 정보 공개 관리, 등등....
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.dto.UserDto;

@Mapper
public interface MemberMapper {
	//관리자 단에서 전체 회원 조회
	public List<CommonUserDto> viewMember();
	//로그인 처리
	public CommonUserDto getMemberById(String userId);
	//회원 가입시 중복 체크 
	public int memberIdCheck(String userId);
	//회원가입
	public int addMember(CommonUserDto user);
	//로그인된(트레이너) 내 프로모션 전체 조회(이부분 화면 구성 부터 필요)
	public List<NoticePromotionTrainerDto> trainerGetMyPromotionList(String trainerId);

	/*
	 * // 내프로모션별 등록 회원리스트 (트레이너) public List<MatchingUserTrainerDto>
	 * trainerGetMatchingUserList(String promotionCode);
	 */
	
	// 내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	public UserDto trainerGetMatchingUserInfo(String userId);






}
