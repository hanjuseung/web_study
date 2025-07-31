package com.app.dto.user;

import lombok.Data;

@Data
public class UserValidError {

	//유효성 검증 결과 저장용
	//값 X(null) 통화
	//값 O : 검증틍과실패, 에러 메세지
	
	String id;
	String pw;
	String name;
	String userType;
}
