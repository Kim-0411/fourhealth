package com.fourhealth.mapper;

/*
 * SNS 관련
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.SnsUserDto;

@Mapper
public interface SnsMapper {

	String insertComment = null;

	List<SnsUserDto> getSnsList();

	int snsInsert(SnsUserDto snsUserDto);

	public int getSnsListCount();

	public List<Map<String, Object>> getSnsListPaging(int startRow, int rowPerPage);
}