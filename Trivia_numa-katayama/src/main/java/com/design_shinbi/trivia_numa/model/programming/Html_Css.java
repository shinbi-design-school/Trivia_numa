package com.design_shinbi.trivia_numa.model.programming;

import com.design_shinbi.trivia_numa.model.Quiz;

public class Html_Css extends Quiz {
	
	
	private static String[] questions = {
	        "次のうち、HTMLの基本文書の開始タグはどれですか？",
	        "HTML文書のタイトルを設定するタグはどれですか？",
	        "段落を作成するために使用するHTMLタグはどれですか？",
	        "次のCSSプロパティの中で、背景色を指定するものはどれですか？",
	        "次のうち、特定のクラスを持つ要素を選択するCSSセレクタはどれですか？",
	        "CSSのボックスモデルに含まれない要素はどれですか？",
	        "HTMLで画像を挿入するためのタグはどれですか？",
	        "順序なしリストを作成するために使用するHTMLタグはどれですか？",
	        "CSSでフォントサイズを指定するためのプロパティはどれですか？",
	        "テキストの色を変更するために使用するCSSプロパティはどれですか？"
	    };
	
	 private static String[][] options = {
			 {"<start>", "<html>", "<body>", "<head>"},
			 {"<title>", "<header>", "<h1>", "<name>"},
			 {"<p>", "<div>", "<section>", "<span>"},
			 {"color", "background-color", "font-color", "bgcolor"},
			 {"#classname { ... }", ".classname { ... }", "classname { ... }", "*classname { ... }"},
			 {"padding", "margin", "border", "spacing"},
			 {"<img>", "<image>", "<picture>", "<src>"},
			 {"<ol>", "<ul>", "<list>", "<item>"},
			 {"font-size", "text-size", "size", "font-style"},
			 {"color", "text-color", "font-color", "bgcolor"}
	 };
	 
	 private static String[] answers = {
		        "<html>",
		        "<title>",
		        "<p>",
		        "background-color",
		        ".classname { ... }",
		        "spacing",
		        "<img>",
		        "<ul>",
		        "font-size",
		        "color"
		    };
	 private static String[] explanations = {
		        "HTML文書は<html>タグで始まり、</html>タグで終わります。このタグはHTML文書全体を囲む役割を持っています。その中に、ヘッダー部分（<head>）や本文部分（<body>）などが含まれます。\n"
		        + "html\n"
		        + "サンプルコード\n"
		        + "<html>\n"
		        + "    <head>\n"
		        + "        <title>ページのタイトル</title>\n"
		        + "    </head>\n"
		        + "    <body>\n"
		        + "        <p>これは段落です。</p>\n"
		        + "    </body>\n"
		        + "</html>",
		        
		        "HTMLの<title>タグは、ブラウザのタブに表示されるページのタイトルを設定するために使います。<title>タグは<head>タグの中に置く必要があります。\n"
		        + "html\n"
		        + "サンプルコード\n"
		        + "<head>\n"
		        + "    <title>ページのタイトル</title>\n"
		        + "</head>",
		        
		        "<p>タグは段落を作成するためのタグです。<p>タグで囲まれたテキストは、自動的に段落として扱われ、前後にマージンが挿入されます。\n"
		        + "html\n"
		        + "サンプルコード\n"
		        + "<p>これは段落です。</p>",
		        
		        "background-colorは、要素の背景色を指定するCSSプロパティです。例えば、次のように使用します：\n"
		        + "css\n"
		        + "サンプルコード\n"
		        + "body {\n"
		        + "    background-color: lightblue;\n"
		        + "}",
		        
		        ".classnameはクラスセレクタと呼ばれ、特定のクラスを持つHTML要素をターゲットにするCSSの書き方です。#はIDセレクタ、何も付けないと要素セレクタです。\n"
		        + "css\n"
		        + "サンプルコード\n"
		        + ".button {\n"
		        + "    background-color: blue;\n"
		        + "}",
		        
		        "CSSのボックスモデルには、要素を取り囲む4つの領域があります：padding（内側の余白）、margin（外側の余白）、border（枠線）、そしてcontent（コンテンツ）。spacingという要素は存在しません。",
		        "HTMLで画像を挿入するには、<img>タグを使用します。画像のソースはsrc属性で指定します。\n"
		        + "html\n"
		        + "サンプルコード\n"
		        + "<img src=\"image.jpg\" alt=\"画像の説明\">\n"
		        + "画像が読み込めない場合に表示されるテキストは、alt属性で指定します。",
		        
		        "<ul>タグは「順序なしリスト」（unordered list）を作成するためのタグです。順序なしリストは、リストアイテムを点やその他の記号で表示します。順序付きリストを作成したい場合は、<ol>タグを使用します。\n"
		        + "html\n"
		        + "サンプルコード\n"
		        + "<ul>\n"
		        + "    <li>アイテム1</li>\n"
		        + "    <li>アイテム2</li>\n"
		        + "</ul>",
		        
		        "font-sizeは、文字の大きさを指定するCSSプロパティです。例えば、次のように使います。\n"
		        + "css\n"
		        + "サンプルコード\n"
		        + "p {\n"
		        + "    font-size: 18px;\n"
		        + "}",
		        
		        "colorは、テキストの色を指定するCSSプロパティです。例えば、次のように使用します。\n"
		        + "css\n"
		        + "サンプルコード\n"
		        + "p {\n"
		        + "    color: red;\n"
		        + "}"
		    };
	 
	 public Html_Css() {
			super(Html_Css.questions, Html_Css.options, Html_Css.answers, Html_Css.explanations, "Html_Css");
		}

}
