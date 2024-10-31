<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    HttpSession session = request.getSession();
    String message = (String) session.getAttribute("message");
    session.removeAttribute("message"); // メッセージを表示後に削除
%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>保存完了</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <div class="container">
        <h1>結果の保存が完了しました！</h1>
        <% if (message != null) { %>
            <p><%= message %></p>
        <% } %>
        <a href="start.jsp">最初から</a>
    </div>
</body>
</html>
