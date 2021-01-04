package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import com.fourhealth.dto.Food;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodMapper {
	public int insertFood(Food food);

	public int getFoodListCount();

	public  List<Map<String, Object>> getFoodListBoard(int startRow, int rowPerPage);


	//Food List 
	public List<Food> getFoodList();

	//public int insertFood2(Map<String, String> data);

	//get Map tpye Object
	public int insertFoodMapInformation(Map<String, Object> data);

	//get List type Object
	public int insertFoodListInformation(List<Map<String, Object>> data);


}
