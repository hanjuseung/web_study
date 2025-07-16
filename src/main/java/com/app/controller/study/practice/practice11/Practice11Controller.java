package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Practice11Controller {
	
	@GetMapping("/practice11/first")
	public String prac11(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.setAttribute("accessUrl", "/first");

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
}
