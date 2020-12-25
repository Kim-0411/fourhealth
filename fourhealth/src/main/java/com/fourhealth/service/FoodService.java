package com.fourhealth.service;

import com.fourhealth.dto.Food;

public class FoodService {

	// Food Input Service
	public String addFood(Food food) {
		String foodChecker = "Insert food data failed!";
		if (food != null) {
			// result 처리
			int result = 0;
			if (result > 0) {
				foodChecker = "Insert food data successed!";

			}

		}
		return foodChecker;
	}
}
