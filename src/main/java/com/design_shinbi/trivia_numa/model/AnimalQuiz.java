package com.design_shinbi.trivia_numa.model;

public class AnimalQuiz extends Quiz{
	
	

	private static String[][] questions = {
			{"シマエナガは何と呼ばれている？",".png"},
			{"スナネコはどこに住んでいる？",".png"},
			{"遺伝子がオオカミに一番近い犬種は？",""},
			{"この動物は何？",""},
			{"桃太郎の仲間になった鳥の種類は？",""},
			{"ラクダのコブの中には何が入っている？",""},
			{"この海の生き物の名前は？",""},
			{"タコの足は何本？",""}
	    };
	
	 private static String[][] options = {
		        {"雪の精霊","飛ぶまんじゅう","雪の妖精","雪玉"},
		        {"熱帯雨林","砂漠","湖","山岳地帯"},
		        {"柴犬","シベリアン・ハスキー","チワワ","ゴールデン・レトリバー"},
		        {"ハクビシン","アライグマ","タヌキ","アナグマ"},
		        {"スズメ","トキ","ニワトリ","キジ"},
		        {"夢","水","脂肪","内臓"},
		        {"シャチ","サメ","クジラ","マナティ"},
		        {"7本","8本","9本","10本"}
		    };
	 
	 private static String[] answers = {
		        "雪の妖精",
		        "砂漠",
		        "柴犬",
		        "タヌキ",
		        "キジ",
		        "脂肪",
		        "マナティ",
		        "8本"
		    };
	 private static String[] explanations = {
		        "シマエナガは主に北海道に生息する丸くて白い鳥です。",
		        "スナネコはその名の通り砂漠地帯に住んでいる猫です。",
		        "",
		        "",
		        "",
		        "脂肪を分解することで水を得ます。",
		        "",
		        ""
		    };
	 
	 public AnimalQuiz() {
			super(AnimalQuiz.questions, AnimalQuiz.options, AnimalQuiz.answers,AnimalQuiz.explanations);
		}


}
