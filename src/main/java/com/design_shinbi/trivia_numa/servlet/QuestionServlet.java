package com.design_shinbi.trivia_numa.servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.design_shinbi.trivia_numa.model.Quiz;
import com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz;
import com.design_shinbi.trivia_numa.model.Genre.BaseballQuiz;
import com.design_shinbi.trivia_numa.model.Genre.EntertainmentQuiz;
import com.design_shinbi.trivia_numa.model.Genre.PhotographQuiz;
import com.design_shinbi.trivia_numa.model.Genre.SoccerQuiz;
import com.design_shinbi.trivia_numa.model.programming.Html_Css;
import com.design_shinbi.trivia_numa.model.programming.JavaScript;
import com.design_shinbi.trivia_numa.model.programming.Java_F;
import com.design_shinbi.trivia_numa.model.programming.Jsp_Servlet;
import com.design_shinbi.trivia_numa.model.programming.Mysql;

public class QuestionServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String Genre = request.getParameter("Genre");
		Quiz quizs =null;
		switch (Genre){
			case "AnimalQuiz":
			 quizs = new AnimalQuiz();
			 break;
			case "BaseballQuiz":
				 quizs = new BaseballQuiz();
				 break;
			case "EntertainmentQuiz":
				 quizs = new EntertainmentQuiz();
				 break;
			case "PhotographQuiz":
				 quizs = new PhotographQuiz();
				 break;
			case "SoccerQuiz":
				 quizs = new SoccerQuiz();
				 break;
			case "Html_Css":
				 quizs = new Html_Css();
				 break;
			case "JavaScript":
				 quizs = new JavaScript();
				 break;
			case "Java_F":
				 quizs = new Java_F();
				 break;
			case "Jsp_Servlet":
				 quizs = new Jsp_Servlet();
				 break;
			case "Mysql":
				 quizs = new Mysql();
				 break;
		}
		Quiz.shuffleOption();
		session.setAttribute("quizs", quizs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("question.jsp");
		dispatcher.forward(request, response);
	}

}
