<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li><a href="food.do">음식 정보 </a></li>
		<li><a href="inst.do">학원 정보 </a></li>
		<li><a href="join.do">회원 가입 </a></li>
	</ul>

	<h1>Hello2 Page</h1>
	<style>
	td {border: 1px solid blue;	width: 300px;background-color: pink;}
	</style>

	<table>

		<c:forEach varStatus="st" var="value" items="${list}">
			<tr>
				<td>${st.index}- ${value}</td>
			</tr>
			<tr>
				<td>${value}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>