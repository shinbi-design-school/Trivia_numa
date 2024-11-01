<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
 <%@ page import="com.design_shinbi.trivia_numa.model.entity.User" %>
<%
    List<User> ranking = (List<User>) request.getAttribute("ranking");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <div class="container">
 <div id="ranking_box">
 <%
 for(User rank : ranking){
 %>
 <div class="user">	
 <div class="name"><%=rank.getName() %></div>
 <div class="score"><%=rank.getScore() %></div>
 </div> 
 <%
 }
 %>
 </div>
        <a href="start.jsp">最初から</a>
    </div>


</body>
</html>