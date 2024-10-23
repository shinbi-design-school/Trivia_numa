package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import com.design_shinbi.trivia_numa.model.Quiz;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class StartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StartServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // クイズのデータを定義
        String[] questions = {
            "Question 1?",
            "Question 2?",
            "Question 3?"
            // 他の質問を追加
        };

        String[][] options = {
            {"Option 1-1", "Option 1-2", "Option 1-3", "Option 1-4"},
            {"Option 2-1", "Option 2-2", "Option 2-3", "Option 2-4"},
            {"Option 3-1", "Option 3-2", "Option 3-3", "Option 3-4"}
            // 他の選択肢を追加
        };

        String[] answers = {
            "Option 1-1",  // 正解の選択肢
            "Option 2-2",
            "Option 3-3"
            // 他の正解を追加
        };

        String[] explanations = {
            "Explanation for Question 1",
            "Explanation for Question 2",
            "Explanation for Question 3"
            // 他の説明を追加
        };

        // Quizオブジェクトを作成
        Quiz quiz = new Quiz(questions, options, answers, explanations, "General");
        quiz.shuffleQuestions(); // 質問をシャッフル

        // セッションにクイズを保存
        HttpSession session = request.getSession();
        session.setAttribute("quiz", quiz);

        // 最初の質問を表示するサーブレットにリダイレクト
        response.sendRedirect("QuestionServlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}

