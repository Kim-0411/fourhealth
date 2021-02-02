package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.CommonProfileDto;
import com.fourhealth.dto.CommonUserDto;

@Mapper
public interface ProfileMapper {

	CommonProfileDto getProfile(String userId);
}
