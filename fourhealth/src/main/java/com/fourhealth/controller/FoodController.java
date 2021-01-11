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
	private FoodService foodService;	
	@Autowired
	private FoodMapper foodMapper;
	// log를 찍기위해 최초 선언
	private static final Logger log = LoggerFactory.getLogger(FoodController.class);


	@Controller
	public class CommonController {
    
    @GetMapping("/foodSearch")
	public String foodSearch(){
		return "food/master_food/food_search";
	}
}

	@GetMapping("/foodListNumbers")
	public String foodListNumbers(Model model, 
									@RequestParam(name = "currentPage", required=false, defaultValue = "1")int currentPage){

		Map<String, Object> resultMap = foodService.getFoosList(currentPage);		
		
		model.addAttribute("title", "식품리스트 페이징 게시판");
		
		
		System.out.println("#############################");
	    System.out.println(resultMap.get("lastPage"));


		System.out.println(resultMap);

		for(int i=0; i<resultMap.size(); i++){
			if(resultMap.get(i) == null){

			}
		}
						

		// model.addAttribute("lastPage" , resultMap.get("lastPage"));
		model.addAttribute("foodList", resultMap.get("foodList"));
		// model.addAttribute("currentPage", resultMap.get("currentPage"));
		// model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		// model.addAttribute("endPageNum", resultMap.get("endPageNum"));




		//return "redirect:/";
		return "main_layout/food/foodListNumbers";
	}


	//식품리스트
	@GetMapping("/foodList")
	public String foodList(Model model){
		model.addAttribute("title", "식품리스트");
		//

		//식품 리스트 Food type의 List
		List<Food> foodList = foodService.getFoodList();
		System.out.println(foodList.size());

		return "food/food_list";
	}

	//식품 리스트
	// @RequestMapping(value = "/foodList", method = RequestMethod.GET)
	// public String foodList(Model model){
	// 	// List<Food> foodList = foodService.getFoodList();
	// 	foodService.getFoodList();
	// 	model.addAttribute("title", "식품 리스트");
	// 	System.out.println("#################");
	// 	//System.out.println(foodList.toString());

	// 	return "food/food_list";
	// }

	//addMasterFoodInformation
	@RequestMapping(value = "/foodInsert", produces = "application/json", method = RequestMethod.POST)
	public @ResponseBody String foodInsert(@RequestBody List<Map<String, Object>> data) {
		System.out.println("From FoodController >> Controller data 표시");
		System.out.println(data.toString());
		//log.info("data", data.toString());
		
		

		for(int i=0; i<data.size(); i++) {
			if(data.get(i).get("foodCal") == ""){
				data.get(i).put("foodGroup", 0);
				
			}
		}

	
		int result = foodMapper.insertFoodListInformation(data);

		//성공 여부 판단
		System.out.println("############ 성공여부판단 ############");
		System.out.println("result"+result);
		// //foodService.addFood1(data);
		return "성공";
	
	}

	
	// food 메인 페이지로 이동
	@GetMapping("/food1")
	public String food1(Model model) {
		model.addAttribute("title", "식품안전나라 API test");
		return "food1";
	}


	// food 호출을 위한 ajax 호출 경로 설정

	/**
	 * 모든 데이터는 varchar로 insert 향후 형 변환을 통해 값 활용
	 *
	 */

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
		int startIdx;
		int endIdx;

		startIdx = 32001;
		endIdx = 33000;

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
	
				//모든 음식은 1회 제공량 기준으로 변수 할당
				String foodCode = subMap.get("FOOD_CD"); 			// 음식 코드 
				String foodGroup = subMap.get("GROUP_NAME"); 		//식품 그룹
				String foodName = subMap.get("DESC_KOR"); 			// 음식 이름
				String nutrCal = subMap.get("NUTR_CONT1"); 			// 음식 칼로리
				String nutrCarbo = subMap.get("NUTR_CONT2");		// 음식 탄수화물
				String nutrProtein = subMap.get("NUTR_CONT3");		// 음식 단백질
				String totalSugar = subMap.get("NUTR_CONT5");		// 음식 당
				String totalSodium = subMap.get("NUTR_CONT6");		// 음식 나트륨
				String nutrFat = subMap.get("NUTR_CONT4"); 			// 음식 지방
				String nutrCholesterol = subMap.get("NUTR_CONT7");  //음식 콜레스테롤
				String servingSize = subMap.get("SERVING_SIZE"); 	// 음식 총 내용량
				String makerName = subMap.get("MAKER_NAME");		// 음식 제조사

				//받아온 변수들 foodMap에 다시 해당 키와 값으로 할당
				//모든 코드의 키와 값은 음식의 1회 제공량을 기준으로 한다.
				foodMap.put("foodCode", foodCode); 					// 음식 코드 키와 값
				foodMap.put("foodGroup", foodGroup);				// 음식 그룹 키와 값
				foodMap.put("foodName", foodName); 					// 음식 이름 키와 값
				foodMap.put("foodTotalGram", servingSize);			// 음식 총내용량 키와 값
				foodMap.put("foodCal", nutrCal);					// 음식 칼로리 키와 값
				foodMap.put("foodCarbo", nutrCarbo);				// 음식 탄수화물 키와 값
				foodMap.put("foodProtein", nutrProtein);			// 음식 단백질 키와 값
				foodMap.put("foodFat", nutrFat);					// 음식 지방 키와 값
				foodMap.put("foodSugar", totalSugar);				// 음식 당 키와 값
				foodMap.put("foodSodium", totalSodium);				// 음식 나트륨 키와 값
				foodMap.put("foodChole", nutrCholesterol);			// 음식 콜레스테롤 키와 값
				foodMap.put("makerName", makerName);				// 음식 제조사 키와 값

				//foodList에 다시 설정
				foodList.add(foodMap);
			
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

		return foodList;

	}

	//######################################################################//
	//				    		좀더 세밀한 API 식품 정보 처리					  //
	//######################################################################//

	@GetMapping("food_another")
	public String foodAnother(){
		//FatSecret 작업 가능하면 시작
		//기존의 db는 수는 많지만, 군데군데 부족한 부분은 많음

		return null;
	}
}
