package com.design_shinbi.trivia_numa.model.programming;

import com.design_shinbi.trivia_numa.model.Quiz;

public class Java_F extends Quiz {
	
	
	private static String[] questions = {
	        "オブジェクト指向プログラミングの原則の一つで、データとそれに対する操作を一つの単位としてまとめ、外部からのアクセスを制限することを何と言いますか？",
	        "あるクラスが他のクラスの特性を引き継ぐことを何と呼びますか？",
	        "同じ操作を異なるオブジェクトに対して行うことができる特性を何と言いますか？",
	        "複雑なシステムを簡素化し、重要な部分だけをモデル化するプロセスを何と呼びますか？",
	        "クラスが実装すべきメソッドの定義のみを含む構造を何と言いますか？",
	        "同じ名前のメソッドを異なる引数の型や数で定義することを何と呼びますか？",
	        "スーパークラスのメソッドをサブクラスで再定義することを何と言いますか？",
	        "プログラムの実行中に発生する予期しない事態を処理するための機構を何と呼びますか？",
	        "異なるデータ型を扱うクラスやメソッドを型安全に設計するための機能を何と呼びますか？",
	        "オブジェクトの属性や行動を定義するための設計図を何と言いますか？"
	    };
	
	 private static String[][] options = {
			 {"継承", "ポリモーフィズム", "カプセル化", "抽象化"},
			 {"カプセル化", "継承", "ポリモーフィズム", "インターフェース"},
			 {"オーバーロード", "ポリモーフィズム", "オーバーライド", "インターフェース"},
			 {"カプセル化", "継承", "抽象化", "実装"},
			 {"抽象クラス", "インターフェース", "継承", "クラス"},
			 {"オーバーライド", "オーバーロード", "ポリモーフィズム", "カプセル化"},
			 {"オーバーライド", "オーバーロード", "継承", "ポリモーフィズム"},
			 {"エラーハンドリング", "例外処理", "デバッグ", "アサーション"},
			 {"インターフェース", "カプセル化", "ジェネリクス", "継承"},
			 {"インターフェース", "クラス", "オブジェクト", "メソッド"}
	 };
	 
