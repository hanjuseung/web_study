package com.app.controller.study.practice.practice13;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.util.MyCookieUtil;

@Controller
public class practice13Controller {
	/*
	@GetMapping("/practice13/hideAd")
	public String hideAd(HttpServletRequest request, Model model) {
		Cookie[] cookies = request.getCookies();
		boolean aaa = true;
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("response")) {
					aaa = false;
					break;
				}
			}
		}
		if (aaa == true) {
			model.addAttribute("onoff", "off");
		} else
			model.addAttribute("onoff", "on");
		return "practice/practice13/test";
	}

	@PostMapping("/practice13/hideAd")
	public String hideAdd(HttpServletResponse response,HttpServletRequest request) {
		String lang = request.getParameter("remember");
		if(lang.equals("true")) {
			Cookie ck1 = new Cookie("response", "dd");
			ck1.setMaxAge(60 * 60 * 24);
			ck1.setPath("/");
			response.addCookie(ck1);
		}

		return "redirect:/practice13/hideAd";
	}
	*/
	
//	---------------------------------------------------------------------------
	@GetMapping("/practice13/hideAd")
	public String hideAd(HttpServletRequest request) {
		
		String hideAd = MyCookieUtil.getCookie(request, "hideAd");
		if(hideAd != null ) {
			request.setAttribute("hideAd", hideAd);
		}
		return "practice/practice13/test";
	}
	
	@PostMapping("/practice13/hideAd")
	public String hideAdAction(HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println(request.getParameter("hideAd"));
		//24시간 보지않기 체크 후 요청을 했으면
		// 쿠키에 값 저장 -> 나중에 해당 화면 접근시, 광고 표시 여부로 활용
		
		if(request.getParameter("hideAd") != null) {
			Cookie ck = MyCookieUtil.createCookie("hideAd", "hideAd",60*60*24);
			response.addCookie(ck);
		}
		
		return "redirect:/practice13/hideAd";
	}
}
