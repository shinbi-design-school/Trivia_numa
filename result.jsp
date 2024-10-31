<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%
    // リクエストからresultを安全に取得
    Integer resultObj = (Integer) request.getAttribute("result");
    int result = (resultObj != null) ? resultObj : 0; // nullの場合は0に設定

    // セッションからuserIdを取得
    Integer userId = (Integer) session.getAttribute("userId"); // ユーザーIDをセッションから取得
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

        <!-- 結果を保存するかどうかの確認フォーム -->
        <div class="result-button">
        	<form method="post" action="SaveResultServlet">
            	<input type="hidden" name="userId" value="<%= (userId != null) ? userId : "" %>"> <!-- ユーザーIDを隠しフィールドに -->
            	<p>結果を保存しますか？</p>
            	<button type="submit" name="save" value="yes">はい</button>
            	<button type="submit" name="save" value="no">いいえ</button>
        	</form>
		</div>
    </div>

    <script src="js/script.js"></script>
</body>
</html>
