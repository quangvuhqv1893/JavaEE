<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/form.css">
</head>
<body>
	<div id="container">
		<%String empId = request.getParameter("id");%>
		<form action=<%= "\"InsertData.jsp?id="+empId+"\"" %>  name="form"
			onsubmit="return checkPhone()" method="post" accept-charset="utf-8">
			<fieldset>
				<legend>Form dang ki hoc</legend>
				<!-- <input class=""text" type="hidden" name="id" value="\"+request.getParameter("id")+"\"" > -->
				<div>First name</div>
				<input class="text" type="text" name="firstName"
					placeholder="input first name" required>
				<div>
					<input id="choseFlie" type="file" name="img"
						onchange="previeImage()" alt="your image" value="Choose file"
						placeholder="" required> <img id="upImg" src="#"
						alt="your image" width="160px" height="160px" />
				</div>
				<div>Last name</div>
				<input class="text" type="text" name="lastName" value=""
					placeholder="input last name" required>
				<div>Phone number</div>
				( <input class="number" type="text" name="area" value="" size="3"
					maxlength="3" placeholder="" required> ) <input
					class="number" type="text" name="pre" size="3" maxlength="3"
					value="" placeholder="" required> - <input class="number"
					type="text" name="last" size="4" maxlength="4" value=""
					placeholder="" required><br /> <input type="radio"
					name="gender" value="male" placeholder="" required>Male<br />
				<input type="radio" name="gender" value="female" placeholder="">Females<br />
				<textarea name="description" rows="4" cols="50"
					placeholder="description"></textarea>
				<br /> <input type="radio" name="vehicle" value="bike"
					placeholder="" required>By Bike <br /> <input type="radio"
					name="vehicle" value="car" placeholder="">By Car <br /> <select
					name="way">
					<option value="meter">Meter</option>
					<option value="kilometer">Kilometer</option>
				</select> <input id="submit" type="submit" name="" value="Submit">
			</fieldset>
		</form>

	</div>
</body>
<script src="js/form.js" type="text/javascript" charset="utf-8" async
	defer></script>
</html>