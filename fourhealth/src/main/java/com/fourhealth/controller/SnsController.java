package com.fourhealth.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * SNS 관련
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.fourhealth.dto.SnsUserDto;
import com.fourhealth.service.SnsService;

@Controller
public class SnsController {

	@Autowired
	private SnsService snsService;

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
		return "redirect:/sns";
	}

	@GetMapping("/snsInsert")
	public String snsInsert() {
		return "main_layout/sns/snsInsert";
	}

	@GetMapping("/sns")
	public String snsList(Model model) {
		snsService.getSnsList();
		List<SnsUserDto> snsList = snsService.getSnsList();
		System.out.println(snsList.toString());
		model.addAttribute("snsList", snsList);
		return "main_layout/sns/snsList";
	}
}
