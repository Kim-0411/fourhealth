package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import com.fourhealth.dto.MemberDto;

@Mapper
public interface MemberMapper {

	// 로그인 처리
	public MemberDto getMemberById(String memberId);

	// 관리자 단에서 전체 회원 조회
	public List<MemberDto> viewMember();

}
