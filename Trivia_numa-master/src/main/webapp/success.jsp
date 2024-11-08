<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.design_shinbi.trivia_numa.model.entity.User" %>

<%
    List<User> ranking = (List<User>) request.getAttribute("ranking");
%>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>Ranking</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
            color: #333;
        }

        .container {
            width: 80%;
            max-width: 1000px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            margin-top: 50px;
        }

        #ranking_box {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .user {
            background-color: #f1f1f1;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .user:hover {
            background-color: #e0e0e0;
        }

        .name {
            font-size: 18px;
            font-weight: bold;
            color: #333;
        }

        .score {
            font-size: 16px;
            color: #007BFF;
            font-weight: bold;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 30px;
            font-size: 16px;
        }

        a:hover {
            background-color: #45a049;
        }

        /* モバイル対応 */
        @media (max-width: 768px) {
            .container {
                width: 90%;
                padding: 15px;
            }

            .user {
                padding: 10px;
                flex-direction: column;
                text-align: center;
            }

            .name, .score {
                font-size: 16px;
                margin-bottom: 5px;
            }
        }
    </style>
</head>
<body>

    <div class="container">
        <div id="ranking_box">
            <%
            for(User rank : ranking) {
            %>
            <div class="user">
                <div class="name"><%= rank.getName() %></div>
                <div class="score"><%= rank.getScore() %></div>
            </div>
            <%
            }
            %>
        </div>
        <a href="start.jsp">最初から</a>
    </div>

    <script src="js/scripts.js"></script> <!-- 任意のJavaScript -->
</body>
</html>
