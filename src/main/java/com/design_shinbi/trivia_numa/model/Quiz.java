package com.design_shinbi.trivia_numa.model;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
	private static String[][] questions;
	private static String[][] options;
	private static String[] answers;
	private static String[] explanations;
	
	private static ArrayList<Integer> questionOrder;
    private static int currentQuestion;
    private static int score;
    
    public Quiz(String[][] questions, String[][] options, String[] answers, String[]explanations) {
    	Quiz.questions =questions;
    	Quiz.options =options;
    	Quiz.answers =answers;
    	Quiz.explanations =explanations;
    	questionOrder = new ArrayList<>();
    	currentQuestion = 0;
        score = 0;

    	for (int i = 0; i < Quiz.questions.length; i++) {
    		questionOrder.add(i);
        }
        Collections.shuffle(questionOrder);
    }
    
    public static String showQuestion() {
    	String question =questions[questionOrder.get(getCurrentQuestion())][0];
    	return question;
    }
    public static String showImg() {
    	String img =questions[questionOrder.get(getCurrentQuestion())][1];
    	return img;
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
