package com.app.controller.study.practice.practice12;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class practice12Controller {
	
	@GetMapping("/practice12/login")
	public String login() {
		return "practice/practice12/login"; 
	}
	//ㄴ GetMapping login 페이지 보여주기용

	@PostMapping("/practice12/login")
	public String loginAction(HttpServletRequest request) {
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		
		//로그인 성공으로 간주하고, 로그인한 사용자 id를 세션에 저장 
		//						-> 나중에 다른 request에서도 session에 접근 및 데이터 조회 가능
		
		HttpSession session = request.getSession();
		//세션에 loginId란 이름으로 받아온 id값 저장
		session.setAttribute("loginId", request.getParameter("id"));
		session.setAttribute("count", 0);

		return "redirect:/practice12/count";
	}
	//ㄴ login 페이지에서 form 값 받아오기
	//  ㄴ 받아온 후 redirect로 count 로 주소바꾸고 맵핑
	
	@GetMapping("/practice12/count")
	public String Count(HttpSession session,Model model) {
		
		//session.getAttribute("loginId");
										//Object 타입이라 Integer 변환
		
		//로그인한 사용자가 있으면 -> count 값도 초기화 되서 있다
		
		if(session.getAttribute("loginId") !=null) {
			session.setAttribute("count",((Integer)(session.getAttribute("count"))+1));
		} else {
			model.addAttribute("count",0);
		}
		
		
		

		return "practice/practice12/count";
	}
	
	@GetMapping("/practice12/logout")
	public String logout(HttpSession session) {

		//세션 삭제 후 카운트 페이지로
		
		//session.removeAttribute("loginId");
		//session.removeAttribute("count");
		
		//하나씩 삭제 말고 전체 삭제
		session.invalidate();
		
		return "redirect:/practice12/count";
	}
}
