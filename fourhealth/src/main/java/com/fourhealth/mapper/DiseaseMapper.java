package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.DiseaseDto;

@Mapper
public interface DiseaseMapper {

	//질병 디비 가져오기
	public List<DiseaseDto> getDiseaseAllList();
	
}
