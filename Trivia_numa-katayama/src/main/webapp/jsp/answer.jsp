<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%@ page import="java.sql.*" %>
<%
    AnimalQuiz animalQuiz = new AnimalQuiz();
    String[] answers = animalQuiz.getAnswers();
    String[] explanations = animalQuiz.getExplanations();
    int totalQuestions = Integer.parseInt(request.getParameter("totalQuestions"));
    
    int correctCount = 0;
    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < totalQuestions; i++) {
        String userAnswer = request.getParameter("answer" + i);
        if (userAnswer != null && userAnswer.equals(answers[i])) {
            correctCount++;
            result.append("Question ").append(i + 1).append(": Correct!<br>");
        } else {
            result.append("Question ").append(i + 1).append(": Incorrect. Correct answer: ").append(answers[i]).append("<br>");
        }
        result.append("Explanation: ").append(explanations[i]).append("<br><br>");
    }
    
    // スコアをデータベースに保存
    Connection conn = null;
    PreparedStatement pstmt = null;
    
    try {
        // DB接続コード（適切に設定してください）
        String sql = "INSERT INTO scores (correct_count, total_questions) VALUES (?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, correctCount);
        pstmt.setInt(2, totalQuestions);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>結果</title>
</head>
<body>
    <h1>結果</h1>
    <p>あなたの正解数: <%= correctCount %> / <%= totalQuestions %></p>
    <p><%= result.toString() %></p>
    <a href="category.jsp">もう一度プレイする</a>
</body>
</html>
