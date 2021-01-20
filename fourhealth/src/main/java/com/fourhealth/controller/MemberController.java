package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourhealth.dto.GradePlatformTrainerDto;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.fourhealth.dto.GradePlatformUserDto;
import com.fourhealth.dto.MemberDto;
import com.fourhealth.service.MemberService;
import com.fourhealth.service.UserService;

import com.fourhealth.dto.MsgDto;
import com.fourhealth.dto.TrainerDto;
import com.fourhealth.dto.UserDto;
import com.fourhealth.service.MessageService;
import com.fourhealth.service.TrainerService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private UserService userService;
	@Autowired
	private TrainerService trainerService;

	/********************************************************************************************
	 * 로그인/로그아웃
	 ********************************************************************************************/

	// [회원 공통]로그인 체크

	// [회원 공통]로그인 화면에서 입력받은 값 처리 매핑
	// [회원 공통]로그인 후 각 권한(관리자, 트레이너, 사용자) 레벨 체크 후 한글로 치환
	// [회원 공통]로그인 후 플렛폼 권한 체크하여 치환 작업
	@PostMapping("/login")
	public String commonLoginPage(@RequestParam(name = "userId", required = false) String userId,
								@RequestParam(name = "userPassword", required = false) String userPassword, HttpSession session,
								// RedirectAttributes rAttr,
								HttpServletResponse response) throws IOException {
		GradePlatformUserDto gradePlatformUserDto;
		GradePlatformTrainerDto gradePlatformTrainerDto;
		
		System.out.println("로그인 화면에서 입력받은 값->" + userId);
		System.out.println("로그인 화면에서 입력받은 값->" + userPassword);

		MemberDto memberDto = memberService.getMemberById(userId);
		System.out.println(memberDto.getMemberId());

		if (userId != null && userPassword != null && memberDto != null && memberDto.getMemberPw() != null
				&& userPassword.equals(memberDto.getMemberPw())) {

			// 로그인 후 각 권한 체크하여 한글로 치환
			String userLevel = memberDto.getMemberLevel();
			if (userLevel.equals("user_level_002")) {
				memberDto.setMemberLevel("트레이너");
			} else if (userLevel.equals("user_level_003")) {
				memberDto.setMemberLevel("사용자");
			} else {
				memberDto.setMemberLevel("관리자");
			}
			System.out.println("로그인 후 레벨 체크" + memberDto);
				// 로그인 후 사용자 플랫폼 권한 체크하여 치환(닉네임)
				if(memberDto.getMemberLevel().equals("사용자")) {
					gradePlatformUserDto = userService.getUserGrade(userId);
					session.setAttribute("SID", memberDto.getMemberId());
					session.setAttribute("SLEVEL", memberDto.getMemberLevel());
					session.setAttribute("SNAME", memberDto.getMemberName());
					session.setAttribute("SNICKNAME", memberDto.getMemberNickname());
					// 사용자 플렛폼 권한 체크 하여 치환 작업(로얄블루)
					session.setAttribute("SGRADE", gradePlatformUserDto.getUserPlatformGradeName());
					System.out.println(gradePlatformUserDto.getUserPlatformGradeName());
					System.out.println(userId + " : 로그인 성공");
				}else if(memberDto.getMemberLevel().equals("트레이너")){
					gradePlatformTrainerDto = trainerService.getTrainerGrade(userId);
					session.setAttribute("SID", memberDto.getMemberId());
					session.setAttribute("SLEVEL", memberDto.getMemberLevel());
					session.setAttribute("SNAME", memberDto.getMemberName());
					session.setAttribute("SNICKNAME", memberDto.getMemberNickname());
					// 사용자 플렛폼 권한 체크 하여 치환 작업(로얄블루)
					session.setAttribute("SGRADE", gradePlatformTrainerDto.getTrainerPlatformGradeName());
					System.out.println(gradePlatformTrainerDto.getTrainerPlatformGradeName());
					System.out.println(userId + " : 로그인 성공");
				}else {
					session.setAttribute("SID", memberDto.getMemberId());
					session.setAttribute("SLEVEL", memberDto.getMemberLevel());
					session.setAttribute("SNAME", memberDto.getMemberName());
					session.setAttribute("SNICKNAME", memberDto.getMemberNickname());
					System.out.println(userId + " : 로그인 성공");
				}

			
		} else {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script>alert('아이디 혹은 비밀번호가 일치하지 않습니다.'); location.href='/login';</script>");
			out.flush();
			// rAttr.addAttribute("result", "입력하신 정보는 없습니다.");
			System.out.println(userId + " : 로그인 실패");

			return "redirect:/login";
		}
		return "redirect:/";
	}

	// [회원 공통]로그아웃
	@GetMapping("/logout")
	public String commonLogoutPro(HttpSession session) {
		session.invalidate();

		return "redirect:/login";
	}

	/***********************************************************************************************/

	/********************************************************************************************
	 * 회원가입 관련
	 ********************************************************************************************/

	// 회원가입시 트레이너,사용자 권한 선택 화면
	@GetMapping("/levelSelect")
	public String commonLevelSelect() {

		return "main_layout/member/level_select";
	}

	// 사용자,트레이너 권한 선택후 회원가입 입력하는 화면
	@GetMapping("/mInsertPage")
	public String commonMInsert(@RequestParam(value = "user_level_code", required = false) String level, Model model) {

		model.addAttribute("level", level); // 누른거 래밸 사용자,트레이너
		return "main_layout/member/m_insert";
	}

	//회원 가입 후 로그인 화면으로 이동
		@PostMapping("/mInsert")
		public String addMember(MemberDto member){
			//공통 회원 가입
			String userId = member.getMemberId();
			String memberLevel = member.getMemberLevel();
			
				if(memberLevel.equals("user_level_002")) {
					////트레이너 플렛폼 공통 등급 관리
					TrainerDto trainerdto = new TrainerDto();
					trainerdto.setUserId(userId);
					trainerdto.setTrainerPlatformGradeCode("trainer_platform_grade_004");
					trainerdto.setTrainerAccessCode("trainer_access_003");
					member.setTrainerDto(trainerdto);
					String result = memberService.addMember(member); 
					String result2 = trainerService.addMemberTrainerPlatFormGradeCode(trainerdto); 
					System.out.println(result);
					System.out.println(result2);
				}else if(memberLevel.equals("user_level_003")){
					//사용자 플렛폼 공통 등급 관리
					UserDto userdto = new UserDto();
					userdto.setUserId(userId);
					userdto.setUserPlatFormGradeCode("user_platform_grade_001");
					userdto.setUserStatusLevelCode("user_status_level_001");
					member.setUserDto(userdto);
					String result = memberService.addMember(member); 
					String result2 = userService.addMemberUserPlatFormGradeCode(userdto); 
					System.out.println(result);
					System.out.println(result2);
				} else {
					//플랫폼 등급이 없을 시 관리자 회원가입 처리
					String result = memberService.addMember(member); 
					System.out.println(result);
				}
			return "redirect:/login";
		}

	// 회원가입 화면에서 아이디 중복처리 확인
	@RequestMapping(value = "/userIdCheck", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody int commonIdCheck(@RequestParam(name = "userId", required = false) String userId) {
		System.out.println("아이디 중복체크 ->" + userId);
		int count = memberService.userIdCheck(userId);

		return count;
	}

	/********************************************************************************************/

	// 트레이너 화면 에 붙여될내용
	/*
	 * //로그인됫다고 가정(트레이너)
	 * 
	 * @GetMapping("/myPromotion") public String trainerGetMyPromotionList(Model
	 * model) { //아이디 있다고 가정 결제할때 하나씩 증가시켜줘야하는데 결제 하는거보고 하기로. Lis
	 * 
	 * memberService.trainerGetMyPromotionList("id002");
	 * model.addAttribute("myPromotionList",myPromotionList); return
	 * "trainer/my_promotion_list"; }
	 * 
	 * //자신의 프로모션 별 회원에게 운동이나음식 넣어주기위해 프로모션 접근햇을때 등록된회원 조회 (트레이너)
	 * 
	 * @GetMapping("/myPromotionMemberList") public String ="pomotionCode", required
	 * = false) String promotionCode) { List<MatchingUserTrainerDto> getMemberList =
	 * memberService.trainerGetMatchingUserList(promotionCode);
	 * System.out.printlngtMemberList);
	 * 
	 * model.addAttribute("memberList",getMemberList); return
	 * "trainer/my_promotion_member_list"; }
	 * 
	 * //내회원 조회 페이지에서 특정 회원 클릭하여 접근시 그 회원 정보(트레이너)
	 * 
	 * @GetMapping("/scheduleInsert") public String MemberScheduleInsert(Model model
	 * ,@RequestParam(name = "userId",required = false)String userId) { UserDto
	 * getUserInfo = memberService.trainerGetMatchingUserInfo(userId);
	 * model.addAttribute("userInfo",getUserInfo); return
	 * "trainer/member_schedule_insert";
	 * 
	 * }
	 * 
	 * 
	 * //내회원 스케줄 넣어줄때 운동정보 가져올때
	 * 
	 * @RequestMapping(value = "/exerciseAdd", method = RequestMethod.POST, produces
	 * = "application/json") public @ResponseBody List<MetExerciseDto>
	 * getExerciseList(@RequestParam Map<String, Object> map){
	 * System.out.println(map); String exerciseName =
	 * (String)map.get("exerciseName"); String metCoefficient =
	 * (String)map.get("exerciseHow");
	 * System.out.println(exerciseName+metCoefficient); List<MetExerciseDto>
	 * getExerciseList = exerciseService.getSearchExercise(exerciseName,
	 * metCoefficient);
	 * 
	 * return getExerciseList; }
	 * 
	 */

	// @GetMapping("/sellerModifyGoods")
	// public ModelAndView sellerModifyGoods(@RequestParam(name="goodsCode",
	// required = false) String goodsCode
	// ,ModelAndView mav) {
	//
	// System.out.println("판매자별 상품현황 페이지에서 요청 받은 값->" + goodsCode);
	//
	// //goodsService에서 코드에 일치하는 상품정보가 담긴 객체 받아오기
	// Goods goods = goodsService.getGoodsByCode(goodsCode);
	//
	// // model 객체와 view 논리주소를 한번에 처리할 수 있는 객체
	// mav.addObject("title", "상품 수정");
	// mav.addObject("goods", goods);
	// mav.setViewName("goods/gUpdate");
	//
	// return mav;
	// }
	//

	// @GetMapping("/levelSelect")
	// public String levelCheck() {

	// return "member/level_select";
	// }

	// @GetMapping("/signUp")
	// public String main2(@RequestParam(value = "user_level_code", required =
	// false) String level, Model model) {
	// model.addAttribute("level", level); // 누른거 래밸 사용자,트레이너
	// return "member/m_insert";
	// }

	private MessageService messageService;

	// 로그인 화면(공통)
	@GetMapping("/login")
	public String commonLoginPage(Model model) {
		model.addAttribute("title", "로그인 화면");

		return "/login/login";
	}

}
