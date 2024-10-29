package com.design_shinbi.trivia_numa.model.programming;

import com.design_shinbi.trivia_numa.model.Quiz;

public class Jsp_Servlet extends Quiz {
	
	
	private static String[][] questions = {
			{"JSPは何の略ですか？","image-program/1.jpg"},
			{"サーブレットのライフサイクルにおいて、最初に呼び出されるメソッドはどれですか？","image-program/2.jpeg"},
			{"JSP内でJavaコードを埋め込むために使用される構文を何と呼びますか？","image-program/3.jpg"},
			{"サーブレットでHTTPリクエストを表すオブジェクトは何ですか？","image-program/4.jpeg"},
			{"サーブレットでセッションを管理するために使用されるオブジェクトは何ですか？","image-program/5.jpg"},
			{"JSPでカスタムタグを作成するための技術を何と呼びますか？","image-program/6.jpg"},
			{"サーブレットからJSPへリクエストを転送するために使用されるメソッドは何ですか？","image-program/7.jpg"},
			{"JSPファイル内の設定や情報を記述するための要素を何と呼びますか？","image-program/8.jpg"},
			{"JSPで使用される、プロパティを持つJavaオブジェクトを何と呼びますか？","image-program/9.jpg"},
			{"サーブレットやJSPがリクエストを処理する前または後に、そのリクエストやレスポンスを変更するJavaクラスを何と呼びますか？","image-program/10.jpg"}
	    };
	
	 private static String[][] options = {
			 {"Java Server Pages", "Java Simple Pages", "JavaScript Pages", "Java Server Processing"},
			 {"init()", "service()", "doGet()", "destroy()"},
			 {"エクスプレッション", "スクリプトレット", "ディレクティブ", "コメント"},
			 {"HttpResponse", "HttpSession", "HttpRequest", "ServletContext"},
			 {"HttpSession", "HttpRequest", "ServletContext", "HttpResponse"},
			 {"JSTL", "EL", "タグライブラリ", "スクリプトレット"},
			 {"include()", "redirect()", "forward()", "dispatch()"},
			 {"コメント", "スクリプトレット", "エクスプレッション", "ディレクティブ"},
			 {"JavaObject", "JavaBean", "JavaClass", "JavaComponent"},
			 {"リスナー", "フィルタ", "サーブレット", "コントローラー"}
	 };
	 
	 private static String[] answers = {
		        "Java Server Pages",
		        "init()",
		        "スクリプトレット",
		        "HttpRequest",
		        "HttpSession",
		        "タグライブラリ",
		        "forward()",
		        "ディレクティブ",
		        "JavaBean",
		        "フィルタ"
		    };
	 private static String[] explanations = {
		        "JSP（Java Server Pages）は、Javaを使って動的なウェブページを作成するための技術です。HTMLにJavaコードを埋め込むことで、サーバー側で処理された結果をクライアントに返すことができます。JSPは、サーバーサイドで動作し、ウェブアプリケーションのユーザーインターフェースを作成するのに使われます。",
		        "サーブレットは、サーブレットコンテナ（例：Tomcat）によって管理され、ライフサイクルに従って動作します。最初に呼び出されるのはinit()メソッドです。このメソッドはサーブレットが初めてリクエストを受け取る前に1回だけ実行され、サーブレットの初期化を行います。次にservice()メソッドが呼ばれ、リクエストを処理します。",
		        "JSP内でJavaコードを埋め込むための構文は「スクリプトレット」と呼ばれます。スクリプトレットは、<% %>の間にJavaコードを書き、サーバー側で実行されて結果がHTMLに埋め込まれます。",
		        "サーブレットでHTTPリクエストを表すオブジェクトはHttpServletRequestです。このオブジェクトは、クライアントから送られてきたリクエスト情報（パラメータやヘッダ、リモートIPアドレスなど）を取得するために使用されます。これを使って、フォームデータを取得したり、リクエストのメソッド（GETやPOST）を確認したりできます。",
		        "サーブレットでセッションを管理するために使用されるのは、HttpSessionオブジェクトです。これを使って、ユーザーごとの情報（ログイン状態やショッピングカートの内容など）をサーバー側に保持し、リクエスト間で共有することができます。セッションは、通常はクッキーを使って識別されます。",
		        "JSPでカスタムタグを作成するための技術は「タグライブラリ」です。タグライブラリを使用することで、既存のタグでは実現できない機能をJSPに追加できます。カスタムタグは、Javaコードを使って処理を行い、その結果をHTMLとして出力することができます。これにより、JSPのコードがより簡潔かつ再利用可能になります。",
		        "サーブレットからJSPへリクエストを転送するために使用されるメソッドはforward()です。これを使って、リクエストを別のリソース（例えば、JSPページ）に転送できます。RequestDispatcherオブジェクトを使って、次のように呼び出します",
		        "JSPのディレクティブは、JSPページの設定や動作に関する情報を提供するための要素です。ディレクティブは<%@ %>の構文を使って記述し、JSPページの動作を変更したり、必要なリソースをインクルードしたりするのに使います。例えば、ページの内容をキャッシュするための設定などに使用されます。",
		        "JSPで使用される、プロパティを持つJavaオブジェクトは「JavaBean」です。JavaBeanは、プロパティ（フィールド）を持ち、そのプロパティにアクセスするためのgetterおよびsetterメソッドを提供するクラスです。これにより、JSP内でデータの表示や操作が簡単にできます。",
		        "フィルタは、リクエストおよびレスポンスを処理するためのJavaクラスです。フィルタは、サーブレットやJSPがリクエストを処理する前または後に、そのリクエストやレスポンスを変更したり、ログを記録したりするのに使用されます。例えば、認証チェックやリクエストのロギングを行う場合などに使われます。"
		    };
	 
	 public Jsp_Servlet() {
			super(Jsp_Servlet.questions, Jsp_Servlet.options, Jsp_Servlet.answers, Jsp_Servlet.explanations);
		}

}