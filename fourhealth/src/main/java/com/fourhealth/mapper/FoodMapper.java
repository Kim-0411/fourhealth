package com.fourhealth.mapper;

/*
 * 음식(관리자, 트레이너, 사용자)
 */

import java.util.Map;

import com.fourhealth.dto.Food;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper {
	public int insertFood1(Food food);

	// public int insertFood2(Map<String, String> data);
	public int insertFood2(Map<String, String> data);

}
