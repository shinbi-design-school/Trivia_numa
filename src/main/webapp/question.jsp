<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.AnimalQuiz" %>

<%
Quiz quizs =(Quiz)session.getAttribute("quizs");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><%=Quiz.showQuestion() %></h2>
<img src="img/<%=Quiz.showImg() %>" alt="質問画像">

<form method="post" action="AnswerServlet">
<%
for(int j=0;j<4;j++) {
%>	
<button name="Answer" value="<%=Quiz.showOption(j) %>" type="submit"><%=Quiz.showOption(j) %></button>
<%
}
%>
</form>

</body>
</html>