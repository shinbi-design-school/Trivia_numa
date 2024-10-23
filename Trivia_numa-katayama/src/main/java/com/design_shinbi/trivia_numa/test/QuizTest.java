package com.design_shinbi.trivia_numa.test;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.design_shinbi.trivia_numa.model.Quiz;
import com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz;

class QuizTest {

    @Test
    void test() {
        Quiz quiz = new AnimalQuiz();
        Scanner sc = new Scanner(System.in);
        
        while (!quiz.isQuizComplete()) {
            System.out.println(quiz.showQuestion());
            for (int j = 0; j < 4; j++) {
                System.out.println(quiz.showOption(j));
            }        
            String line = sc.nextLine();
            if (line.equals(quiz.answer())) {
                quiz.incrementScore();
                System.out.println("正解");
            } else {
                System.out.println("はずれ");
            }
            System.out.println(quiz.getExplanations());
            
            quiz.nextQuestion();
        }
        sc.close();
        System.out.println("5問中" + quiz.getScore() + "門正解");
    }
}
