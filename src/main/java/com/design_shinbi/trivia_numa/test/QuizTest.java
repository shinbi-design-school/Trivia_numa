package com.design_shinbi.trivia_numa.test;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.design_shinbi.trivia_numa.model.Quiz;
import com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz;

class QuizTest {

	@Test
	void test() {
		Quiz quizs = new AnimalQuiz();
		Scanner sc = new Scanner(System.in);
		
		while (Quiz.getCurrentQuestion()<5) {
			System.out.println(Quiz.showQuestion());
		for(int j=0;j<4;j++) {
			System.out.println(Quiz.showOption(j));
		}		
		String line = sc.nextLine();
		if(line.equals(Quiz.answer())) {
			Quiz.score();
			System.out.println("正解");
		}else {
			System.out.println("はずれ");
		}
		System.out.println(Quiz.getexplanations());
		
		Quiz.currentQuestion();
		}
		sc.close();
		System.out.println("5問中"+Quiz.getscore()+"門正解");

	}

}
