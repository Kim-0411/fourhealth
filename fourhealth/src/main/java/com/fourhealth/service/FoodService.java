package com.fourhealth.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fourhealth.dto.Food;
import com.fourhealth.mapper.FoodMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoodService {
	@Autowired
	private FoodMapper foodMapper;

	public Map<String, Object> getSearchMainFoodList(String foodName, String foodGroup, int currentPage){
		int startRow = 0;
		int rowPerPage = 30;
		int startPageNum = 1;
		
		double count = 0;

		// last 페이지 구하기
		

		if(foodGroup.equals("전체")){
			count = foodMapper.getFoodListCount();
		}else{
			count = foodMapper.getAllSearchLastFoodList(foodName, foodGroup);
		}
		int lastPage = (int) Math.ceil(count / rowPerPage);

		System.out.println("#########################################");
		System.out.println(count);

		int endPageNum = lastPage;

		// 페이지 알고리즘
		startRow = (currentPage - 1) * rowPerPage;
		// String stRow = String.valueOf(startRow);
		// String rowPage = String.valueOf(rowPerPage);
		List<Map<String, Object>> foodList = foodMapper.getAllSearchFoodList(foodName, foodGroup, startRow, rowPerPage);

		for(int i=0; i<foodList.size(); i++){
			System.out.println("#######");
			System.out.println(foodList.get(i).get("food_name"));
		}

		if (currentPage > 6) {
			startPageNum = currentPage - 5;
			endPageNum = currentPage + 4;

			if (endPageNum >= lastPage) {
				startPageNum = (lastPage - 9);
				endPageNum = lastPage;
			}
		}

		System.out.println(lastPage);
		System.out.println(endPageNum);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("foodList", foodList);
		resultMap.put("lastPage", lastPage);
		resultMap.put("currentPage", currentPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);

		System.out.println(resultMap + "--------->test foodList page List");

		return resultMap;
	}

	//Food List on limit table
	public Map<String, Object> getFoosList(int currentPage){
		int startRow = 0;
		int rowPerPage = 40;
		int startPageNum = 1;
		int endPageNum = 15;

		//Mapper call area(foodList count)
		double count = foodMapper.getFoodListCount();
		int lastPage = (int)Math.ceil(count/rowPerPage);
		

		startRow = (currentPage - 1)*rowPerPage;
		
		System.out.println("#######################################");
		System.out.println("Test printout total db numbers : "+count);
		System.out.println("Test printout total startRow : "+startRow);
		

		//Mapper call area(using foodList number)
		List<Map<String, Object>> foodList = foodMapper.getFoodListBoard(startRow, rowPerPage);

		System.out.println("Test printout foodList : "+foodList);




		if(currentPage > 10){
			startPageNum = currentPage-5;
			endPageNum = currentPage+4;

			if(endPageNum >= lastPage) {
				startPageNum = (lastPage - 9);
				endPageNum = lastPage;
			}
		}
		

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("lastPage", lastPage);
		resultMap.put("foodList", foodList);
		resultMap.put("currentPage", currentPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);
	
		return resultMap;
		// return null;
	}

	//Food List Service
	public List<Food> getFoodList(){
		System.out.println("foodList service call test");
		//System.out.println(foodMapper.getFoodList());
		return foodMapper.getFoodList();
	}

	public List<Food> getFoodGroupList(){
		System.out.println("foodList service call test");
		//System.out.println(foodMapper.getFoodList());
		return foodMapper.getFoodGroupList();
	}


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
