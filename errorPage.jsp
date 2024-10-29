<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String errorMessage = (String) session.getAttribute("errorMessage");
    session.removeAttribute("errorMessage"); // メッセージを消去
%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
    <h2>エラー</h2>
    <p><%= errorMessage != null ? errorMessage : "不明なエラーが発生しました。" %></p>
    <a href="start.jsp">最初からやり直す</a>
</body>
</html>
