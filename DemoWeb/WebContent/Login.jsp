<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="readCookie();">
	<div id="container">
		<h3>Form login</h3>
<form action=""  name="cookies" onsubmit=" javascript: return setCookies();" method="post" accept-charset="utf-8">

			Username: <input class="text"  type="text" name="username" value="" placeholder=" input uesername" ><br/>

			Password: <input class="text"  type="password" name="password" value="" placeholder=" input password"><br/>

			<input  type="checkbox" name="checkboxx" value=""> Remember User <br/>

			<input id="submit" type="submit" name="submit" value="submit">
</form>
	</div>
	
</body>
<script src="js/cookies.js" type="text/javascript" charset="utf-8" async defer></script>
</html>