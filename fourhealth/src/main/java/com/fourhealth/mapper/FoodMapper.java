package com.fourhealth.mapper;

import com.fourhealth.dto.Food;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper {

	public int insertFood(Food food);
}
