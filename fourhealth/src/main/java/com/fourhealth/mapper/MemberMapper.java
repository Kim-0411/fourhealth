package com.fourhealth.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.dto.TrainerDto;
import com.fourhealth.dto.UserDto;

@Mapper
public interface MemberMapper {

	// // 관리자 단 회원 리스트에서 삭제 (메세지-외래키)
	// int removeMasterMsg(String membeId);

	// // 관리자 단 회원 리스트에서 삭제
	// int removeMasterMember(String memberId);

	// // 관리자 단 회원 리스트에서 삭제
	// int removeMemberById(String memberId);

	// 관리자 단에서 사용자, 트레이너 리스트에서 수정
	int modifyMasterAll(MemberDto memberDto);

	// 관리자 단에서 전체 회원리스트에서 수정
	int modifyMasterMember(MemberDto memberDto);

	// 관리자 승인 되지않은 트레이너 조회
	public List<TrainerDto> viewAccessTrainerList();

	// 관리자 단에서 사용자, 트레이너 조회
	public List<MemberDto> viewUserList(String memberLevel);

	// 관리자 단에서 전체 회원 조회
	public List<MemberDto> viewMember();

	// 로그인 처리, 사용자 및 트레이너 수정 페이지 이동
	public MemberDto getMemberById(String memberId);

	// 회원 가입시 중복 체크
	public int userIdCheck(String userId);

	// 회원가입
	public int addMember(MemberDto member);

	// 내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	public UserDto getTrainerMyMatchingUserInfo(String userId);

	// 쪽지 보낼때 아이디가 있나 없나 유효성 겁사(전체)
	public List<MemberDto> getAllUserId();

	public  MemberDto getMemberSelect(String userId);

	// 비번 찾기
	public String find_pw(String email);

	// 비밀번호 메일 보내기전 임시 번호로 변경
	public int rePw(MemberDto member);

}
