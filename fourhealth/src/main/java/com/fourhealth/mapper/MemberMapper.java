package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MemberDTO;

@Mapper
public interface MemberMapper {

	// 로그인을 하기위한 사용자 정보 DB정보
	public MemberDTO getMember(String userId);
}
