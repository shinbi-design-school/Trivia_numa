<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>結果保存完了</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <style>
        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
            margin-top: 20px;
        }

        .button:hover {
            background-color: #45a049;
        }
    </style>

    <!-- 自動遷移のための JavaScript -->
<!--    <script>-->
<!--        // 3秒後にranking.jspに自動的にリダイレクト-->
<!--        setTimeout(function() {-->
<!--            window.location.href = "ranking.jsp";-->
<!--        }, 3000);-->
<!--    </script>-->
</head>
<body>
    <div class="success-message" role="alert" aria-live="polite">
        <h1>結果が保存されました！</h1>
        <p>あなたの結果は正常にデータベースに保存されました。</p>
        <p>少々お待ちください...</p>
        <a href="start.jsp" class="button">最初からやり直す</a>  <!-- トップページへのリンク -->
    </div>

    <script src="js/scripts.js"></script>  <!-- 任意のJavaScript -->
</body>
</html>
