<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	

<%
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	double h = Double.parseDouble(height);
	double w = Double.parseDouble(weight);
	
	double bmi =w / Math.pow(h,2); 
	
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%=height%></h2>
	<h2><%=weight%></h2>	
	<h2><%=bmi%></h2>
</body>
</html>