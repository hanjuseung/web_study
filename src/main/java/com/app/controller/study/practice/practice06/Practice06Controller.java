package com.app.controller.study.practice.practice06;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.Product;
import com.app.dto.study.practice.practice06.PersonBmi;

@Controller
@RequestMapping("/practice06")
public class Practice06Controller {

	@GetMapping("/ask")
	public String ask(HttpServletRequest request) {
		return "practice/practice06/ask";
	}
	
	@PostMapping("/result")
	public String result(HttpServletRequest request) {

		String name =request.getParameter("name");
		String height =request.getParameter("height");
		String weight =request.getParameter("weight");
		
		double hei =Integer.parseInt(height);
		double wei =Integer.parseInt(weight);
		
		double bmi = wei/((hei/100)*(hei/100));
		
		request.setAttribute("name", name);
		request.setAttribute("height", height);
		request.setAttribute("weight", weight);
		request.setAttribute("bmi", bmi);
		
		return "practice/practice06/result";
	}
	
	@PostMapping("/result4")
	public String result4(@ModelAttribute PersonBmi personBmi,Model model) {

		String name =personBmi.getName();
		String height =personBmi.getHeight();
		String weight =personBmi.getWeight();
		
		double hei =Integer.parseInt(height);
		double wei =Integer.parseInt(weight);
		
		double bmi = wei/((hei/100)*(hei/100));
		
		personBmi.setBmi(bmi);
		/*
		model.addAttribute("name", name);
		model.addAttribute("height", height);
		model.addAttribute("weight", weight);
		model.addAttribute("bmi", bmi);
		*/
		model.addAttribute("presonBmi", personBmi);
		return "practice/practice06/result";
	}
	
	
	
}
