package com.design_shinbi.trivia_numa.model.entity;

public class User {
	private int id;
	private String name;
	private int score;
	
	public User() {
	}

	public User(String name,int score) {
	this.name = name;
	this.score = score;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
	String string = "User [id=" + id + ", name=" + name +", score="+score+
	 "]";
	return string;
	}

}