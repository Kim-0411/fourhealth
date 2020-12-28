<<<<<<< HEAD
package com.fourhealth.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fourhealth.dto.NoticePromotionTrainerDto;
import com.fourhealth.service.PromotionService;

@Controller
public class PromotionController {

	@Autowired
	private PromotionService promotionService;

	// 트레이너 프로모션 등록전 최초데이터 체크컨트롤러
	@GetMapping("/pro")
	public String promotionCheck(@RequestParam(name = "proId", required = false) String proId,
			HttpServletResponse response) throws IOException {

		System.out.println(proId);
		System.out.println(promotionService.promotionCheck(proId));
		String re = promotionService.promotionCheck(proId);
		int i = Integer.parseInt(re);
		if (i > 0) {
			return "promotion/promotionInsert";
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('정보를 확인해주세요.'); location.href='/login';</script>");
			out.flush();
			return "/login";
		}
	}

	// 트레이너 프로모션 등록컨트롤러
	@PostMapping("/proInsert")
	public String trainerPromotionInsert(MultipartHttpServletRequest request, NoticePromotionTrainerDto promotionDto)
			throws ParseException {
		System.out.println(promotionDto);

		String fileName = null;

		if (!promotionDto.getProBgImage().isEmpty()) {
			fileName = promotionDto.getProBgImage().getOriginalFilename();
			String path = "D:\\teamProject\\fourhealth\\fourhealth\\fourhealth\\src\\main\\resources\\static\\image\\"; // 개발자패스
																														// 배포패스

			try {
				new File(path).mkdir();
				promotionDto.getProBgImage().transferTo(new File(path + fileName));

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			promotionDto.setProImageUrl(fileName);
		}

		String start = promotionDto.getTrainerPromotionAttendStartDate();
		String end = promotionDto.getTrainerPromotionRecruitCloseDate();

		System.out.println("proInsert start-------------" + start);
		System.out.println("proInsert end-------------" + end);

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		java.util.Date stDt = format.parse(start);
		java.util.Date edDt = format.parse(end);

		long diff = edDt.getTime() - stDt.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		String totalDate = Long.toString(diffDays);

		System.out.println(diffDays);
		promotionDto.setTrainerPromotionRecruitTotalDate(totalDate);

		System.out.println(promotionDto);

		promotionService.promotionInsert(promotionDto);

		return "redirect:/login";
	}

	// 트레이너 프로모션 전체리스트 컨트롤러(회원이 보는거 )공통
	@GetMapping("/proList")
	public String commonPromotionList(Model model) {
		List<NoticePromotionTrainerDto> promotionList = promotionService.promotionList();
		System.out.println(promotionList);
		model.addAttribute("promotionList", promotionList);

		return "promotion/promotionList";
	}

	// 트레이너 프로모션 상세정보 컨트롤러
	@GetMapping("/proDetail")
	public String commonProDetail(@RequestParam(name = "proCode", required = false) String proCode, Model model) {

		System.out.println(proCode);

		NoticePromotionTrainerDto promotionDto = promotionService.proDetail(proCode);
		System.out.println(promotionDto);
		model.addAttribute("proDetail", promotionDto);

		return "promotion/promotionDetail";
	}

}
=======
package com.fourhealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromotionController {

    @GetMapping("/promotion_progress_list")
    public String masterPromotionProgressList(Model model) {
        // 관리자 진행중인 프로모션 조회 화면
        return "master/promotion/promotion_progress";
    }

    @GetMapping("/promotion_completion_list")
    public String masterPromotionCompletionList(Model model) {
        // 관리자 완료된 프로모션 조회 화면
        return "master/promotion/promotion_completion_list";
    }

}
>>>>>>> origin/DHMTest
