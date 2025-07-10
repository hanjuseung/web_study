package com.app.controller.study.practice.practice02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/practice/practice02")
public class Practice02Controller {

	// localhost:8080/practice/practice02/req1
	@GetMapping("/req1")
	public String req1(HttpServletRequest request) {
		System.out.println("practice02/req1");
		System.out.println("GET 요청");
		return "/practice/practice02/req1";
	}
	
	@PostMapping("/req2")
	public String req2(HttpServletRequest request) {
		System.out.println("practice02/req2");
		System.out.println("POST 요청");
		return "/practice/practice02/req2";
	}
	
	@RequestMapping("/req3")
	public String req3(@RequestParam String data1,@RequestParam String data2) {
		
		//http://localhost:8080/practice/practice02/req3?data1="data1값받았음"&data2="data2값받았음"
		System.out.println("practice02/req3");
		System.out.println(data1);
		System.out.println(data2);
		
		return "practice/practice02/req3";
	}
}
