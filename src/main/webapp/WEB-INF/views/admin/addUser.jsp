<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>관리자 페이지</h1>
	<h2>사용자(User) 추가</h2>
	
	<!-- 모든 값을 입력받는 케이스 -->
	<!-- <form action="/admin/users/add" method="post">
		<label>사용자 아이디 : <input type="text" name="id"></label><br>
		<label>사용자 비밀번호 : <input type="password" name="pw"></label><br>
		<label>사용자 이름 : <input type="text" name="name"></label><br>
		<span>계정 구분</span>
		<select name="userType">
			<option value="CUS">사용자</option>
			<option value="ADM">관리자</option>
		</select>
		<button type="submit">등록하기</button>
	</form> -->
	
	<!-- 필요한 값들만 입력받는 케이스 -->
	<form action="/admin/users/add" method="post" id="form_add">
		<label>사용자 아이디 : <input type="text" name="id" id="input_id"></label><br>
		<label>사용자 이름 : <input type="text" name="name" id="input_name"></label><br>
		
		<button type="submit">등록하기</button>
	</form>
	
	<script>
		const form_add = document.getElementById('form_add');
		form_add.addEventListener('submit', (event)=>{
			event.preventDefault(); //submit 전송 중지
			
			let id = document.getElementById('input_id').value;
			id = id.trim();
			//유효성 검증
			if( id == ''){
				return;
			}
			
			if( id.length < 2){
				return;
			}
			
			//유효성, 제약조건 처리
			
			//모두 통과 OK
			form_add.submit();
		})
	</script>
	
</body>
</html>