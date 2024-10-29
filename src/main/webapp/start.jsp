<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.design_shinbi.trivia_numa.model.Quiz " %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.AnimalQuiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.BaseballQuiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.EntertainmentQuiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.PhotographQuiz" %>
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.SoccerQuiz" %> 
<%@ page import="com.design_shinbi.trivia_numa.model.Genre.SportsQuiz" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>

<header class="top">
        <div class="logo" id="top">
            <img src="images/logo/logo-3.png" alt="ロゴロゴロゴ">
        </div>

        <ul class="main_nav" id="nav">
            <li class="Genre"><a href="#genre">動物</a></li>
            <li class="Genre"><a href="#genre">野球</a></li>
            <li class="Genre"><a href="#genre">サッカー</a></li>
            <li class="Genre"><a href="#genre">スポーツ</a></li>
            <li class="Genre"><a href="#genre">芸能</a></li>
            <li class="Genre"><a href="#genre">写真</a></li>
            <li class="programming"><a href="#programming">HTML/CSS</a></li>
            <li class="programming"><a href="#programming">Java</a></li>
            <li class="programming"><a href="#programming">JavaScript</a></li>
            <li class="programming"><a href="#programming">JSP-servlet</a></li>
            <li class="programming"><a href="#programming">DATABASE (MySQL)</a></li>
        </ul>
    </header>

<main>
	
<h3 class="genre">ーーーーーー気になるクイズを選択してください！ーーーーーー</h3>


<form method="post" action="QuestionServlet">

	<div class="button-container">
		<div id="genre">
  			<button name="Genre" value="AnimalQuiz" type="submit">
  				<img src="img/image-animal/1.jpg" alt="動物クイズ">
  				<div class="quiz-info">
  					<h4>動物クイズ</h4>
  					<p>動物に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="genre">
  			<button name="Genre" value="BaseballQuiz" type="submit">
  				<img src="img/image-baseball/1.jpg" alt="野球クイズ">
  				<div class="quiz-info">
  					<h4>野球クイズ</h4>
  					<p>野球に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="genre">
  			<button name="Genre" value="SoccerQuiz" type="submit">
  				<img src="img/image-soccer/1.jpg" alt="サッカークイズ">
  				<div class="quiz-info">
  					<h4>サッカークイズ</h4>
  					<p>サッカーに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="genre">
  			<button name="Genre" value="SportsQuiz" type="submit">
  				<img src="img/image-sports/1.jpg" alt="スポーツクイズ">
  				<div class="quiz-info">
  					<h4>スポーツクイズ</h4>
  					<p>スポーツ総合に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="genre">
  			<button name="Genre" value="EntertainmentQuiz" type="submit">
  				<img src="img/image-talent/1.jpg" alt="芸能クイズ">
  				<div class="quiz-info">
  					<h4>芸能クイズ</h4>
  					<p>芸能関係に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="genre">
  			<button name="Genre" value="PhotographQuiz" type="submit">
  				<img src="img/image-camera/1.jpg" alt="写真クイズ">
  				<div class="quiz-info">
  					<h4>写真クイズ</h4>
  					<p>写真に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	</div>
</form>
  <div class="return">
		<p><a href="#top">トップへ戻る</a></p>
	</div>
<h3 class="programming">ーーーーーー自身の知識を試してみてください！ーーーーーー</h3>

<form method="post" action="QuestionServlet">	
	<div class="button-container">
		<div id="programming">
  			<button name="Genre" value="Html_Css" type="submit">
  				<img src="img/image-program/1.jpg" alt="Html/Cssクイズ">
  				<div class="quiz-info">
  					<h4>HTML/CSS基礎門</h4>
  					<p>HTML5/CSS3に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="programming">
  			<button name="Genre" value="JavaScript" type="submit">
  				<img src="img/image-program/11.jpg" alt="JavaScriptクイズ">
  				<div class="quiz-info">
  					<h4>JavaScript基礎門</h4>
  					<p>JavaScriptに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="programming">
  			<button name="Genre" value="Java_F" type="submit">
  				<img src="img/image-program/12.jpg" alt="Javaクイズ">
  				<div class="quiz-info">
  					<h4>Java基礎問</h4>
  					<p>Javaに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>	
  	
  		<div id="programming">
  			<button name="Genre" value="Jsp_Servlet" type="submit">
  				<img src="img/image-program/13.jpeg" alt="Jsp_Servletクイズ">
  				<div class="quiz-info">
  					<h4>JSP/Servlet基礎問</h4>
  					<p>JSP/Servletに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	
  		<div id="programming">
  			<button name="Genre" value="Mysql" type="submit">
  				<img src="img/image-program/4.jpeg" alt="Mysqlクイズ">
  				<div class="quiz-info">
  					<h4>DATABASE(MySQL)基礎問</h4>
  					<p>DATABASE(MySQL)に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</div>
  	</div>
 </form>
 	<div class="return">
		<p><a href="#top">トップへ戻る</a></p>
	</div>
</main>

<footer>
	<div class="footer">
		<p>© 2024 トリビア・ヌマ</p>
	</div>
</footer>

<script src="js/script.js"></script>

</body>
</html>
