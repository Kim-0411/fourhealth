package com.fourhealth.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fourhealth.dto.Food;
import com.fourhealth.mapper.FoodMapper;
import com.fourhealth.service.FoodService;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class FoodController {
	@Autowired
	private FoodMapper foodMapper;

	// log를 찍기위해 최초 선언
	private static final Logger log = LoggerFactory.getLogger(FoodController.class);

	// Generate FoodService Object
	FoodService foodService = new FoodService();
	Food food = new Food();

	//addMasterFoodInformation

	@RequestMapping(value = "/foodInsert", produces = "application/json", method = RequestMethod.POST)
	public @ResponseBody String foodInsert(@RequestBody List<Map<String, Object>> data) {
		System.out.println("From FoodController >> Controller data 표시");
		System.out.println(data.toString());
		log.info("data", data.toString());
		
		//return "성공";
		//int result = foodMapper.insertFoodListInformation(data);

		//성공 여부 판단.
		//System.out.println("result"+result);
		//foodService.addFood1(data);
		return "성공";
	
	}
	/**
	 	@RequestMapping(value = "/foodInsert", produces = "application/json", method = RequestMethod.POST)
	public @ResponseBody String foodInsert(@RequestBody List<Map<String, Object>> data) {
		System.out.println("From FoodController >> Controller data 표시");
		System.out.println(data.toString());

	
		//data = (Map<String, String>)JSONObject.toBean(jsonObject, java.util.HashMap.class);

	
		// food VO(DTO) 테스트

		//foodService.addFood1(data);

		//return "성공";
		return data;
	
	}
	  */

	

	@GetMapping("/food1")
	public String food1(Model model) {
		model.addAttribute("title", "식품안전나라 API test");
		return "food1";
	}

	@GetMapping(value = "/food1ApiTest", produces = "application/json")
	public @ResponseBody List<Map<String, String>> food1(Model model, @RequestParam("food") String food)
			throws Exception {

		// 인증키 String keyId = "910606a0c65e48fb9339";
		// url 기본 : String url = "http://openapi.foodsafetykorea.go.kr/api/keyId/serviceId/dataType/startIdx/endIdx";
		// url 값 인자가 필요할 경우
		// http://openapi.foodsafetykorea.go.kr/api/인증키/서비스명/요청파일타입/요청시작위치/요청종료위치/변수명=값&변수명=값2
		// e.g) http://openapi.foodsafetykorea.go.kr/api/sample/I2790/xml/1/5/DESC_KOR=값
		// &RESEARCH_YEAR=값 &MAKER_NAME=값
		// 서비스 아이디 키값
		// 식품영양성분 : I2790
		// 식품레시피 : COOKRCP01
		// 건강기능식품 : I0760

		//@RequestParam 을 통해 화면에서 입력받은 food value 받아와서 api 검색 조회

		//api_key, api_service_id, data_type 변수
		String keyId = "910606a0c65e48fb9339";
		String serviceId = "I2790";
		String dataType = "json";
	
		//start, end index 설정 변수(단 한번 호출시 불러올 수 있는 데이터의 수는 1000개)
		int startIdx = 0;
		int endIdx = 1;

		//API 호출 경로 변수 초기화
		String url = null;

		// 음식 이름으로 검색 처리 경로 설정
		// DESC_KOR="+food (DESC_KOR : 음식이름 key)
		/*
				
		*/
		if (food == "") {
			url = "http://openapi.foodsafetykorea.go.kr/api/" + keyId + "/" + serviceId + "/" + dataType + "/"
					+ startIdx + "/" + endIdx;
		} else {
			url = "http://openapi.foodsafetykorea.go.kr/api/" + keyId + "/" + serviceId + "/" + dataType + "/"
					+ startIdx + "/" + endIdx + "/DESC_KOR=" + food;
		}

		//
		List<Map<String, String>> foodList = new ArrayList<Map<String, String>>();

		System.out.println(url);

		try {

			URL url1 = new URL(url);

			String line = "";
			String result = "";

			BufferedReader br;
			br = new BufferedReader(new InputStreamReader(url1.openStream()));
			while ((line = br.readLine()) != null) {
				result = result.concat(line);
				// System.out.println(line);
			}

			//result 결과 확인
			//System.out.println(">>>" + result);

			JSONParser parser = new JSONParser(result);
			// result 값으로 받아서 parsing

			LinkedHashMap<String, Object> map = parser.parseObject();

			LinkedHashMap<String, Object> map2 = (LinkedHashMap<String, Object>) map.get("I2790");
			ArrayList<Map<String, String>> arrayList = (ArrayList<Map<String, String>>) map2.get("row");

			for (Map<String, String> subMap : arrayList) {
				Map<String, String> foodMap = new HashMap<String, String>();
				String foodCode = subMap.get("FOOD_CD");
				String foodName = subMap.get("DESC_KOR");
				String nutrCal = subMap.get("NUTR_CONT1");
				String nutrCarbo = subMap.get("NUTR_CONT2");
				String nutrProtein = subMap.get("NUTR_CONT3");
				String nutrFat = subMap.get("NUTR_CONT4");
				String servingSize = subMap.get("SERVING_SIZE");
				String makerName = subMap.get("MAKER_NAME");
				String totalSugar = subMap.get("NUTR_CONT5");
				String totalSodium = subMap.get("NUTR_CONT6");

				foodMap.put("foodCode", foodCode);
				foodMap.put("foodName", foodName);
				foodMap.put("foodCal", nutrCal);
				foodMap.put("foodCarbo", nutrCarbo);
				foodMap.put("foodProtein", nutrProtein);
				foodMap.put("foodFat", nutrFat);
				foodMap.put("foodSugar", totalSugar);
				foodMap.put("foodSodium", totalSodium);
				foodMap.put("makerName", makerName);
				foodMap.put("foodTotalGram", servingSize);
				foodList.add(foodMap);


			}
		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return foodList;

	}
}