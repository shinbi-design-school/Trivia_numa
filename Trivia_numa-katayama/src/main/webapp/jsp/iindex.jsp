<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.BaseballQuiz" %>
<!DOCTYPE html>
<html>
<head>
    <title>クイズサイト.jp - ホーム</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>クイズサイト.jp</h1>
        <p>歴史やアニメ、雑学などあらゆるトピックが楽しく学べるクイズサイト</p>
    </header>

    <nav>
        <h2>カテゴリー</h2>
        <ul>
            <li><a href="category.jsp?category=漫画・アニメ">漫画・アニメ</a></li>
            <li><a href="category.jsp?category=歴史">歴史</a></li>
            <li><a href="category.jsp?category=スポーツ">スポーツ</a></li>
            <li><a href="category.jsp?category=心理テスト">心理テスト</a></li>
            <li><a href="category.jsp?category=動物">動物</a></li>
            <li><a href="category.jsp?category=教育">教育</a></li>
            <li><a href="category.jsp?category=国旗">国旗</a></li>
            <li><a href="category.jsp?category=エンターテイメント">エンターテイメント</a></li>
            <li><a href="category.jsp?category=ゲーム">ゲーム</a></li>
            <li><a href="category.jsp?category=雑学">雑学</a></li>
        </ul>
    </nav>

    <main>
        <h2>クイズ一覧</h2>
        
        <h3>動物クイズ</h3>
        <%
            AnimalQuiz animalQuiz = new AnimalQuiz();
            for (int i = 0; i < animalQuiz.getQuestions().length; i++) {
        %>
            <div>
                <p><%= animalQuiz.showQuestion() %></p>
                <ul>
                    <%
                        for (int j = 0; j < animalQuiz.getOptions()[i].length; j++) {
                    %>
                        <li><%= animalQuiz.showOption(j) %></li>
                    <%
                        }
                    %>
                </ul>
                <hr>
            </div>
        <%
            }
        %>

        <h3>野球クイズ</h3>
        <%
            BaseballQuiz baseballQuiz = new BaseballQuiz();
            for (int i = 0; i < baseballQuiz.getQuestions().length; i++) {
        %>
            <div>
                <p><%= baseballQuiz.showQuestion() %></p>
                <ul>
                    <%
                        for (int j = 0; j < baseballQuiz.getOptions()[i].length; j++) {
                    %>
                        <li><%= baseballQuiz.showOption(j) %></li>
                    <%
                        }
                    %>
                </ul>
                <hr>
            </div>
        <%
            }
        %>

    </main>

    <footer>
        <p>© クイズサイト.jp.</p>
    </footer>
</body>
</html>
