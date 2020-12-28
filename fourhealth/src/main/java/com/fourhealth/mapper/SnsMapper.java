package com.fourhealth.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.SnsUserDto;

@Mapper
public interface SnsMapper {
	int addSns(SnsUserDto snsuserdto);
}
