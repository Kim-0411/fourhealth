package com.fourhealth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fourhealth.dto.MemberDto;
import com.fourhealth.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService; 
	

//	@PostMapping(value = "/userIdCheck")
//	public String addMember(Member member
//							,@RequestParam(name = "memberId", required = false) String memberId ,
//							 HttpServletResponse response ) throws IOException {
//		System.out.println("회원가입화면에서 입력받은 값--->" + count);
//		
//		String userLevel = member.getUserLevel();
//		  if(userLevel.equals("trainer")){
//		   member.setUserLevel("user_level_002");
//		  }else if (userLevel.equals("user")) {
//			member.setUserLevel("user_level_003");
//		  }else {
//			member.setUserLevel("user_level_001");
//		  }
//		  System.out.println("회원가입화면에서 입력후 레벨값 수정--->" + member);

		

	
	@PostMapping("/login")
	public String Login( @RequestParam(name="userId", required = false) String userId
						,@RequestParam(name="userPassword", required = false) String userPassword
						,HttpSession session
						,RedirectAttributes rAttr) {
		
		System.out.println("로그인 화면에서 입력받은 값->" + userId);
		System.out.println("로그인 화면에서 입력받은 값->" + userPassword);
		
		MemberDto member = memberService.getMemberById(userId);
		
		if(userId != null && userPassword != null && member != null && member.getUserPassword() != null &&
				userPassword.equals(member.getUserPassword())){
			
		
			session.setAttribute("SID", userId);
			session.setAttribute("SLEVEL", member.getUserLevel());
			session.setAttribute("SNAME", member.getUserName());
			
			System.out.println(userId + " : 로그인 성공");
		}else {
			rAttr.addAttribute("result", "입력하신 정보는 없습니다.");
			System.out.println(userId + " : 로그인 실패");
			return "redirect:/login";
		}
		
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login(Model model
						,@RequestParam(name="result", required = false) String result) {
		model.addAttribute("title", "로그인 화면");
		
		if(result != null) model.addAttribute("result", result);
		
		return "login/login";
	}
	
	
	@PostMapping("/addMember")
	public String addMember(MemberDto member){
		
		String result = memberService.addMember(member); 
		System.out.println(result);
	
		return "login/login";
	}
	
	

	
	@RequestMapping(value="/userIdCheck", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody int userIdCheck(@RequestParam(name = "userId", required = false) String userId){
		System.out.println("아이디 중복체크 ->" + userId);
		int count = memberService.userIdCheck(userId);
		
		
		return count;
	}
	

//	@GetMapping("/sellerModifyGoods")
//	public ModelAndView sellerModifyGoods(@RequestParam(name="goodsCode", required = false) String goodsCode
//										 ,ModelAndView mav) {
//		
//		System.out.println("판매자별 상품현황 페이지에서 요청 받은 값->" + goodsCode);
//		
//		//goodsService에서 코드에 일치하는 상품정보가 담긴 객체 받아오기 
//		Goods goods = goodsService.getGoodsByCode(goodsCode);
//		
//		// model 객체와 view 논리주소를 한번에 처리할 수 있는 객체
//		mav.addObject("title", "상품 수정");
//		mav.addObject("goods", goods);
//		mav.setViewName("goods/gUpdate");
//		
//		return mav;
//	}
//	

		

	@GetMapping("/")
	public String main(Model model) {
		List<MemberDto> memberlist = memberService.viewMember();
		model.addAttribute("memberlist", memberlist);
		
		System.out.println("뜸"+ memberlist);
		
		return "index";
	}
	
	@GetMapping("/levelSelect")
	public String levelCheck() {
		
		return "member/level_select";
	}
	
	
	@GetMapping("/signUp")
	public String main2(@RequestParam(value = "user_level_code", required = false) String level,
						Model model) {
		model.addAttribute("level", level); //누른거 래밸 사용자,트레이너
		return "member/m_insert";
	}
	
	
}
