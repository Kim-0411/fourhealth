
package com.fourhealth.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fourhealth.mapper.FoodMapper;
import com.fourhealth.service.DiseaseService;
import com.fourhealth.dto.DiseaseDto;
import com.fourhealth.mapper.DiseaseMapper;
import com.fourhealth.dto.DiseaseDto;
import com.fourhealth.service.DiseaseService;

import org.apache.ibatis.logging.Log;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @Autowired
    private DiseaseMapper diseaseMapper;


    /**
     * 2020/12/30 Wed 질병API 테스트 메소드 작성 및 테스트
     * 
     * worker : 윤정호, 김재창 details : 질병 정보를 api 콜을 하여 db에 저장하는 작업 질병에 관한 상세 설명이 없어 향후,
     * 의약품 api 정보에서 합치는 작업 구상중
     * 
     * 
     * @param diseaseName
     * @return
     */

    // 질병 api url
    private final String diseaseUrl = "http://apis.data.go.kr/B551182/diseaseInfoService/getDissNameCodeList?sickType=1&medTp=2&diseaseType=SICK_NM&numOfRows=11789";
    // http://apis.data.go.kr/B551182/diseaseInfoService/getDissNameCodeList?sickType=1&medTp=2&diseaseType=SICK_NM&searchText=병적
    // 골절을&ServiceKey=서비스키(인증키)

    // 비동기 방식 json tpye으로 view에서 입력된 값 diseaseName 변수로 받아오는 작업 및 api 연동 검색
    @GetMapping(value = "/info_disease", produces = "application/json")
    public @ResponseBody List<Map<String, Object>> infoDisease(
            @RequestParam(value = "diseaseName", required = false) String diseaseName) {
        // public @ResponseBody List<Map<String, String>>
        // infoDisease(@RequestParam(value = "diseaseName", required = false) String
        // diseaseName)
        List<Map<String, Object>> superDiseaseList = new ArrayList<Map<String, Object>>();

        // # 입력된 값 체크
        System.out.println(diseaseName);

        // # 질병정보 service key(xml)
        // :http://apis.data.go.kr/B551182/hospInfoService/getHospBasisList?pageNo=1&numOfRows=10

        // # 질병정보 service key(json)
        // :http://apis.data.go.kr/B551182/hospInfoService/getHospBasisList?pageNo=1&numOfRows=10&_type=json

        // ##################################################
        // 서비스 키 변수
        // ##################################################

        // getDissNameCodeList : 질병명칭/코드조회
        String serviceKey1 = "getDissNameCodeList";
        // getDissByGenderAgeStats : 질병성별연령별통계
        String serviceKey2 = "getDissByGenderAgeStats";
        // getDissByHsptlzFrgnStats : 질병입원외래별통계
        String serviceKey3 = "getDissByHsptlzFrgnStats";
        // getDissByClassesStats : 질병의료기관종별통계
        String serviceKey4 = "getDissByClassesStats";
        // getDissByAreaStats : 질병의료기관지역별통계
        String serviceKey5 = "getDissByAreaStats";

        // # 질병 api 인증키(serviceKey)
        // MiNsr%2B7HjM24TaNAWazWAtARi%2F98ANOu2UfuTUSUUjVqtIWRDLzZQ%2FKJzU7fsfjxv4o4pQrd27o9zpKSReRK%2Bg%3D%3D&
        String apiKey = "&ServiceKey=MiNsr%2B7HjM24TaNAWazWAtARi%2F98ANOu2UfuTUSUUjVqtIWRDLzZQ%2FKJzU7fsfjxv4o4pQrd27o9zpKSReRK%2Bg%3D%3D&";

        // # 검색
        // &searchKey=searchText
        String searchKey = "&searchText=";

        // # 주의사항
        // encoding : UTF-8 필수
        // JSP 페이지 딴에서 요청시 인코딩 UTF-8 작업 필요
        // String searchText = URLEncoder.encode(“건강보험심사평가원”, "UTF-8");

        // 질병 api 검색 url
        // 질병 예제
        // http://apis.data.go.kr/B551182/diseaseInfoService/getDissNameCodeList?sickType=1&medTp=2&diseaseType=SICK_NM&searchText=병적
        // 골절을&ServiceKey=서비스키(인증키)
        String searchDiseaseUrlKey;

        if (diseaseName == "") {
            searchDiseaseUrlKey = diseaseUrl + apiKey + searchKey;
        } else {
            searchDiseaseUrlKey = diseaseUrl + apiKey + searchKey + diseaseName;
        }

        System.out.println(searchDiseaseUrlKey);
        try {
            Document doc = Jsoup.connect(searchDiseaseUrlKey).get();

            // System.out.println(doc);
            Elements el = doc.select("items");
            // System.out.println(el);

            for (int i = 0; i < el.size(); i++) {

                Element position = el.get(i);
                Elements diseaseData = position.select("item");

                for (int j = 0; j < diseaseData.size(); j++) {

                    // # 질병정보를 담기위한 HashMap : diseaseMap declare
                    Map<String, Object> diseaseMap = new HashMap<String, Object>();
                    Element data = diseaseData.get(j);

                    String sickCode = data.select("sickCd").text();
                    String sickName = data.select("sickNm").text();

                    diseaseMap.put("diseaseCode", sickCode);
                    diseaseMap.put("diseaseName", sickName);

                    superDiseaseList.add(diseaseMap);
                }

            }
            // System.out.println(superDiseaseList.get(4).get("diseaseName"));
        } catch (IOException e) {

            e.printStackTrace();
        }

        // List map 테스트
        // diseaseMap.put("받아온 값", diseaseName);
        // diseaseList.add(diseaseMap);

        // System.out.println(diseaseList.get(0));

        // Insert disease db test process

        System.out.println("#############################");
        System.out.println(superDiseaseList.toString());

        int result = diseaseMapper.insertDiseaseListInformation(superDiseaseList);
        System.out.println("############################");
        System.out.println("result 결과 확인 " + result);

        return superDiseaseList;
    }

    @GetMapping("/disease/disease")
    public String mainDisease(Model model) {
        model.addAttribute("title", "질병정보테스트");

        return "disease/disease_test";
    }
    
    /* 관리자 질병DB 관리 페이지 맵핑 시작 */
    @GetMapping("/master/diseaseManage/diseaseDataInsert")
    public String diseaseDataInsert(Model model) {
        return "manage_layout/master/disease_manage/disease_data_insert";
    }

    @GetMapping("/master/diseaseManage/diseaseDataList")
    public String diseaseDataList(Model model) {
        List<DiseaseDto> diseaseList = diseaseService.getDiseaseList();

        System.out.println("##################################");
        System.out.println("##################################");

        for(int i=0; i<10; i++){
            System.out.println(diseaseList.get(i).getDiseaseName());
        }

        model.addAttribute("title", "master 질병 리스트");
        model.addAttribute("diseaseList", diseaseList);



        return "manage_layout/master/disease_manage/disease_data_list";
    }

    @GetMapping("/diseaseDataModify")
    public String diseaseDataModify(Model model) {
        return "manage_layout/master/disease_manage/disease_data_modify";
    }
    /* 관리자 질병DB 관리 페이지 맵핑 끝 */
    @GetMapping("/disease/disease")
	public String diseasePage(){
		
		return "main_layout/disease/DiseaseList";
	}
}
