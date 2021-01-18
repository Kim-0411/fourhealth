package com.fourhealth.mapper;

import java.util.List;

/*
 * 트레이너 가입 승인, 회원 공통권한별 레벨, 사용자 플랫폼 공통 관리 코드, 등등....
 */

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.UserReportDto;

@Mapper
public interface MasterMapper {

	public List<UserReportDto> reportList();
	
}
