package com.app.controller.study.practice.practice01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/practice/practice01")
public class Practice01Controller {

	@GetMapping("/main")
	public String main() {
		return "/practice/practice01/main";
	}
	@GetMapping("/product/mouse")
	public String mouse() {
		return "/practice/practice01/product/mouse";
	}
	@GetMapping("/product/keyboard")
	public String keyboard() {
		return "/practice/practice01/product/keyboard";
	}
}





