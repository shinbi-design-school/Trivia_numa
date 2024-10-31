<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%
int result = (int) request.getAttribute("result");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Quiz Results</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="result-body">

    <div class="result-container">
        <h2 class="result-title">10問中<%= result %>問正解</h2>
        <a class="restart-button" href="start.jsp">最初から</a>
    </div>

<footer>
	<div class="footer">
		<p>© 2024 トリビア・ヌマ</p>
	</div>
</footer>

    <script src="js/script.js"></script>
    
</body>
</html>
