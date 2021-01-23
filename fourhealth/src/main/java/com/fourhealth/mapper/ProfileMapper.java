package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CommonProfileDto;

@Mapper
public interface ProfileMapper {

	List<CommonProfileDto> getTrainerProfile();

}
