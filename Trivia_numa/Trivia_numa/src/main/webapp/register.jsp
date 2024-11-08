<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ユーザー登録</title>
    <style>
    body {
    	font-family: Arial, sans-serif;
    	background-color: #f4f4f4;
    	margin: 0;
    	padding: 20px;
	}

	h1 {
    	text-align: center;
    	color: #333;
	}

	form {
    	background: #fff;
    	border-radius: 5px;
    	box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    	max-width: 400px;
    	margin: 20px auto;
    	padding: 20px;
	}

	label {
    	display: block;
    	margin-bottom: 5px;
    	color: #555;
	}

	input[type="text"], input[type="password"] {
    	width: 94%;
    	padding: 10px;
    	margin-bottom: 20px;
    	border: 1px solid #ccc;
    	border-radius: 3px;
    	font-size: 16px;
	}

	input[type="submit"] {
    	background-color: #5cb85c;
    	color: white;
    	padding: 10px;
    	border: none;
    	border-radius: 3px;
    	cursor: pointer;
    	font-size: 16px;
    	width: 100%;
	}

	input[type="submit"]:hover {
    	background-color: #4cae4c;
	}

	.error-message {
    	background-color: #f8d7da;
    	color: #721c24;
    	padding: 10px;
    	border: 1px solid #f5c6cb;
    	border-radius: 3px;
    	margin-bottom: 20px;
	}

	a {
    	display: block;
    	text-align: center;
    	margin-top: 10px;
    	color: #007bff;
    	text-decoration: none;
	}

	a:hover {
    	text-decoration: underline;
	}
    </style>
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