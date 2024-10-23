package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import com.design_shinbi.trivia_numa.model.Quiz;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class AnswerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AnswerServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Quiz quiz = (Quiz) session.getAttribute("quiz");
        String userAnswer = request.getParameter("answer");

        if (quiz != null && userAnswer != null) {
            if (userAnswer.equals(quiz.answer())) {
                quiz.incrementScore(); // スコアをインクリメント
            }
            quiz.nextQuestion(); // 現在の質問を進める

            // 次の質問があるかチェック
            if (!quiz.isQuizComplete()) {
                response.sendRedirect("QuestionServlet");
            } else {
                request.setAttribute("score", quiz.getScore());
                request.getRequestDispatcher("result.jsp").forward(request, response);
            }
        } else {
            response.sendRedirect("StartServlet");
        }
    }
}
