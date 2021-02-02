package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CommonUserDto;

@Mapper
public interface CommonUserMapper {

	CommonUserDto getPrivateProfile(String userId);
	
	int modifyPrivateProfile(CommonUserDto commonUserDto);
}
