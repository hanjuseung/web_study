package com.app.controller.study.practice.practice03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.Product;
import com.app.dto.study.ProductRequestForm;
import com.app.dto.study.practice.practice03.Beverage;
import com.app.dto.study.practice.practice03.DrinkItem;

@Controller
@RequestMapping("/practice03")
public class Practice03Controller {

	@GetMapping("/request1-1")
	public String request11(HttpServletRequest request) {
		
		// /practice03/request1-x?item=americano&type=coffee
		System.out.println("/request1-1 요청");
		
//		String item = request.getParameter("item");
//		String type = request.getParameter("type");
//		System.out.println(item);
//		System.out.println(type);
		
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));

		
		return "practice/practice03/request1-1";
	}
	
	@GetMapping("/request1-2")
	public String request12(@RequestParam(required = false) String item,
							@RequestParam(required = false) String type) {
		
		// /practice03/request1-x?item=americano&type=coffee
		System.out.println("/request1-2 요청");
		System.out.println(item);
		System.out.println(type);
		
		
		return "practice/practice03/request1-1";
	}
	
	@GetMapping("/request1-3")
	public String request13(@RequestParam Map<String,String> map) {
		
		// /practice03/request1-x?item=americano&type=coffee
		System.out.println("/request1-3 요청");

		System.out.println(map.get("item"));
		System.out.println(map.get("type"));
		
		
		return "practice/practice03/request1-1";
	}
	
	@GetMapping("/request1-4")
	public String request14(Model model,@RequestParam Beverage beverage) {
		
		// /practice03/request1-x?item=americano&type=coffee
		System.out.println("/request1-4 요청");
		System.out.println(beverage);
		return "practice/practice03/request1-1";
	}
	
	@GetMapping("/request2-1")
	public String request21(HttpServletRequest request) {
		
		System.out.println("/request2-1");
		
		request.setAttribute("item","americano");
		request.setAttribute("type","coffee");
		
		
		return "practice/practice03/request2";
	}
	
	@GetMapping("/request2-2")
	public String viewData22(Model model) {
		
		System.out.println("/request2-2");
		model.addAttribute("item","americano");
		model.addAttribute("type","coffee");
		
		return "practice/practice03/request2";
	}
	
	@GetMapping("/request2-3")
	public ModelAndView request23(ModelAndView mav) {
		
		System.out.println("/request2-3");
		mav.setViewName("practice/practice03/request2");
		mav.addObject("item","americano");
		mav.addObject("type","coffee");
		
		return mav;
	}
	
	@GetMapping("/request2-4")
	public String viewData5(Model model) {
		
		System.out.println("/request2-4");
		
		//객체 전달
		ProductRequestForm productRequestForm = new ProductRequestForm();
		productRequestForm.setName("americano");
		productRequestForm.setType("coffee");
		model.addAttribute("item","americano");
		model.addAttribute("type","coffee");
		model.addAttribute("ProductRequestForm",productRequestForm);
		
		DrinkItem drinkItem = new DrinkItem();
		drinkItem.setName("콜라");
		drinkItem.setType("탄산음료");
		model.addAttribute("drinkItem",drinkItem);
		return "practice/practice03/request2";
	}
	
	
}
