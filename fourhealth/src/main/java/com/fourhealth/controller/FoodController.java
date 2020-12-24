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

import org.apache.tomcat.util.json.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FoodController {

	// log를 찍기위해 최초 선언
	private static final Logger log = LoggerFactory.getLogger(FoodController.class);

	@GetMapping("/food1")
	public String food1(Model model) {
		model.addAttribute("title", "식품안전나라 API test");
		return "food1";
	}

	@GetMapping(value = "/food1ApiTest", produces = "application/json")
	public @ResponseBody List<Map<String, String>> food1(Model model, @RequestParam("food") String food)
			throws Exception {
		// List<Map<String, String>>
		// 인증키
		// String keyId = "910606a0c65e48fb9339";
		// url 기본
		// String url =
		// "http://openapi.foodsafetykorea.go.kr/api/keyId/serviceId/dataType/startIdx/endIdx";

		// url 값 인자가 필요할 경우
		// http://openapi.foodsafetykorea.go.kr/api/인증키/서비스명/요청파일타입/요청시작위치/요청종료위치/변수명=값&변수명=값2
		// e.g) http://openapi.foodsafetykorea.go.kr/api/sample/I2790/xml/1/5/DESC_KOR=값
		// &RESEARCH_YEAR=값 &MAKER_NAME=값

		// 서비스 아이디 키값
		// 식품영양성분 : I2790
		// 식품레시피 : COOKRCP01
		// 건강기능식품 : I0760

		// 인증키
		String keyId = "910606a0c65e48fb9339";
		String serviceId = "I2790";
		// 데이터타입
		String dataType = "json";
		// String datatype = "json";
		// index Start, End
		// String startIdx = "1";
		int startIdx = 1;
		// String endIdx = "5";
		int endIdx = 1000;

		String url = null;

		// 검색 처리 작업 음식 이름
		if (food == "") {
			url = "http://openapi.foodsafetykorea.go.kr/api/" + keyId + "/" + serviceId + "/" + dataType + "/"
					+ startIdx + "/" + endIdx;
		} else {
			url = "http://openapi.foodsafetykorea.go.kr/api/" + keyId + "/" + serviceId + "/" + dataType + "/"
					+ startIdx + "/" + endIdx + "/DESC_KOR=" + food;
		}

		// 검색 처리 메이커 이름

		/// DESC_KOR="+food
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

			System.out.println(">>>" + result);

			JSONParser parser = new JSONParser(result);
			// result 값으로 받아서 parsing

			LinkedHashMap<String, Object> map = parser.parseObject();

			LinkedHashMap<String, Object> map2 = (LinkedHashMap<String, Object>) map.get("I2790");

			ArrayList<Map<String, String>> arrayList = (ArrayList<Map<String, String>>) map2.get("row");

			for (Map<String, String> subMap : arrayList) {
				Map<String, String> foodMap = new HashMap<String, String>();
				String foodName = subMap.get("DESC_KOR");
				String nutrCal = subMap.get("NUTR_CONT1");
				String nutrCarbo = subMap.get("NUTR_CONT2");
				String nutrProtein = subMap.get("NUTR_CONT3");
				String nutrFat = subMap.get("NUTR_CONT4");
				String servingSize = subMap.get("SERVING_SIZE");
				String makerName = subMap.get("MAKER_NAME");
				String totalSugar = subMap.get("NUTR_CONT5");
				String totalSodium = subMap.get("NUTR_CONT6");

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
