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
		<div class="Genre" id="Genre">
			<li><a href="#animal">動物</a></li>
			<li><a href="#baseball">野球</a></li>
			<li><a href="#soccer">サッカー</a></li>
			<li><a href="#sports">スポーツ</a></li>
			<li><a href="#entertainment">芸能</a></li>
			<li><a href="#photograph">写真</a></li>
		</div>
		<div class="programming" id="programming">
			<li><a href="#html_css">HTML/CSS</a></li>
			<li><a href="#java_f">Java</a></li>
			<li><a href="#javascript">JavaScript</a></li>
			<li><a href="#jsp_servlet">JSP-servlet</a></li>
			<li><a href="#my_sql">DATABASE (MySQL)</a></li>
		</div>
	</ul>

</div>

</header>

<main>
	
<h3 class="genre">気になるクイズを選択してください！</h3>


<form method="post" action="QuestionServlet">

	<div class="button-container">
		<section id="animal">
  			<button name="Genre" value="AnimalQuiz" type="submit">
  				<img src="img/image-animal/1.jpg" alt="動物クイズ">
  				<div class="quiz-info">
  					<h4>動物クイズ</h4>
  					<p>動物に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="baseball">
  			<button name="Genre" value="BaseballQuiz" type="submit">
  				<img src="img/image-baseball/1.jpg" alt="野球クイズ">
  				<div class="quiz-info">
  					<h4>野球クイズ</h4>
  					<p>野球に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="soccer">
  			<button name="Genre" value="SoccerQuiz" type="submit">
  				<img src="img/image-soccer/1.jpg" alt="サッカークイズ">
  				<div class="quiz-info">
  					<h4>サッカークイズ</h4>
  					<p>サッカーに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="sports">
  			<button name="Genre" value="SportsQuiz" type="submit">
  				<img src="img/image-sports/1.jpg" alt="スポーツクイズ">
  				<div class="quiz-info">
  					<h4>スポーツクイズ</h4>
  					<p>スポーツ総合に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="entertainment">
  			<button name="Genre" value="EntertainmentQuiz" type="submit">
  				<img src="img/image-talent/1.jpg" alt="芸能クイズ">
  				<div class="quiz-info">
  					<h4>芸能クイズ</h4>
  					<p>芸能関係に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="photograph">
  			<button name="Genre" value="PhotographQuiz" type="submit">
  				<img src="img/image-camera/1.jpg" alt="写真クイズ">
  				<div class="quiz-info">
  					<h4>写真クイズ</h4>
  					<p>写真に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	</div>
</form>
  
<h3 class="programming">自身の知識を試してみてください！</h3>

<form method="post" action="QuestionServlet">	
	<div class="button-container">
		<section id="html_css">
  			<button name="Genre" value="Html_Css" type="submit">
  				<img src="img/image-program/1.jpg" alt="Html/Cssクイズ">
  				<div class="quiz-info">
  					<h4>HTML/CSS基礎門</h4>
  					<p>HTML5/CSS3に関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="javascript">
  			<button name="Genre" value="JavaScript" type="submit">
  				<img src="img/image-program/11.jpg" alt="JavaScriptクイズ">
  				<div class="quiz-info">
  					<h4>JavaScript基礎門</h4>
  					<p>JavaScriptに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="java_f">
  			<button name="Genre" value="Java_F" type="submit">
  				<img src="img/image-program/12.jpg" alt="Javaクイズ">
  				<div class="quiz-info">
  					<h4>Java基礎問</h4>
  					<p>Javaに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>	
  	
  		<section id="jsp_servlet">
  			<button name="Genre" value="Jsp_Servlet" type="submit">
  				<img src="img/image-program/13.jpeg" alt="Jsp_Servletクイズ">
  				<div class="quiz-info">
  					<h4>JSP/Servlet基礎問</h4>
  					<p>JSP/Servletに関する知識を試そう！！</p>
  				</div>
  			</button>
  		</section>
  	
  		<section id="my_sql">
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

</main>

<script src="js/script.js"></script>

</body>
</html>