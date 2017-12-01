<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.container div{
		
	}
	#id{
	color : blue;
		}
</style>
</head>
<body>
<div class="container">
	<div>ascasascasas</div>
	<%
		out.println("your id address: "+request.getRemoteAddr()+"<div id="+"id"+">ascasascasas</div>");
	out.println("$");
	%>
	<%= new java.util.Date()  %>
	<%! private int i=0; %>>
<%
	
for(i =0;i<=3;i++){
	out.println("<br>"+"so i la: " +i);
}
%>
<%
	for(i=0;i<=7;i++){
		out.print("<br>"+i);
	}
%>

</div>
</body>
</html>