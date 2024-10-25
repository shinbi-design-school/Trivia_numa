package com.design_shinbi.trivia_numa.model.programming;

import com.design_shinbi.trivia_numa.model.Quiz;

public class JavaScript extends Quiz {
	
	
	private static String[][] questions = {
			{"JavaScriptでデータを格納するために使用する名前付きのストレージを何と呼びますか？","image-program/1.jpg"},
			{"特定の処理を実行するためにコードのブロックを定義するものを何と呼びますか？","image-program/2.jpeg"},
			{"プロパティとメソッドを持つデータの集合を何と呼びますか？","image-program/3.jpg"},
			{"複数の値を一つの変数で管理するためのデータ構造を何と呼びますか？","image-program/4.jpeg"},
			{"ユーザーのアクションやシステムの状態の変化に応じて発生するものを何と呼びますか？","image-program/5.jpg"},
			{"他の関数に引数として渡され、処理が完了した後に呼び出される関数を何と呼びますか？","image-program/6.jpg"},
			{"非同期処理の結果を表すオブジェクトで、成功または失敗を管理するためのものを何と呼びますか？","image-program/7.jpg"},
			{"変数や関数がアクセスできる範囲を何と呼びますか？","image-program/8.jpg"},
			{"オブジェクト指向プログラミングで、オブジェクトを生成するための設計図を何と呼びますか？","image-program/9.jpg"},
			{"JavaScript Object Notationの略で、データを軽量な形式で表現するために使用されるフォーマットを何と呼びますか？","image-program/10.jpg"}
	    };
	
	 private static String[][] options = {
			 {"定数", "変数", "オブジェクト", "配列"},
			 {"メソッド", "プロパティ", "コンストラクタ", "関数"},
			 {"配列", "クラス", "オブジェクト", "リスト"},
			 {"文字列", "オブジェクト", "配列", "マップ"},
			 {"コールバック", "イベント", "アクション", "トリガー"},
			 {"クロージャ", "コールバック", "フィードバック", "メソッド"},
			 {"コールバック", "プロミス", "ジェネレーター", "ストリーム"},
			 {"コンテキスト", "スコープ", "エリア", "範囲"},
			 {"プロトタイプ", "モジュール", "クラス", "インターフェース"},
			 {"XML", "CSV", "JSON", "YAML"}
	 };
	 
	 private static String[] answers = {
		        "変数",
		        "関数",
		        "オブジェクト",
		        "配列",
		        "イベント",
		        "コールバック",
		        "プロミス",
		        "スコープ",
		        "クラス",
		        "JSON"
		    };
	 private static String[] explanations = {
		        "JavaScriptでは、データを格納するために「変数」を使用します。変数は、データの一時的な保存場所で、特定の名前を持ちます。変数はvar、let、またはconstキーワードを使って宣言できます。",
		        "JavaScriptでは、特定の処理をまとめて定義したものを「関数」と呼びます。関数は、必要に応じて呼び出し、処理を実行することができます。関数はfunctionキーワードを使って定義します。",
		        "オブジェクトは、プロパティとメソッドを持つデータの集合です。プロパティは「キーと値」のペアとしてデータを保持し、メソッドはそのオブジェクトに関連する処理を定義します。",
		        "配列は、複数の値を1つの変数で管理するためのデータ構造です。JavaScriptでは、配列はインデックス（0から始まる番号）でアクセスできます。",
		        "イベントは、ユーザーのアクションやシステムの状態の変化に応じて発生するものです。例えば、クリックやキー入力、ページの読み込みなどがイベントです。JavaScriptでは、イベントリスナーを使ってイベントを処理します。",
		        "コールバックは、他の関数に引数として渡され、処理が完了した後に呼び出される関数です。非同期処理やイベント処理でよく使用されます。例えば、非同期なsetTimeout関数では、指定した時間が経過した後にコールバック関数が実行されます。",
		        "プロミスは、非同期処理の結果を表すオブジェクトで、処理が成功するか失敗するかを管理します。プロミスは、thenとcatchメソッドを使って結果を受け取ったり、エラーハンドリングを行います。",
		        "スコープは、変数や関数がアクセスできる範囲を指します。JavaScriptでは、グローバルスコープとローカルスコープ（関数スコープ）が存在します。関数内で定義された変数は、その関数内でのみアクセス可能です。",
		        "クラスはオブジェクト指向プログラミングにおいて、オブジェクトを生成するための設計図です。JavaScriptでは、classキーワードを使ってクラスを定義できます。クラスは、プロパティとメソッドを持ち、インスタンス化することでオブジェクトを生成します。",
		        "JSON（JavaScript Object Notation）は、軽量なデータ交換フォーマットです。データをテキストとして保存・交換するための形式であり、人間にも読みやすく、機械にも処理しやすいです。JSONは、オブジェクトや配列を文字列として表現します。"

		    };
	 
	 public JavaScript() {
			super(JavaScript.questions, JavaScript.options, JavaScript.answers, JavaScript.explanations);
		}

}