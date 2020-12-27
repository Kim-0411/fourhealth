package com.fourhealth.mapper;

import java.util.Map;

import com.fourhealth.dto.Food;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper {
	public int insertFood1(Food food);

	// public int insertFood2(Map<String, String> data);
	public int insertFood2(Map<String, String> data);

}
