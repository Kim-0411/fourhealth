package com.fourhealth.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
 * SNS 관련
 */

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.fourhealth.dto.SnsUserDto;
import com.fourhealth.service.MemberService;
import com.fourhealth.service.SnsService;
import com.fourhealth.utility.ImageUpload;

@Controller
public class SnsController {

	@Autowired
	private SnsService snsService;

	@RequestMapping(value = "/commentsInsertBtn", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String commentsInsertBtn(@RequestParam Map<String, Object> map) {
		System.out.println(map);
		return "redirect:/main_layout/sns/snsList";

	}

	@PostMapping("/snsInsert")
	public String snsInsert(SnsUserDto snsUserDto) throws FileNotFoundException {
		System.out.println("폼에서 입력받은 값" + snsUserDto);
		String fileName = null;

		if (!snsUserDto.getUserSnsUploadFile().isEmpty()) {
			int rdv = (int) (Math.random() * 1000);
			fileName = snsUserDto.getUserSnsUploadFile().getOriginalFilename();
			String rename = rdv + "_" + fileName;
			String path = ResourceUtils.getFile("src/main/resources/static/image/" + rename).getAbsolutePath();

			try {
				new File(path).mkdir();
				snsUserDto.getUserSnsUploadFile().transferTo(new File(path));

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			snsUserDto.setSnsImageUrl(rename);
		}

		String result = snsService.snsInsert(snsUserDto);
		System.out.println("폼에서 입력받은 값2" + snsUserDto);
		System.out.println(result);
		return "redirect:/sns/snsList";
	}

	@GetMapping("/snsInsert")
	public String snsInsert() {
		return "main_layout/sns/snsInsert";
	}

	@GetMapping("sns/snsList")
	public String snsList(Model model,
			@RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage) {
		snsService.getSnsList();
		List<SnsUserDto> snsList = snsService.getSnsList();
		System.out.println(snsList.toString());
		model.addAttribute("snsList", snsList);

		Map<String, Object> resultMap = snsService.getSnsListPaging(currentPage);
		model.addAttribute("lastPage", resultMap.get("lastPage"));
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("startPageNum", resultMap.get("startPageNum"));
		model.addAttribute("endPageNum", resultMap.get("endPageNum"));
		return "main_layout/sns/snsList";
	}
}
