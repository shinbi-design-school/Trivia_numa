package com.design_shinbi.trivia_numa.model.Genre;

import com.design_shinbi.trivia_numa.model.Quiz;

public class PhotographQuiz extends Quiz{
	
	

	private static String[] questions = {
	        "世界で最初に撮影された写真は、何年に撮影されたでしょう？",
	        "「ゴールデンアワー」とは、写真撮影においてどの時間帯を指すでしょう？",
	        "有名なアーティストの「アーノルド・ニューウェル」は、何を専門にした写真家でしょう？",
	        "「マクロ写真」とは何を撮影することを指しますか？",
	        "写真における「露出」とは、何を指すでしょう？",
	        "フィルム写真とデジタル写真の主な違いは何でしょう？",
	        "「構図」とは、写真のどの要素を指すでしょう？",
	        "「ストリートフォトグラフィー」は、主にどのような場面を捉えることを目的としていますか？",
	        "有名な写真家アニー・リーボヴィッツは、主にどのような分野で知られていますか？",
	        "「バーストモード」とは、どのような撮影方法でしょう？"
	    };
	
	 private static String[][] options = {
			 {"1826年", "1839年", "1848年", "1851年"},
			 {"真昼", "夕方から夜にかけての時間帯", "朝日が昇る時間帯", "日没後の暗闇"},
			 {"自然風景", "ストリートフォトグラフィー", "ポートレート", "食品写真"},
			 {"大きな風景", "小さな被写体の詳細", "人物の表情", "動物の行動"},
			 {"被写体の大きさ", "カメラの設定", "光の量", "シャッタースピード"},
			 {"シャッタースピード", "使用する三脚の有無", "レンズの焦点距離", "撮影に使うメディアの種類"},
			 {"色の使い方", "被写体の配置", "シャッタースピード", "レンズの選択"},
			 {"自然の風景", "都市の生活や人々の瞬間", "スポーツのアクション", "動物の生態"},
			 {"風景写真", "スポーツ写真", "動物写真", "ポートレート写真"},
			 {"一連の写真を連続して撮影すること", "長時間露光で撮影すること", "一つの被写体を多角的に撮影すること", "フィルターを使って撮影すること"}
	 };
	 
	 private static String[] answers = {
		        "1826年",
		        "朝日が昇る時間帯",
		        "ポートレート",
		        "小さな被写体の詳細",
		        "光の量",
		        "撮影に使うメディアの種類",
		        "被写体の配置",
		        "都市の生活や人々の瞬間",
		        "ポートレート写真",
		        "一連の写真を連続して撮影すること"
		    };
	 private static String[] explanations = {
		        "世界で最初に撮影された写真は、フランスのジョセフ・ニセフォール・ニエプスによって1826年に撮影されました。この写真は「窓の景色」として知られており、非常に粗いものでしたが、カメラオブスクラを使用して、8時間以上の露出で撮影されたと考えられています。この技術が、後の写真技術の礎となりました。",
		        "ゴールデンアワーとは、日出直後や日没前後の時間帯を指し、この時間帯は自然光が柔らかく、温かい色合いが特徴的です。写真家にとって、ゴールデンアワーは最も美しい光が得られる時間として、ポートレートや風景写真に最適な時間帯とされています。",
		        "アーノルド・ニューウェルは、特にポートレート写真で有名な写真家です。彼は、セレブリティや有名人を撮影することで知られ、その作品はしばしば彼の被写体の「個性」を引き出す独特な手法で評価されました。彼のポートレートは非常に表現力豊かで、しばしば被写体の内面を映し出すものとされています。",
		        "マクロ写真は、非常に小さな被写体を大きく、詳細に撮影する技法を指します。昆虫や花、微細な物のテクスチャーなどを撮るために用いられる技術で、マクロレンズを使って細部まで鮮明に写し出します。このような写真は、肉眼では見逃しがちな細かいディテールを捉えることができるため、非常に魅力的です。",
		        "露出は、カメラのセンサーが光にどれだけ反応するか、つまり「どれだけの光がセンサーに当たるか」を指します。露出はシャッタースピード、絞り、ISOの3つの要素によって調整されます。適切な露出にすることで、写真が明るすぎず暗すぎず、自然な見た目になります。",
		        "フィルム写真とデジタル写真の最大の違いは、撮影時に使うメディアです。フィルム写真は化学的なフィルムを使って画像を記録するのに対し、デジタル写真は電子的なセンサー（CCDやCMOS）を使って画像をデジタルデータとして保存します。デジタルカメラは、画像をそのままメモリーカードに保存するため、即座に画像を確認できるというメリットがあります。",
		        "構図は、写真における「被写体の配置」を指します。つまり、カメラ内でどのように被写体を配置するか、また背景とのバランスをどう取るかといったことです。良い構図は、写真に視覚的なバランスや引き込まれる魅力を与え、観る人の目を自然に誘導します。構図の基本的なルールには「三分割法」などがあります。",
		        "ストリートフォトグラフィーは、都市の生活の中での人々の瞬間を捉えることを目的とした写真撮影のジャンルです。このスタイルでは、日常的な風景や人々の自然な姿をドキュメンタリーのように撮影することが多いです。被写体が自然に行動している瞬間を捉えることで、その街や文化の生き生きとした一面を表現します。",
		        "アニー・リーボヴィッツは、特にポートレート写真で非常に有名な写真家です。彼女は、セレブリティや有名人を撮影したポートレートで広く知られ、その作品は非常に表現力豊かで深い感情を伝えるものが多いです。彼女の作品は、時には芸術的な要素も強く、被写体の個性や物語性を強調することが特徴です。",
		        "バーストモードは、カメラがシャッターを押している間に連続して複数の写真を撮影する機能です。このモードは、動きが速いスポーツや、動物の行動など、決定的な瞬間を捉えたい時に役立ちます。高速で連続的に撮影することで、最も良い瞬間を逃さずに撮影することができます。"
		    };
	 
	 public PhotographQuiz() {
			super(PhotographQuiz.questions, PhotographQuiz.options, PhotographQuiz.answers,PhotographQuiz.explanations);
		}


}
