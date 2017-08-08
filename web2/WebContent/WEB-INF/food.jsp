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


  <h2><a href="/web2/">HOME</a></h2>
  
  <h1>Food.jsp</h1>

  
  <ul>
    <li><a href='#kor'>한식</a></li>
    <li><a href='#jap'>일식</a></li>
    <li><a href='#chi'>중식</a></li>
  </ul>
  
  <div id="kor">
 	<c:forEach var="vo" items="${list}">
 	   <h2>${vo.src}</h2>
 	   <h2>${vo.name}</h2>
 	   <h2>${vo.desc}</h2>
 	</c:forEach> 
    
  </div>
  <div id="jap">
    <h1>일식</h1>
  </div>
  <div id="chi">
    <h1>중식</h1>
  </div>  
    
</body>
</html>