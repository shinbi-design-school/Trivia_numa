<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%
Quiz quizs = (Quiz) session.getAttribute("quizs");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Quiz Page</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="quiz-body">

    <div class="quiz-container">
        <h2 class="quiz-question"><%= Quiz.showQuestion() %></h2>
        <img class="quiz-image" src="img/<%= Quiz.showImg() %>" alt="質問画像">

    <form class="quiz-form" method="post" action="AnswerServlet">
		<div class="button-wrap">
        	<% for(int j = 0; j < 4; j++) { %>	
            	<button class="quiz-button" name="Answer" value="<%= Quiz.getOptionList().get(j) %>" type="submit">
                	<%= Quiz.getOptionList().get(j) %>
            	</button>
        	<% } %>
    	</div>
	</form>
    </div>

    <script src="js/script.js"></script>
</body>
</html>
