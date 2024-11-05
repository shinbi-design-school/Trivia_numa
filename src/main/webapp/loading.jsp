<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>loding</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <style>
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f9f9f7;
            transition: opacity 0.5s ease; /* フェードアウトの効果 */
        }
        .loader {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            border: dashed 3px;
            border-color: #00000010 #000000 #000000;
            position: relative;
            animation-name: spin;
            animation-duration: 1s;
            animation-iteration-count: infinite;
            animation-timing-function: linear;
        }
        @keyframes spin {
            to {
                transform: rotate(360deg);
            }
        }
        .fade-out {
            opacity: 0; /* 完全に透明に */
        }
    </style>
</head>
<body>
    <section class="container">
        <div class="loader"></div>
    </section>

    <script>
        const genre = '<%= request.getParameter("Genre") != null ? request.getParameter("Genre") : "" %>';
        const waitTime = 2000; 

        // 2秒後に処理を開始
        setTimeout(function() {
            // フェードアウトを開始
            document.body.classList.add('fade-out');

            // フェードアウトが完了した後に遷移
            setTimeout(function() {
                if (genre) {
                    const form = document.createElement('form');
                    form.method = 'POST';
                    form.action = 'QuestionServlet';
                    
                    const input = document.createElement('input');
                    input.type = 'hidden';
                    input.name = 'Genre';
                    input.value = genre;

                    form.appendChild(input);
                    document.body.appendChild(form);
                    form.submit(); // フォームを送信
                } else {
                    window.location.href = "start.jsp"; // ジャンプするURL
                }
            }, 500); // フェードアウトの時間に合わせる
        }, waitTime);
    </script>
    
</body>
</html>
