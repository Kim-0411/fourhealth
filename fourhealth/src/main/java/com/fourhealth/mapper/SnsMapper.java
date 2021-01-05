package com.fourhealth.mapper;

/*
 * SNS 관련
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.SnsUserDto;

@Mapper
public interface SnsMapper {

	List<SnsUserDto> getSnsList();

	 int snsInsert(SnsUserDto snsUserDto); 

}
