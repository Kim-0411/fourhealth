package com.fourhealth.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fourhealth.dto.CommentSnsUserDto;
import com.fourhealth.dto.SnsUserDto;
import com.fourhealth.mapper.SnsMapper;

@Service
@Transactional
public class SnsService {
	
	@Autowired
	private SnsMapper snsMapper;
	
	public String insertComment(CommentSnsUserDto commentSnsUserDto) {
		String insertChk = "게시 실패";
		if(commentSnsUserDto != null) {
			int result = snsMapper.insertComment(commentSnsUserDto);
			if(result > 0) insertChk = "게시 성공";
		}
		
		return insertChk;
	}
	
	
	  public String snsInsert(SnsUserDto snsUserDto) { 
			String insertCheck = "게시 실패";
			if(snsUserDto != null) {
				int result = snsMapper.snsInsert(snsUserDto);
				if(result > 0) insertCheck = "게시 성공";
			}
			
			return insertCheck;
		}
	  
	 public Map<String, Object> getSnsListPaging(int currentPage) {
	 	int startRow = 0;
		int rowPerPage = 12;
		int startPageNum = 1;
		double count = snsMapper.getSnsListCount();
		int lastPage = (int) Math.ceil(count / rowPerPage);
		int endPageNum = lastPage;
		startRow = (currentPage - 1) * rowPerPage;
		List<Map<String, Object>> snsList = snsMapper.getSnsListPaging(startRow, rowPerPage);
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
		resultMap.put("lastPage", lastPage);
		resultMap.put("snsList", snsList);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);
		System.out.println(resultMap + "--------->getSnsListPaging");
		return resultMap;
	}
	
	public List<SnsUserDto> getSnsList() {
		List<SnsUserDto> snsList = snsMapper.getSnsList();
		System.out.println("#######################");
		for (int i = 0; i < snsList.size(); i++) {
			String imgUrl = snsList.get(i).getSnsImageUrl();
			snsList.get(i).setSnsImageUrl("image/" + imgUrl);
		}
		System.out.println("test file call snsList from snsService");
		System.out.println(snsList);
		return snsList;
	}
}
