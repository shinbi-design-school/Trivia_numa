package com.design_shinbi.trivia_numa.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Dao.HobbyDAO;
import com.design_shinbi.trivia_numa.model.Dao.StudyDAO;
import com.design_shinbi.trivia_numa.model.entity.User;
import com.design_shinbi.trivia_numa.util.DbUtil;

public class SaveResultServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();	
		String save = request.getParameter("save");
		String error = "";
		if(save.equals("no")) {
			
			session.removeAttribute("result");
			 session.removeAttribute("scoretype");
			RequestDispatcher dispatcher = request.getRequestDispatcher("start.jsp");
			dispatcher.forward(request, response);
			
		}else {
			Integer result = (Integer) session.getAttribute("result");
			String scoretype =(String)session.getAttribute("scoretype");
			
			String name = request.getParameter("name");
			if (name == null || name.isEmpty()) {
			error = "名前を入力してください。";
			request.setAttribute("error", error);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response);
			}
			
			if (error.isEmpty()) {
				try {
					Connection connection = DbUtil.connect();
					
					if(scoretype.equals("hobby_score")) {
						HobbyDAO dao = new HobbyDAO(connection);
						dao.hobbyAdd(name,result);
						List<User> ranking = dao.findHobby();
						request.setAttribute("ranking", ranking);
						
					}else {
						StudyDAO dao = new StudyDAO(connection);
						dao.studyAdd(name,result);
						List<User> ranking = dao.findStudy();
						request.setAttribute("ranking", ranking);
					}

					connection.close();
					} catch (Exception e) {
					throw new ServletException(e);
					}
			}
			 session.removeAttribute("result");
			 session.removeAttribute("scoretyp");
			 
			RequestDispatcher dispatcher = request.getRequestDispatcher("sucess.jsp");
			dispatcher.forward(request, response);
		}
	}
}

			
	



