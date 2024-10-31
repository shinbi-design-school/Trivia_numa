package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.dao.UsersDao;

public class SaveResultServlet extends HttpServlet {
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
	                // userIdがnullの場合は登録画面にリダイレクト
	                session.setAttribute("errorMessage", "ユーザーIDが見つかりません。登録画面に移動します。");
	                response.sendRedirect("register.jsp"); // ユーザー登録画面にリダイレクト
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
