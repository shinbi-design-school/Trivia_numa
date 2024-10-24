package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Quiz;

/**
 * Servlet implementation class AnswerServlet
 */
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Quiz quizs = (Quiz) session.getAttribute("quizs");
		
		String Answer = request.getParameter("Answer");
		String result = null;
		
		if(Answer.equals(Quiz.answer())) {
			Quiz.score();
			result = "正解";
		}else {
			result = "はずれ";
		}
		String explanations = Quiz.getexplanations();
		Quiz.currentQuestion();
		
		String buttonUrl = null;
		if(Quiz.getCurrentQuestion()>4) {
			buttonUrl = "ResultServlet";
		}else {
			buttonUrl = "question.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("explanations", explanations);
		request.setAttribute("buttonUrl", buttonUrl);

		RequestDispatcher dispatcher = request.getRequestDispatcher("answer.jsp");
		dispatcher.forward(request, response);
	}

}
