package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import com.design_shinbi.trivia_numa.model.Quiz;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuestionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Quiz quiz = (Quiz) session.getAttribute("quiz");
		
		if(quiz != null) {
			request.setAttribute("question", quiz.showQuestion());
			
			String[] options = new String[4];
			for (int i = 0; i < 4; i++) {
				options[i] = quiz.showOption(i);
			}
			request.setAttribute("options", options);
			
			request.getRequestDispatcher("quiz.jsp").forward(request, response);
		} else {
			response.sendRedirect("StartServlet");
		}
	}
}
