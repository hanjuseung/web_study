package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Practice11Controller {
	
	@GetMapping("/practice11/first")
	public String prac11(Model model,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("accessUrl")==null) {
			model.addAttribute("accessUrl", "/first");
		} else {
			model.addAttribute("accessUrl",session.getAttribute("accessUrl"));
			
//			session.removeAttribute("accessUrl"); //특정 키값으로 삭제
			session.invalidate(); //세션 클리어
			
		}

		
		return "practice/practice11/targetPage";
	}
	@GetMapping("/practice11/firsthide1")
	public String prac11h(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("accessUrl", "/firsthide1");

		return "practice/practice11/targetPage";
	}
	@GetMapping("/practice11/firsthide2")
	public String prac11h2(HttpServletRequest request) {
		return "redirect:/practice11/first";
	}
	
	// practice12 응용버전 추가
	@GetMapping("/practice11/firsthide3")
	public String prac11h3(HttpSession session) {

		session.setAttribute("accessUrl", "/firsthide3");
		
		return "redirect:/practice11/first";
	}
}
