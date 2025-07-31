package com.app.dto.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRequestForm {
	//특정 화면에서 요청 들어온 데이터를 담아야하는 용도 DTO
	//화면별로 요청시 검증해야하는 기준이 다른 경우
	//요청FORM 별 객체를 구분해서 유효성 기준 작성
	
	
	//필수입력 빈칸 X
		@NotBlank(message = "아이디 필수로 쳐라")
		String id;
		
		//입력 길이 제한 8 ~ 12
		@Size(min=8 ,max=12, message = "비번 길이 확인해라")
		String pw;
		
		
		String name;
		
		String userType;
}
