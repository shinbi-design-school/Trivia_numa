<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String result =(String)request.getAttribute("result");
String explanations =(String)request.getAttribute("explanations");
String buttonUrl =(String)request.getAttribute("buttonUrl");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2><%=result %></h2>
<h3><%=explanations %></h3>
<a href=<%=buttonUrl %>>次へ</a>

</body>
</html>