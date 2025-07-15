<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:if test="${auth == 'basic'}">
			<c:forEach var="p" items="${memberList}">
				<c:if test="${p.type == 'basic'}">
					<p>${p.id} ${p.pw} ${p.name} ${p.type}</p>
				</c:if>
			</c:forEach>
		</c:if>
		<c:if test="${auth == 'manager'}">
			<c:forEach var="p" items="${memberList}">
				<c:if test="${p.type == 'manager'}">
					<p>${p.id} ${p.pw} ${p.name} ${p.type}</p>
				</c:if>
			</c:forEach>
		</c:if>
		<c:if test="${auth != 'manager' && auth != 'basic'}">
			<c:forEach var="p" items="${memberList}">
				<p>${p.id} ${p.pw} ${p.name} ${p.type}</p>
			</c:forEach>
		</c:if>
</body>
</html>