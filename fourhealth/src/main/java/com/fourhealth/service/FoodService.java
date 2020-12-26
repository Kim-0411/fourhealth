package com.fourhealth.service;

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
			int result = foodMapper.insertFood1(food);
			if (result > 0) {
				foodChecker = "Insert food data successed!";

			}

		}
		return foodChecker;
	}

	public void addFood1(Map<String, String> data) {

		System.out.println("Mapping data input");
		foodMapper.insertFood2(data);
		 if (data != null) {
		 	int result = foodMapper.insertFood2(data);
		 	if (result > 0) {
		 		System.out.println("Insert food data successed!");
		 	}
		 	else{
		 		System.out.println("Insert food data failed!");
		 	}

		 }
		
	}

}
