package com.app.controller.study.practice.practice09;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.practice.practice07.Member;


@Controller
@RequestMapping("/practice09")
public class Practice09Controller {
	
	@GetMapping("/listTest")
	public String prac9(@RequestParam String type) {
		
		//redirect : 사용자 측에서 다시 요청을 수행 (요청 주소가 변경)
	
		//forward : 서버 측에서 바로 특정 경로로 연결 (요청 주소가 유지)
		
		//type : member -> forward
		//type : str -> redirect
		
		if(type.equals("member")) {
			return "forward:/practice07/listTest/member";
		} else {
			return "redirect:/practice07/listTest/str";
		}
		
	}

	
}