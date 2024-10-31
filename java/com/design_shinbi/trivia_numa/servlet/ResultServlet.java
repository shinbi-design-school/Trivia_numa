package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Quiz;
import com.design_shinbi.trivia_numa.model.dao.UsersDao;

public class ResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ResultServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Quiz quizs = (Quiz) session.getAttribute("quizs");
        int result = Quiz.getscore();

        // 結果をセッションに保存
        session.setAttribute("result", result);
        session.removeAttribute("quizs"); // quizsをnullにする代わりにremoveAttributeを使用

        // ユーザーIDをセッションから取得
        Integer userId = (Integer) session.getAttribute("userId");

        // JSPに結果を渡す
        request.setAttribute("result", result);
        request.setAttribute("userId", userId); // userIdもJSPに渡す

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String saveOption = request.getParameter("save");
        HttpSession session = request.getSession();

        // セッションから結果を取得
        Integer result = (Integer) session.getAttribute("result");

        if ("yes".equals(saveOption)) {
            if (result != null) { // resultがnullでないことを確認
                // セッションからユーザーIDを取得
                Integer userId = (Integer) session.getAttribute("userId");

                if (userId != null) { // userIdがnullでないことを確認
                    UsersDao usersDao = new UsersDao();
                    usersDao.saveResult(userId, result); // 結果を保存

                    // 保存完了ページにリダイレクト
                    response.sendRedirect("success.jsp");
                } else {
                    // userIdがnullの場合の処理
                    session.setAttribute("errorMessage", "ユーザーIDが正しく取得できませんでした。");
                    response.sendRedirect("error.jsp"); // エラーページにリダイレクト
                }
            } else {
                // resultがnullの場合の処理
                session.setAttribute("errorMessage", "結果が正しく取得できませんでした。");
                response.sendRedirect("error.jsp"); // エラーページにリダイレクト
            }
        } else {
            // 保存しない場合のリダイレクト
            response.sendRedirect("start.jsp");
        }
    }
}