	 private static String[] answers = {
		        "カプセル化",
		        "継承",
		        "ポリモーフィズム",
		        "抽象化",
		        "インターフェース",
		        "オーバーロード",
		        "オーバーライド",
		        "例外処理",
		        "ジェネリクス",
		        "クラス"
		    };
	 private static String[] explanations = {
		        "カプセル化は、オブジェクト指向プログラミングの基本的な概念の一つで、データとそのデータに対する操作（メソッド）を一つの単位としてまとめることを意味します。外部から直接データにアクセスできないようにし、データの安全性や整合性を保つことが目的です。例えば、クラスの属性（フィールド）はprivateにして、アクセスメソッド（ゲッター、セッター）を通じてデータを操作します。",
		        
		        "継承は、あるクラスが他のクラスの特性（属性やメソッド）を引き継ぐ機能です。これにより、新しいクラスは既存のクラスを基にして機能を拡張することができます。例えば、Animalクラスを基にして、DogクラスがAnimalクラスの特性を持つようにすることができます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Animal {\n"
		        + "    void eat() {\n"
		        + "        System.out.println(\"Eating\");\n"
		        + "    }\n"
		        + "}\n"
		        + "\n"
		        + "class Dog extends Animal {\n"
		        + "    void bark() {\n"
		        + "        System.out.println(\"Barking\");\n"
		        + "    }\n"
		        + "}",
		        
		        "ポリモーフィズム（多態性）は、同じ操作（メソッド呼び出し）が異なるオブジェクトで異なる結果を出す能力です。これにより、異なる型のオブジェクトでも同じメソッド名で処理が可能になります。メソッドのオーバーライドやオーバーロードがポリモーフィズムの実現方法です。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Animal {\n"
		        + "    void makeSound() {\n"
		        + "        System.out.println(\"Some sound\");\n"
		        + "    }\n"
		        + "}\n"
		        + "\n"
		        + "class Dog extends Animal {\n"
		        + "    void makeSound() {\n"
		        + "        System.out.println(\"Bark\");\n"
		        + "    }\n"
		        + "}\n"
		        + "\n"
		        + "class Cat extends Animal {\n"
		        + "    void makeSound() {\n"
		        + "        System.out.println(\"Meow\");\n"
		        + "    }\n"
		        + "}",
		        
		        "抽象化は、複雑なシステムを簡素化し、重要な部分だけをモデル化するプロセスです。具体的な実装を隠し、ユーザーにはその本質的なインターフェースのみを提供します。抽象クラスやインターフェースを使用して、システムの詳細を隠蔽することができます。",
		        "インターフェースは、クラスが実装すべきメソッドの定義を含む構造で、実際のメソッドの実装は含まれません。インターフェースを実装することで、そのクラスはインターフェースで定義されたメソッドを必ず実装しなければならなくなります。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "interface Animal {\n"
		        + "    void sound();\n"
		        + "}\n"
		        + "\n"
		        + "class Dog implements Animal {\n"
		        + "    public void sound() {\n"
		        + "        System.out.println(\"Bark\");\n"
		        + "    }\n"
		        + "}",
		        
		        "オーバーロードは、同じ名前のメソッドを異なる引数の型や数で定義することです。Javaでは、同じメソッド名を使って異なるパラメータリストを持つメソッドを定義できます。これにより、引数の異なる状況に応じた処理を実装できます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Calculator {\n"
		        + "    int add(int a, int b) {\n"
		        + "        return a + b;\n"
		        + "    }\n"
		        + "\n"
		        + "    double add(double a, double b) {\n"
		        + "        return a + b;\n"
		        + "    }\n"
		        + "}",
		        
		        "オーバーライドは、スーパークラスで定義されたメソッドをサブクラスで再定義することです。これにより、サブクラスのインスタンスでは、スーパークラスで定義されたメソッドの代わりに、サブクラスで再定義されたメソッドが呼び出されます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Animal {\n"
		        + "    void sound() {\n"
		        + "        System.out.println(\"Some sound\");\n"
		        + "    }\n"
		        + "}\n"
		        + "\n"
		        + "class Dog extends Animal {\n"
		        + "    @Override\n"
		        + "    void sound() {\n"
		        + "        System.out.println(\"Bark\");\n"
		        + "    }\n"
		        + "}",
		        
		        "例外処理は、プログラムの実行中に発生する予期しない事態を処理するための機構です。Javaでは、try-catchブロックを使用して例外を捕捉し、エラーメッセージを表示したり、処理を続けることができます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "try {\n"
		        + "    int result = 10 / 0;\n"
		        + "} catch (ArithmeticException e) {\n"
		        + "    System.out.println(\"Error: Division by zero.\");\n"
		        + "}",
		        
		        "ジェネリクスは、異なるデータ型を扱うクラスやメソッドを型安全に設計するための機能です。ジェネリクスを使用することで、コンパイル時に型の安全性が保証され、ランタイムエラーを減らすことができます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Box<T> {\n"
		        + "    private T value;\n"
		        + "\n"
		        + "    public void setValue(T value) {\n"
		        + "        this.value = value;\n"
		        + "    }\n"
		        + "\n"
		        + "    public T getValue() {\n"
		        + "        return value;\n"
		        + "    }\n"
		        + "}",
		        
		        "クラスは、オブジェクトの属性（データ）と行動（メソッド）を定義するための設計図です。クラスを使ってオブジェクトをインスタンス化し、実際のデータとメソッドを利用できます。\n"
		        + "java\n"
		        + "サンプルコード\n"
		        + "class Car {\n"
		        + "    String brand;\n"
		        + "    void drive() {\n"
		        + "        System.out.println(\"Driving\");\n"
		        + "    }\n"
		        + "}\n"
		        + "\n"
		        + "Car myCar = new Car();\n"
		        + "myCar.drive();  // \"Driving\" と表示される"
		    };
	 
	 public Java_F() {
			super(Java_F.questions, Java_F.options, Java_F.answers, Java_F.explanations, "Java_F");
		}

}
