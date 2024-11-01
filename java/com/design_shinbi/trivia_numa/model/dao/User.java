package com.design_shinbi.trivia_numa.model.dao;

public class User {
    private int id; // ユーザーのID
    private String name; // ユーザーの名前
    private int hobby_score; // 趣味スコア
    private int study_score; // 学習スコア

    // コンストラクタ
    public User(int id, String name, int hobby_score, int study_score) {
        this.id = id;
        this.name = name;
        this.hobby_score = hobby_score;
        this.study_score = study_score;
    }

    // ゲッター
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHobbyScore() {
        return hobby_score;
    }

    public int getStudyScore() {
        return study_score;
    }

    // セッター
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobbyScore(int hobby_score) {
        this.hobby_score = hobby_score;
    }

    public void setStudyScore(int study_score) {
        this.study_score = study_score;
    }
}
