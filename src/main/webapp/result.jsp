<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>

<%
Integer result = (Integer) request.getAttribute("result");
String error = (String) request.getAttribute("error");
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
        <h2 class="result-title">5問中<%= result %>問正解</h2>

        <!-- 結果を保存するかどうかの確認フォーム -->
        <div class="result-button">
        	<form method="post" action="SaveResultServlet">
            	<p>結果を保存しますか？</p>
            	名前<input type="text" name="name">
            	<%if(error != null){ %>
            	<div id="error"><%= error %></div>
            	<%} %>
            	<button type="submit" name="save" value="yes">はい</button>
            	<button type="submit" name="save" value="no">いいえ</button>
        	</form>
		</div>
    </div>

    <script src="js/script.js"></script>
</body>
</html>
