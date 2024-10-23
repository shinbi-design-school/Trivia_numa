<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%
    Integer correctCount = (Integer) session.getAttribute("correctCount");
    int totalQuestions = 10; // または動的に取得
    
    // データベースにスコアを保存する処理
    Connection conn = null; // DB接続の設定
    PreparedStatement pstmt = null;
    
    try {
        // DB接続コード（JDBC等）
        String sql = "INSERT INTO scores (correct_count, total_questions) VALUES (?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, correctCount);
        pstmt.setInt(2, totalQuestions);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // クローズ処理
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
<html>
<head>
    <title>Results</title>
</head>
<body>
    <h1>Your Results</h1>
    <p>You answered <%= correctCount %> out of <%= totalQuestions %> questions correctly!</p>
    <p>Your score: <%= (correctCount * 100) / totalQuestions %>%</p>
    <a href="category.jsp">Play Again</a>
</body>
</html>
