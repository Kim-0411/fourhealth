package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.GradePlatformUserDto;
import com.fourhealth.dto.UserDto;


@Mapper
public interface UserMapper {
	
	//로그인 후 메인화면 단에서 사용자 플랫폼 레벨 체크
	GradePlatformUserDto getUserGrade(String memberId);
	
	//회원가입 시 공통테이블과 회원테이블에 데이터 생성
	public int addMemberUserPlatFormGradeCode(UserDto userdto);

}
