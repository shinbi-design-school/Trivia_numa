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
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>

<header class="top">
	
	<h2 class="title">Trivia_numa</h2>
	
	<ul class="main_nav">
		<li>動物</li>
		<li>野球</li>
		<li>サッカー</li>
		<li>スポーツ総合</li>
		<li>芸能</li>
		<li>写真</li>
		<li>HTML/CSS</li>
		<li>Java</li>
		<li>JavaScript</li>
		<li>JSP-servlet</li>
		<li>DATABASE (MySQL)</li>
	</ul>

</div>

</header>

<main>
	
<h3 class="genre">気になるクイズを選択してください！</h3>

<form method="post" action="QuestionServlet">

	<div class="button-container">
  		<button name="Genre" value="AnimalQuiz" type="submit"><img src="img/image-animal/1.jpg" alt="動物クイズ">動物クイズ</button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="BaseballQuiz" type="submit"><img src="img/image-baseball/1.jpg" alt="野球クイズ">野球クイズ</button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="SoccerQuiz" type="submit"><img src="img/image-soccer/1.jpg" alt="サッカークイズ">サッカークイズ</button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="SportsQuiz" type="submit"><img src="img/image-sports/1.jpg" alt="スポーツクイズ">スポーツクイズ</button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="EntertainmentQuiz" type="submit"><img src="img/image-talent/1.jpg" alt="芸能クイズ">芸能クイズ</button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="PhotographQuiz" type="submit"><img src="img/image-camera/1.jpg" alt="写真クイズ">写真クイズ</button>
  	</div>
  
<h3 class="programming">自身の知識を試してみてください！</h3>
	
	<div class="button-container">
  		<button name="Genre" value="Html_Css" type="submit"><img src="img/.png" alt="Html/Cssクイズ"></button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="JavaScript" type="submit"><img src="img/.png" alt="JavaScriptクイズ"></button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="Java_F" type="submit"><img src="img/.png" alt="Javaクイズ"></button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="Jsp_Servlet" type="submit"><img src="img/.png" alt="Jsp_Servletクイズ"></button>
  	</div>
  	
  	<div class="button-container">
  		<button name="Genre" value="Mysql" type="submit"><img src="img/.png" alt="Mysqlクイズ"></button>
  	</div>
  
</form>

</main>

<script src="js/script.js"></script>

</body>
</html>