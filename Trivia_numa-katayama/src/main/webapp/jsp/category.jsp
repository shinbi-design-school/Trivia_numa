<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>カテゴリー: <%= request.getParameter("category") %></title>
</head>
<body>
    <header>
        <h1><%= request.getParameter("category") %> クイズ</h1>
    </header>

    <main>
        <h2>クイズリスト</h2>
        <ul>
            <!-- クイズリストを動的に表示 -->
            <% 
                // 例: クイズのリストを取得し表示
                List<Quiz> quizzes = // カテゴリに基づくクイズのリストを取得
                for (Quiz quiz : quizzes) {
            %>
                <li><a href="quiz.jsp?id=<%= quiz.getId() %>"><%= quiz.getTitle() %></a></li>
            <% } %>
        </ul>
    </main>

    <footer>
        <p>© クイズサイト.jp.</p>
    </footer>
</body>
</html>
