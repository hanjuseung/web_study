<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.ad-display-hide {
		display:none;
	}
</style>
</head>
<body>
	<h1>해당 페이지 표시 내용</h1>
	<%-- <c:if test="${onoff != 'on'}">
		<div class="box" style="border: 2px solid black;">
			<form action="/practice13/hideAd" method="post">
				<h2>광고창입니다.</h2>
				<label><input type="checkbox" name="remember" value="true">24시간보지않기</label>

				<button type="submit">닫기</button>
			</form>
		</div>
	</c:if> --%>

	<c:if test="${hideAd == null}">
		<form action="/practice13/hideAd" method="post" id="adform">
			<h2>광고창입니다.</h2>
			<label><input type="checkbox" name="hideAd" id="chk_hide">24시간보지않기</label>
			<button type="submit">닫기</button>
		</form>
	</c:if>
	
	<script>
		
		const adForm = document.getElementById("adform");
		const chkHide = document.getElementById("chk_hide");
		
		adForm.addEventListener("submit", (e)=>{
			e.preventDefault();
			
			//checkbox 체크 O -> form 요청 -> 서버 Post
			//checkbox 체크 X -> 일시적으로 안보이게 -> display:none;
			
			if(chkHide.checked == true){ //check O
				adForm.submit();
			} else { //check X
				//adForm.style.display = 'none';
				adForm.classList.add('ad-display-hide');
			}
		});
	
	</script>
</body>
</html>