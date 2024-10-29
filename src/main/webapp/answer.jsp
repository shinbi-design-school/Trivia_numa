<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String result = (String) request.getAttribute("result");
String correct = (String) request.getAttribute("correct");
String explanations = (String) request.getAttribute("explanations");
String buttonUrl = (String) request.getAttribute("buttonUrl");
%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Quiz Answer</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body class="answer-body">

    <div class="result-container">
        <h2 class="result-title"><%= result %></h2>
        <h2 class="correct-answer">正解は「<%= correct %>」です。</h2>
        <h3 class="explanation"><%= explanations %></h3>
        <a class="next-button" href="<%= buttonUrl %>">次へ</a>
    </div>

    <script src="js/script.js"></script>
</body>
</html>
