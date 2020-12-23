package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.MemberDTO;


@Mapper
public interface MemberMapper {
	
	public MemberDTO getMember(String userId);
}
