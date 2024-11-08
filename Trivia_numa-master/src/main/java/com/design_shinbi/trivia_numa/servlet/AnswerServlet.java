package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Quiz;

public class AnswerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Quiz quizs = (Quiz) session.getAttribute("quizs");
		
		String Answer = request.getParameter("Answer");
		String correct = Quiz.answer();
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
		if(Quiz.getCurrentQuestion()>4) {	//数字を変更すると出題数を変更できる。
			buttonUrl = "ResultServlet";
		}else {
			Quiz.shuffleOption();
			buttonUrl = "question.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("correct", correct);
		request.setAttribute("explanations", explanations);
		request.setAttribute("buttonUrl", buttonUrl);

		RequestDispatcher dispatcher = request.getRequestDispatcher("answer.jsp");
		dispatcher.forward(request, response);
	}

}