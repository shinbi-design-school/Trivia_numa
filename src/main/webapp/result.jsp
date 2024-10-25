<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%
int result =(int)request.getAttribute("result");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>

<h2>10問中<%=result %>門正解</h2>

 <a href="start.jsp">最初から</a>
 
 <script src="js/script.js"></script>
 
</body>
</html>