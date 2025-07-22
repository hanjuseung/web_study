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
	<form action="/admin/users/add" method="post">
		<label>사용자 아이디 : <input type="text" name="id"></label><br>
		<label>사용자 이름 : <input type="text" name="name"></label><br>
		
		<button type="submit">등록하기</button>
	</form>
</body>
</html>