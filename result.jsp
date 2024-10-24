<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.AnimalQuiz" %>
<%
int result =(int)request.getAttribute("result");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>5問中<%=result %>門正解</h2>

 <a href="start.jsp">最初から</a>
</body>
</html>