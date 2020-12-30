package com.fourhealth.controller;

/*
 * 회원가입, 로그인, 사용자/트레이너 정보 수정, 프로필, 공통 데이터 , 사용자/트레이너 정보 공개 관리, 등등....
 */

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.CommonUserDto;
import com.fourhealth.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	/********************************************************************************************
	 * 로그인/로그아웃
	 ********************************************************************************************/

	//로그인 화면(공통)
	@GetMapping("/login")
	public String commonLoginPage(Model model
			,@RequestParam(name="result", required = false) String result) {
		model.addAttribute("title", "로그인 화면");

		if(result != null) model.addAttribute("result", result);

		return "login/login";
	}
	
	// @PostMapping(value = "/userIdCheck")
	// public String addMember(Member member
	// ,@RequestParam(name = "memberId", required = false) String memberId ,
	// HttpServletResponse response ) throws IOException {
	// System.out.println("회원가입화면에서 입력받은 값--->" + count);
	//
	// String userLevel = member.getUserLevel();
	// if(userLevel.equals("trainer")){
	// member.setUserLevel("user_level_002");
	// }else if (userLevel.equals("user")) {
	// member.setUserLevel("user_level_003");
	// }else {
	// member.setUserLevel("user_level_001");
	// }
	// System.out.println("회원가입화면에서 입력후 레벨값 수정--->" + member);

	@PostMapping("/login")
	public String Login(@RequestParam(name = "userId", required = false) String userId,
			@RequestParam(name = "userPassword", required = false) String userPassword, HttpSession session,
			RedirectAttributes rAttr) {


		System.out.println("로그인 화면에서 입력받은 값->" + userId);
		System.out.println("로그인 화면에서 입력받은 값->" + userPassword);

		CommonUserDto user = memberService.getMemberById(userId);

		System.out.println(user.getUserId());

		if(userId != null && userPassword != null && user != null && user.getUserPw() != null &&
				userPassword.equals(user.getUserPw())){
			session.setAttribute("SID", user.getUserId());
			session.setAttribute("SLEVEL", user.getUserLevelCode());
			session.setAttribute("SNAME", user.getUserName());
			System.out.println(userId + " : 로그인 성공");
		} else {
			rAttr.addAttribute("result", "입력하신 정보는 없습니다.");
			System.out.println(userId + " : 로그인 실패");
			return "redirect:/login";
		}

		return "redirect:/";
	}

	

	//로그아웃(공통)
	@GetMapping("/logout")
	public String commonLogoutPro(HttpSession session) {

		session.invalidate();

		return "redirect:/login";
	}
	
	/***********************************************************************************************/
	
	
	/********************************************************************************************
	 * 회원가입 관련
	 ********************************************************************************************/
	
	
	//회원가입시 트레이너,사용자 권한 선택 화면
	@GetMapping("/levelSelect")
	public String commonLevelSelect() {
		
		return "member/level_select";
	}
	
	//사용자,트레이너 권한 선택후 회원가입 입력하는 화면 
	@GetMapping("/mInsertPage")
	public String commonMInsert(@RequestParam(value = "user_level_code", required = false) String level,
						Model model) {
		
		model.addAttribute("level", level); //누른거 래밸 사용자,트레이너
		return "member/m_insert";
	}
	
	@PostMapping("/mInsert")
	public String addMember(CommonUserDto member){
		
		String result = memberService.addMember(member); 
		System.out.println(result);
		//임시로 그냥 메인화면으로 가기
		return "index";
	}
	
	
	//회원가입 화면에서 아이디 중복처리 확인 
	@RequestMapping(value="/memberIdCheck", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody int commonIdCheck(@RequestParam(name = "userId", required = false) String userId){
		System.out.println("아이디 중복체크 ->" + userId);
		int count = memberService.memberIdCheck(userId);
		
		return count;
	}
	
	/********************************************************************************************/
	
	
	
	
			//트레이너 화면 에 붙여될내용
	/*
	 * //로그인됫다고 가정(트레이너)
	 * 
	 * @GetMapping("/myPromotion") public String trainerGetMyPromotionList(Model
	 * model) { //아이디 있다고 가정 결제할때 하나씩 증가시켜줘야하는데 결제 하는거보고 하기로.
	 * List<NoticePromotionTrainerDto> myPromotionList =
	 * memberService.trainerGetMyPromotionList("id002");
	 * model.addAttribute("myPromotionList",myPromotionList); return
	 * "trainer/my_promotion_list"; }
	 * 
	 * //자신의 프로모션 별 회원에게 운동이나음식 넣어주기위해 프로모션 접근햇을때 등록된회원 조회 (트레이너)
	 * 
	 * @GetMapping("/myPromotionMemberList") public String
	 * trainerGetMyPromotionMemberList(Model model ,@RequestParam(name
	 * ="promotionCode", required = false) String promotionCode) {
	 * List<MatchingUserTrainerDto> getMemberList =
	 * memberService.trainerGetMatchingUserList(promotionCode);
	 * System.out.println(getMemberList);
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
	 }
	 

	//내회원 스케줄 넣어줄때 운동정보 가져올때 
	@RequestMapping(value = "/exerciseAdd", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody List<MetExerciseDto> getExerciseList(@RequestParam Map<String, Object> map){
		System.out.println(map);
		String exerciseName = (String)map.get("exerciseName");
		String metCoefficient = (String)map.get("exerciseHow");
		System.out.println(exerciseName+metCoefficient);
		List<MetExerciseDto> getExerciseList = exerciseService.getSearchExercise(exerciseName, metCoefficient);

		return getExerciseList;
	}

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

}
