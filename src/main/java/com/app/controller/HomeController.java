package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//	@RequsetMapping("/")
	public String home() {

//return "/WEB-INF/views/home.jsp";
//return "/WEB-INF/views/mainpage.jsp";

//--ViewResolver 설정 이후
//		return "mainpage";
		
		
		return "home";
	}
}