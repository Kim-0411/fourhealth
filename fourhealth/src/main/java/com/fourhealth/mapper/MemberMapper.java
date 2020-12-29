package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.UserDto;

@Mapper
public interface MemberMapper {

	// 내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	 public UserDto getTrainerMyMatchingUserInfo(String userId); 



}
