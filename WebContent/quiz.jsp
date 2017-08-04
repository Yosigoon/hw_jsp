<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="web1.quiz.*" %>   
 
<%
	

	String qno = request.getParameter("qno");
	String answer = request.getParameter("answer");
    
	int qnoValue = ((qno == null) ? 0:Integer.parseInt(qno));
	QuizVO vo = null;
	if(qnoValue == 10){
		qnoValue = -2;
	}else{
		QuizManager manager = new QuizManager();
		vo = manager.getNext(qnoValue, answer);
	}
	
	qnoValue++;
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(qnoValue == -1){ %>
	<img src="n.jpg">
<% }else{  %>
	<%if(vo != null) {%>
<h2><%=qnoValue%> <%=vo.getTitle() %></h2>
<form>
	<input type="hidden" name="qno" value="<%=qnoValue%>">
	<p>
	<input type="radio" name="answer" value="1" checked="checked">1번
	</p>
	<p>
	<input type="radio" name="answer" value="2">2번
	</p>
	<p>
	<input type="radio" name="answer" value="3">3번
	</p>
	<p>
	<input type="radio" name="answer" value="4">4번
	</p>
	<input type="submit" value="정답 확인">
</form>	
	<%}else{%> 
	<h1>지옥에나 가버려!</h1>
	<img src="444.jpg">
	<%}%>
<%}%>
	

</body>
</html>