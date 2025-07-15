package com.app.controller.study.practice.practice08;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.study.practice.practice08.Member;

@Controller
public class Practice08Controller {

	@GetMapping("/practice08/member")
	public String manager(Model model, Member member, @RequestParam String auth) {
		model.addAttribute("auth", auth);
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member("user1", "pass123", "홍길동", "basic"));
		memberList.add(new Member("user2", "pass456", "김철수", "manager"));
		memberList.add(new Member("user3", "pass789", "이영희", "basic"));
		memberList.add(new Member("user4", "passabc", "박민지", "manager"));
		memberList.add(new Member("user5", "passdef", "정재영", "basic"));
		memberList.add(new Member("user6", "passxyz", "최성민", "basic"));
		memberList.add(new Member("user7", "pass123", "서지원", "manager"));
		memberList.add(new Member("user8", "pass456", "장성호", "basic"));
		memberList.add(new Member("user9", "pass789", "신지수", "basic"));
		memberList.add(new Member("user10", "passabc", "한영희", "manager"));

		model.addAttribute("memberList", memberList);
		
		/*
		List<Member> viewMemberList = new ArrayList<Member>();
		
		if(auth.equals("basic")) {
			for(Member m : memberList) {
				if(m.getType().equals("basic")) {
					viewMemberList.add(m);
				}
			}
		} else if(auth.equals("manager")) {
			for(Member m : memberList) {
				if(m.getType().equals("manager")) {
					viewMemberList.add(m);
				}
			}
		} else {
			viewMemberList = memberList;
		}
		model.addAttribute("viewMemberList", viewMemberList);
		*/
		return "practice/practice08/prac08View";
	}
}
