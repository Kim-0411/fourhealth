package com.fourhealth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fourhealth.dto.Food;
import com.fourhealth.mapper.FoodMapper;

import org.springframework.beans.factory.annotation.Autowired;

public class FoodService {
	@Autowired
	private FoodMapper foodMapper;

	// Food Input Service
	public String addFood(Food food) {
		String foodChecker = "Insert food data failed!";
		if (food != null) {
			// result 처리
			int result = foodMapper.insertFood(food);
			if (result > 0) {
				foodChecker = "Insert food data successed!";

			}

		}
		return foodChecker;
	}

	//insert food information <List>
	//later, have to choose using service or not

	public String addFood1(List<Map<String, Object>> data) {
		//System.out.println("받아온 데이터 표시");
		String resultStr = null;
		if (data != null) {
			int result = foodMapper.insertFoodListInformation(data);
			if (result > 0) {
				resultStr="Insert food data successed!";
			} else {
				resultStr="Insert food data failed!";
			}
		}
		return resultStr;
	}
}
