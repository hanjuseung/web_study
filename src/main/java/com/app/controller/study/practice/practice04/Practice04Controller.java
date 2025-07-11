package com.app.controller.study.practice.practice04;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.practice.practice04.CtgDTO;
import com.app.dto.study.practice.practice04.Menu;

@Controller
@RequestMapping("/practice04")
public class Practice04Controller {

	@GetMapping("/request1-1")
	public String request11(HttpServletRequest request) {
		
		System.out.println("/request1-1 요청");
		
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));

		
		return "practice/practice04/viewData";
	}
	
	@GetMapping("/request1-2")
	public String request12(@RequestParam(required = false) String category,
							@RequestParam(required = false) String product) {
		
		System.out.println("/request1-2 요청");
		System.out.println(category);
		System.out.println(product);
		
		
		return "practice/practice04/viewData";
	}
	
	@GetMapping("/request1-3")
	public String request13(@ModelAttribute CtgDTO ctgDTO) {
		
		System.out.println("/request1-3 요청");
		System.out.println(ctgDTO.getCategory());
		System.out.println(ctgDTO.getProduct());
		System.out.println(ctgDTO);
		return "practice/practice04/viewData";
	}
	
	@GetMapping("/request1-4")
	public String request14(@RequestParam Map<String,String> map) {

		System.out.println("/request1-4 요청");

		System.out.println(map.get("category"));
		System.out.println(map.get("product"));
		
		
		
		return "practice/practice04/viewData";
	}
	
	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		System.out.println("/practice04/viewData1-1");
		request.setAttribute("category", "한식");
		request.setAttribute("menu", "비빔밥");
		
		return "practice/practice04/viewData";
	}
	

	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		System.out.println("/practice04/viewData1-2");
		model.addAttribute("category", "중식");
		model.addAttribute("menu", "짜장면");
		
		return "practice/practice04/viewData";
	}
	

	@GetMapping("/viewData1-3")
	public ModelAndView viewData1_3() {
		System.out.println("/practice04/viewData1-3");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("practice/practice04/viewData");
		mav.addObject("category", "일식");
		mav.addObject("menu", "초밥");
		
		return mav;
	}
	

	@GetMapping("/viewData1-4")
	public String viewData1_4(Model model) {
		System.out.println("/practice04/viewData1-4");

		Menu menuItem = new Menu();
		menuItem.setCategory("양식");
		menuItem.setMenu("파스타");
		
		model.addAttribute("menuItem", menuItem);
		
		return "practice/practice04/viewData";
	}
}
