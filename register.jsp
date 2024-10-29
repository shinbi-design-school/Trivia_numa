<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ユーザー登録</title>
</head>
<body>
    <h1>ユーザー登録</h1>

    <% 
        // セッションからエラーメッセージを取得
        String errorMessage = (String) session.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
        <div class="error-message" style="color: red;"><%= errorMessage %></div>
    <%
            session.removeAttribute("errorMessage"); // 表示後に削除
        }
    %>

    <form action="RegisterServlet" method="post">
        <label for="username">ユーザー名:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">パスワード:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" value="登録">
    </form>
    <a href="start.jsp">キャンセル</a>
</body>
</html>
