package com.design_shinbi.trivia_numa.model;

import java.util.ArrayList;
import java.util.Collections;

public class Quiz {
    private String[] questions;
    private String[][] options;
    private String[] answers;
    private String[] explanations;
    private String genre;

    private ArrayList<Integer> questionOrder;
    private int currentQuestion;
    private int score;

    public Quiz(String[] questions, String[][] options, String[] answers, String[] explanations, String genre) {
        this.questions = questions;
        this.options = options;
        this.answers = answers;
        this.explanations = explanations;
        this.genre = genre;

        questionOrder = new ArrayList<>();
        for (int i = 0; i < this.questions.length; i++) {
            questionOrder.add(i);
        }
        Collections.shuffle(questionOrder); // 初期シャッフル
        currentQuestion = 0;
        score = 0;
    }

    // シャッフルメソッド
    public void shuffleQuestions() {
        Collections.shuffle(questionOrder);
    }

    public String showQuestion() {
        return questions[questionOrder.get(currentQuestion)];
    }

    public String showOption(int optionNumber) {
        return options[questionOrder.get(currentQuestion)][optionNumber];
    }

    public String answer() {
        return answers[questionOrder.get(currentQuestion)];
    }

    public void nextQuestion() {
        if (currentQuestion < questionOrder.size() - 1) {
            currentQuestion++;
        } else {
            throw new IllegalStateException("No more questions available.");
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Integer> getQuestionOrder() {
        return questionOrder;
    }

    public int getCurrentQuestionIndex() {
        return currentQuestion;
    }

    public String getExplanations() {
        return explanations[questionOrder.get(currentQuestion)];
    }

    public boolean isQuizComplete() {
        return currentQuestion >= questionOrder.size();
    }

    public void reset() {
        currentQuestion = 0;
        score = 0;
        Collections.shuffle(questionOrder); // リセット時にもシャッフル
    }
    
    public String[] getAllQuestions() {
        return questions;
    }

    public String[] getOptionsForCurrentQuestion() {
        return options[questionOrder.get(currentQuestion)];
    }

    public String getGenre() {
        return genre;
    }
}
