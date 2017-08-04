<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Test Page </h1>
	<h2><%=new java.util.Date()%></h2>
	<p>
	텍스트 <input type="text">
	</p>
	<p>
	<textarea rows="10" cols="30 name="contents">textarea 사이즈 조절 가능하네?
	</textarea>
	</p>
	<p>
	<input type="radio" name="gender" value="male" checked >남
	<input type="radio" name="gender" value="female">여
	</p>
	<p>
	E-mail 주소 : 
	<input type="email">
	<input type="submit" value="확인">
	</p>
	<p>
	<input type="checkbox" name="tellecom" value="SKT" checked>SKT
	<input type="checkbox" name="tellecom" value="LGT">LGT
	<input type="checkbox" name="tellecom" value="KT" >KT
	</p>
	전화번호 : <input type="tel">
	<input type="submit" value="인증">
	<p>
	오늘 날짜 선택 : <input type="date" value="2017-08-07">
	</p>
	<input type="submit" value="회원가입">
	<p>
	
	<img src="444.jpg">




</body>
</html>