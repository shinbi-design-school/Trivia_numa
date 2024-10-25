package com.design_shinbi.trivia_numa.model.programming;

import com.design_shinbi.trivia_numa.model.Quiz;

public class Html_Css extends Quiz {
	
	
	private static String[][] questions = {
			{"次のうち、HTMLの基本文書の開始タグはどれですか？","image-program/1.jpg"},
			{"HTML文書のタイトルを設定するタグはどれですか？","image-program/2.jpg"},
			{"段落を作成するために使用するHTMLタグはどれですか？","image-program/3.jpg"},
			{"次のCSSプロパティの中で、背景色を指定するものはどれですか？","image-program/4.jpg"},
			{"次のうち、特定のクラスを持つ要素を選択するCSSセレクタはどれですか？","image-program/5.jpg"},
			{"CSSのボックスモデルに含まれない要素はどれですか？","image-program/6.jpg"},
			{"HTMLで画像を挿入するためのタグはどれですか？","image-program/7.jpg"},
			{"順序なしリストを作成するために使用するHTMLタグはどれですか？","image-program/8.jpg"},
			{"CSSでフォントサイズを指定するためのプロパティはどれですか？","image-program/9.jpg"},
			{"テキストの色を変更するために使用するCSSプロパティはどれですか？","image-program/10.jpg"}
	    };
	
	 private static String[][] options = {
			 {"startタグ", "htmlタグ", "bodyタグ", "headタグ"},
			 {"titleタグ", "headerタグ", "h1タグ", "nameタグ"},
			 {"pタグ", "divタグ", "sectionタグ", "spantタグ"},
			 {"color", "background-color", "font-color", "bgcolor"},
			 {"#classname { ... }", ".classname { ... }", "classname { ... }", "*classname { ... }"},
			 {"padding", "margin", "border", "spacing"},
			 {"imgタグ", "imageタグ", "pictureタグ", "srcタグ"},
			 {"olタグ", "ulタグ", "listタグ", "itemタグ"},
			 {"font-size", "text-size", "size", "font-style"},
			 {"color", "text-color", "font-color", "bgcolor"}
	 };
	 
	 private static String[] answers = {
		        "htmlタグ",
		        "titleタグ",
		        "&lt;p&gt;",
		        "background-color",
		        ".classname { ... }",
		        "spacing",
		        "imgタグ",
		        "ulタグ",
		        "font-size",
		        "color"
		    };
	 private static String[] explanations = {
		        "HTML文書は&lt;html&gt;で始まり、&lt;/html&gt;で終わります。このタグはHTML文書全体を囲む役割を持っています。その中に、ヘッド部分（head）や本文部分（body）などが含まれます。",
		        "HTMLの&lt;title&gt;タグは、ブラウザのタブに表示されるページのタイトルを設定するために使います。&lt;title&gt;タグは&lt;head&gt;タグの中に置く必要があります。",
		        "&lt;p&gt;タグは段落を作成するためのタグです。&lt;p&gt;タグで囲まれたテキストは、自動的に段落として扱われ、前後にマージンが挿入されます。",
		        "background-colorは、要素の背景色を指定するCSSプロパティです。例えば、次のように使用します。",
		        ".classnameはクラスセレクタと呼ばれ、特定のクラスを持つHTML要素をターゲットにするCSSの書き方です。#はIDセレクタ、何も付けない場合は要素セレクタと呼ばれます。",
		        "CSSのボックスモデルには、要素を取り囲む4つの領域があります。padding（内側の余白）、margin（外側の余白）、border（枠線）、そしてcontent（コンテンツ）。spacingという要素は存在しません。",
		        "HTMLで画像を挿入するには、&lt;img&gt;タグを使用します。画像のソースはsrc属性で指定します。画像が読み込めない場合に表示されるテキストは、alt属性で指定します。",
		        "&lt;ul&gt;タグは「順序なしリスト」（unordered list）を作成するためのタグです。順序なしリストは、リストアイテムを点やその他の記号で表示します。順序付きリストを作成したい場合は、&lt;ol&gt;タグを使用します。",
		        "font-sizeは、文字の大きさを指定するCSSプロパティです。指定する際は、pxや%、emなど、色々な単位を使うことができます。",
		        "colorは、テキストの色を指定するCSSプロパティです。指定する際は、キーワード、カラーコード、RGB値、HSL値などの値を使うことができます。"
		    };
	 
	 public Html_Css() {
			super(Html_Css.questions, Html_Css.options, Html_Css.answers, Html_Css.explanations);
		}

}