<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<!DOCTYPE html>
<html>
<head>
    <title>クイズ</title>
    <style>
        body { font-family: Arial, sans-serif; }
        .quiz { margin: 20px; }
        .question { font-weight: bold; }
        .explanation { font-style: italic; color: gray; }
    </style>
</head>
<body>
    <header>
        <h1>クイズ</h1>
    </header>

    <main class="quiz">
        <h2>動物クイズ</h2>
        
        <form action="answer.jsp" method="post">
            <%
                AnimalQuiz animalQuiz = new AnimalQuiz();
                String[] questions = animalQuiz.getQuestions();
                String[][] options = animalQuiz.getOptions();
                
                for (int i = 0; i < questions.length; i++) {
            %>
                <div class="question"><%= questions[i] %></div>
                <ul>
                    <%
                        for (String option : options[i]) {
                    %>
                        <li><input type="radio" name="answer<%= i %>" value="<%= option %>" required /> <%= option %></li>
                    <%
                        }
                    %>
                </ul>
            <%
                }
            %>

            <input type="hidden" name="totalQuestions" value="<%= questions.length %>">
            <button type="submit">回答を送信</button>
        </form>
    </main>

    <footer>
        <p>© クイズサイト.jp.</p>
    </footer>
</body>
</html>
