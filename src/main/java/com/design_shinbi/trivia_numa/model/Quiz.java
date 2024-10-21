package com.design_shinbi.trivia_numa.model;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
	private static String[] questions;
	private static String[][] options;
	private static String[] answers;
	private static String[] explanations;
	
	private static ArrayList<Integer> questionOrder = new ArrayList<>();
    private static int currentQuestion = 0;
    private static int score = 0;
    
    public Quiz(String[] questions, String[][] options, String[] answers, String[]explanations) {
    	Quiz.questions =questions;
    	Quiz.options =options;
    	Quiz.answers =answers;
    	Quiz.explanations =explanations;

    	for (int i = 0; i < this.questions.length; i++) {
            getQuestionOrder().add(i);
        }
        Collections.shuffle(getQuestionOrder());
    }
    
    public static String showQuestion() {
    	String question =questions[questionOrder.get(getCurrentQuestion())];
    	return question;
    }
    
    public static String showOption(int optionnumber) {
    		String option =options[questionOrder.get(getCurrentQuestion())][optionnumber];
    	return option;
    }
    public static String answer() {
    	String answer =answers[questionOrder.get(getCurrentQuestion())];
    	return answer;
    }
    public static void currentQuestion() {
    	currentQuestion++;
    }
    public static void score() {
    	score++;
    }
    public static int getscore() {
    	return score;
    }
	public static ArrayList<Integer> getQuestionOrder() {
		return questionOrder;
	}
	public static int getCurrentQuestion() {
		return currentQuestion;
	}
	public static String getexplanations() {
		return explanations[questionOrder.get(currentQuestion)];
	}
}
