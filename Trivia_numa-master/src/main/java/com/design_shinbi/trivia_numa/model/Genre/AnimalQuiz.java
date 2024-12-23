package com.design_shinbi.trivia_numa.model.Genre;

import com.design_shinbi.trivia_numa.model.Quiz;

public class AnimalQuiz extends Quiz{

	private static String[][] questions = {
			{"シマエナガは何と呼ばれている？","image-animal/1.jpg"},
			{"スナネコはどこに住んでいる？","image-animal/2.jpg"},
			{"遺伝子がオオカミに一番近い犬種は？","image-animal/3.jpg"},
			{"この動物は何？","image-animal/4.jpg"},
			{"桃太郎の仲間になった鳥の種類は？","image-animal/5.png"},
			{"ラクダのコブの中には何が入っている？","image-animal/6.png"},
			{"この海の生き物の名前は？","image-animal/7.jpg"},
			{"タコの足は何本？","image-animal/8.jpg"},
			{"世界で最も大きな陸上動物は何ですか？","image-animal/9.jpg"},
			{"ペンギンはどの環境で主に生活していますか？","image-animal/10.jpg"},
			{"カンガルーはどの大陸に生息していますか？","image-animal/11.jpg"},
			{"オウムはどのような特長で知られていますか？","image-animal/12.jpg"}
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
		        "シマエナガは、白い羽と丸い体形から「雪の精霊」と呼ばれることが多い小さな鳥です。特に冬になると、雪の中で白い羽が目立つことから、「雪の精霊」として親しまれています。また、かわいらしい姿から日本でも人気があります。",
		        "スナネコは小さな猫のような動物で、乾燥した砂漠地帯に生息しています。体の構造は砂漠の環境に適応しており、日中の暑さを避けて夜行性で活動し、砂漠の小動物を捕えて食べます。",
		        "柴犬は、日本の古来の犬種で、遺伝的にオオカミに非常に近いとされています。柴犬はオオカミに似た特徴を持ち、例えば体の構造や毛の質、行動などがオオカミに似ています。シベリアン・ハスキーもオオカミに近い犬種ですが、柴犬の方が遺伝的にオオカミに近いとされています。",
		        "タヌキは日本に生息する哺乳類で、独特の顔つきとふわふわした体が特徴です。タヌキは、見た目がアライグマに似ているため混同されることもありますが、タヌキはアライグマとは異なる種で、日本の多くの地域に広く分布しています。",
		        "桃太郎の物語で、彼の仲間になる鳥は「キジ」です。キジは日本の国鳥にも指定されている鳥で、桃太郎の話では、キジが桃太郎の旅に同行し、鬼退治を助ける役割を果たします。",
		        "ラクダのコブには水ではなく、脂肪が蓄えられています。この脂肪は、砂漠の過酷な環境で長期間食事が取れない場合にエネルギー源として利用されます。コブは水分を保持するためではなく、エネルギーの貯蔵庫として重要な役割を果たしています。",
		        "マナティは「海の牛」とも呼ばれ、温暖な海域に生息する巨大な草食性の海生哺乳類です。見た目は穏やかで、主に海草を食べます。マナティはその大きさと穏やかな性格から「海の癒し系」としても知られています。",
		        "タコはその特徴的な8本の足（腕）で知られています。タコの足には吸盤が並んでいて、物をつかんだり、移動したりするために使われます。これがタコの大きな特徴で、タコの身体は柔軟で非常に高い知能を持っていることでも知られています。",
		        "アフリカゾウは、現存する最も大きな陸上動物です。オスのアフリカゾウは、体重が最大で約6～7トン、体長は6～7メートルに達することもあります。大きな耳と象徴的な長い牙を持ち、主にアフリカのサバンナや森林に生息しています。アフリカゾウはその巨大な体と社会的な構造が特徴的で、群れで生活することが多いです。",
		        "ペンギンは南極地域を代表する生物で、特に南極大陸周辺の寒冷な環境に生息している種が多いです。ペンギンは飛べませんが、泳ぎが非常に得意で、魚やクレイフィッシュなどを捕えるために水中での生活が中心です。もちろん、すべてのペンギンが南極に住んでいるわけではなく、南アメリカやオーストラリアの一部にも生息する種がいますが、南極地域が最も知られています。",
		        "カンガルーはオーストラリアに特有の動物で、特にオーストラリアの広大な草原や森林に生息しています。カンガルーはジャンプ力が非常に強く、後ろ足の筋肉を使って大きなジャンプをすることで知られています。オーストラリアの象徴的な動物であり、その姿はオーストラリアを代表するシンボルとしても有名です。",
		        "オウムは、非常に優れた模倣能力を持つことで知られています。彼らは、人間の言葉や環境音などを覚えて、まるで話すかのように真似することができます。この能力は、オウムの高い知能と密接に関連しています。特にアフリカグレーオウムやヒインジオウムは、言葉を覚える能力が非常に高いことで有名です。オウムはまた、色鮮やかな羽や、賢い性格、社交的な行動が特徴的です。"
		    };
	 
	 public AnimalQuiz() {
			super(AnimalQuiz.questions, AnimalQuiz.options, AnimalQuiz.answers,AnimalQuiz.explanations);
			
	 }


}
