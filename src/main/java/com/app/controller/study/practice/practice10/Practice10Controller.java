package com.app.controller.study.practice.practice10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice10Controller {
	
	@GetMapping("/practice10/A")
	public String prac10A(Model model) {
		
		model.addAttribute("fromA", "fromA");
		
		return "practice/practice10/A";
	}
	
	@GetMapping("/practice10/B")
	public String prac10B(HttpSession session) {
//	public String prac10B(HttpServletRequest request) {
//		HttpSession session = request.getSession();
		
		//request : 각 요청별 독립
		//session : 브라우저(사용자)별로 구분
		session.setAttribute("BMsg", "FromB");
		return "practice/practice10/B";
	}
}
