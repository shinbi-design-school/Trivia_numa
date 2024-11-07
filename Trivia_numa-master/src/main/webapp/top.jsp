<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>トップページ</title>    
    
    <link rel="icon" href="img/logo-1.png" type="image/x-icon"> 
    
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* ビューポート全体を使う */
            margin: 0 auto;
            background-color: #f0f0f0; /* 背景色 */
            flex-direction: column; /* 縦に配置 */
            background-color: #003366;
        }
        
        #logo-container {
            width: 400px; /* ボックスの幅に合わせる */
            height: 500px; /* 高さは自動調整 */
            border-radius: 100%; /* 丸くする */
            box-shadow: 0 20px 0 0rgba(0, 0, 0, 0.5); /* シャドウ効果 */
            position: relative; /* 位置を相対的にする */
            overflow: hidden; /* はみ出た部分を隠す */
        }

        #logo {
            width: 400px; /* 幅を指定 */
            height: 500px; /* 高さを指定 */
            border-radius: 100%; /* 丸くする */
            object-fit: cover; /* 画像のフィットを調整 */
            opacity: 0; /* 初期状態は透明 */
            transition: opacity 1s ease; /* フェードインのトランジション */
             box-shadow: 0 10px 20px rgba(0, 0, 0, 0.6); /* 画像の下に影を追加 */
        }

        #start-button {
            position: absolute; /* 絶対位置に設定 */
            bottom: 20%; /* ボタンの位置を調整 */
            left: 50%; /* 左から中央に配置 */
            transform: translate(-50%, 50%); /* 中央揃え */
            display: none; /* 初期状態は非表示 */
            padding: 10px 20px; /* ボタンの内側の余白 */
            font-size: 16px; /* フォントサイズ */
            color: #fff; /* 文字色 */
            background-color: red; /* ボタンの背景色 */
            border: none; /* 枠線なし */
            border-radius: 5px; /* 角を丸く */
            cursor: pointer; /* カーソルをポインターに */
            animation: blink 1s infinite; /* 点滅アニメーション */
        }
        
        #start-button:hover {
            background-color: #ffcc33; /* ホバー時の色 */
        }

        @keyframes blink {
            0%, 100% {
                opacity: 0.7; /* 点滅の最初と最後の透明度 */
            }
            50% {
                opacity: 1; /* 中間の透明度 */
            }
        }

        h4, p {
            margin: 10px 0; /* 上下のマージン */
            text-align: center; /* 中央揃え */
        }
    </style>
</head>
<body>
        <h4 style="color: #fff;">画面をクリック、またはタップしてください</h4>
    <div id="logo-container">
        <img src="img/logo-1.png" alt="ロゴマーク" id="logo" onclick="startGame()">
    </div>
    
    <script>
        document.addEventListener("DOMContentLoaded", () => {
            const logo = document.getElementById("logo");
            const startButton = document.getElementById("start-button");

            // 使用する画像の配列
            const images = [
                'img/logo-1.png',
                'img/logo-2.png'
            ];
            let currentImageIndex = 0;

            // フェードイン・アウトを繰り返す関数
            const fadeInOut = () => {
                logo.style.opacity = "1"; // フェードイン
                setTimeout(() => {
                    logo.style.opacity = "0"; // フェードアウト
                    setTimeout(() => {
                        // 画像を差し替え
                        currentImageIndex = (currentImageIndex + 1) % images.length; // インデックスを更新
                        logo.src = images[currentImageIndex]; // 新しい画像をセット
                        fadeInOut(); // 再帰呼び出し
                    }, 1000); // フェードアウト後に1秒待つ
                }, 2000); // フェードインの時間（2秒）
            };

            // 最初のフェードイン・アウトを開始
            fadeInOut();

            // スタートボタンの表示
            setTimeout(() => {
                startButton.style.display = "block"; // スタートボタンを表示
            }, 5000); // 5秒後に表示
            
            logo.addEventListener('click', () => {
                startGame(); // 画像をクリックしたらゲームをスタート
            });
        });

        // スタートボタンの役割を果たす関数
        function startGame() {
            location.href = 'start.jsp'; // スタートページに移動
        }
    </script>
</body>
</html>
