//package com.design_shinbi.trivia_numa.servlet;
//
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import com.design_shinbi.trivia_numa.model.UsersDAO.UsersDAO;
//
//public class RegisterServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        
//        int userId = generateTemporaryUserId(); // 適切なID生成メソッドを用意する必要があります
//
//        // UsersDaoを使って新規ユーザーを登録
//        UsersDAO usersDAO = new UsersDAO();
//        usersDAO.addUser(new UsersDAO.User(userId, username, 0, 0)); // hobby_score と study_score は初期値0
//
//        // 登録完了のメッセージをセッションに設定
//        request.getSession().setAttribute("message", "ユーザー登録が完了しました！");
//
//        // 成功ページにリダイレクト
//        response.sendRedirect("success.jsp");
//    }
//
//	private int generateTemporaryUserId() {
//		// TODO 自動生成されたメソッド・スタブ
//		return (int) (Math.random() * 10000);
//	}
//}