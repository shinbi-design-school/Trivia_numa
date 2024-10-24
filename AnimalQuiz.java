package com.design_shinbi.trivia_numa.model;

public class AnimalQuiz extends Quiz{
	
	

	private static String[] questions = {
	        "シマエナガは何と呼ばれている？",
	        "スナネコはどこに住んでいる？",
	        "遺伝子がオオカミに一番近い犬種は？",
	        "この動物は何？",
	        "桃太郎の仲間になった鳥の種類は？",
	        "ラクダのコブの中には何が入っている？",
	        "この海の生き物の名前は？",
	        "タコの足は何本？",
	        "世界で最も大きな陸上動物は何ですか？",
	        "ペンギンはどの環境で主に生活していますか？",
	        "カンガルーはどの大陸に生息していますか？",
	        "オウムはどのような特長で知られていますか？"
	    };
	
	 private static String[][] options = {
		        {"雪の精霊","飛ぶまんじゅう","雪の妖精","雪玉"},
		        {"熱帯雨林","砂漠","湖","山岳地帯"},
		        {"柴犬","シベリアン・ハスキー","チワワ","ゴールデン・レトリバー"},
		        {"ハクビシン","アライグマ","タヌキ","アナグマ"},
		        {"スズメ","トキ","ニワトリ","キジ"},
		        {"夢","水","脂肪","内臓"},
		        {"シャチ","サメ","クジラ","マナティ"},
		        {"7本","8本","9本","10本"},
		        {"サイ", "シロナガスクジラ", "アフリカゾウ", "キリン"},
		        {"熱帯雨林", "砂漠", "南極地域", "高山"},
		        {"南アフリカ", "南アメリカ", "アジア", "オーストラリア"},
		        {"爬虫類の仲間", "人間の言葉を模倣する", "長い尻尾を持つ", "水中の中で生活をする"}
	 };
	 
	 private static String[] answers = {
		        "雪の妖精",
		        "砂漠",
		        "柴犬",
		        "タヌキ",
		        "キジ",
		        "脂肪",
		        "マナティ",
		        "8本",
		        "アフリカゾウ",
		        "南極地域",
		        "オーストラリア",
		        "人間の言葉を模倣する"
		    };
	 private static String[] explanations = {
		        "シマエナガは主に北海道に生息する丸くて白い鳥です。",
		        "スナネコはその名の通り砂漠地帯に住んでいる猫です。",
		        "",
		        "",
		        "",
		        "脂肪を分解することで水を得ます。",
		        "",
		        "アフリカゾウは、現存する最も大きな陸上動物です。オスのアフリカゾウは、体重が最大で約6～7トン、体長は6～7メートルに達することもあります。大きな耳と象徴的な長い牙を持ち、主にアフリカのサバンナや森林に生息しています。アフリカゾウはその巨大な体と社会的な構造が特徴的で、群れで生活することが多いです。",
		        "ペンギンは南極地域を代表する生物で、特に南極大陸周辺の寒冷な環境に生息している種が多いです。ペンギンは飛べませんが、泳ぎが非常に得意で、魚やクレイフィッシュなどを捕えるために水中での生活が中心です。もちろん、すべてのペンギンが南極に住んでいるわけではなく、南アメリカやオーストラリアの一部にも生息する種がいますが、南極地域が最も知られています。",
		        "カンガルーはオーストラリアに特有の動物で、特にオーストラリアの広大な草原や森林に生息しています。カンガルーはジャンプ力が非常に強く、後ろ足の筋肉を使って大きなジャンプをすることで知られています。オーストラリアの象徴的な動物であり、その姿はオーストラリアを代表するシンボルとしても有名です。",
		        "オウムは、非常に優れた模倣能力を持つことで知られています。彼らは、人間の言葉や環境音などを覚えて、まるで話すかのように真似することができます。この能力は、オウムの高い知能と密接に関連しています。特にアフリカグレーオウムやヒインジオウムは、言葉を覚える能力が非常に高いことで有名です。オウムはまた、色鮮やかな羽や、賢い性格、社交的な行動が特徴的です。"
		    };
	 
	 public AnimalQuiz() {
			super(AnimalQuiz.questions, AnimalQuiz.options, AnimalQuiz.answers,AnimalQuiz.explanations);
		}


}