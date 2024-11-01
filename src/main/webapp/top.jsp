<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
	<script type="text/javascript">
    function redirectToHome() {
        const logo = document.querySelector('.logo');
        logo.classList.add('visible'); // フェードインを開始

        setTimeout(function() {
            window.location.href = "start.jsp"; // トップページのJSPファイル名
        }, 4000); 
    }

    window.onload = function() {
        const logo = document.querySelector('.logo');
        logo.classList.remove('visible'); // 初期状態でロゴを非表示に
        redirectToHome();
    };
</script>
	
</head>
<body onload="redirectToHome()">
    <header class="top">
        <div class="logo fade-in" id="top">
    <img src="images/logo/logo-3.png" alt="ロゴロゴロゴ" style="max-width: 40%; height: auto;">
</div>
        
    </header>
    <main>
        <div id="logo-container">
        	<p id="loading-text">LOADING</p>
        </div>
    </main>
    <footer>
        <div class="footer-container">
            <div class="footer-content">
                <p>© 2024 トリビア・ヌマ</p>
            </div>
        </div>
    </footer>
    
    <script src="js/script.js"></script>
    
</body>
</html>
