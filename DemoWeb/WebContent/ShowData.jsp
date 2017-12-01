<%@page import="org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
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

	<% 
Connection connect = null;
	Statement s = null;

try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=User;user=sa;password=1");
s = connect.createStatement();

String sql = "SELECT * FROM  Employee ORDER BY EmployeeID ASC";

ResultSet rec = s.executeQuery(sql);
%>

<table width="600" border="1px solid #000000;" style="margin: 0 auto;">
<tr>
	<th><div align="center">employeeID</div></th>
	<th><div align="center">first name</div></th>
	<th><div align="center">last name</div></th>
	<th><div align="center">phone</div></th>
	<th><div align="center">gender</div></th>
	<th><div align="center">description</div></th>
	<th><div align="center">vehicle</div></th>
	<th><div align="center">way</div></th>
	<th><div align="center">img</div></th>
	
</tr>
	<%
		while(rec!=null && rec.next()){
	%>
	<tr>
		<td><div align="center"><%=rec.getInt("employeeID") %></div></td>
		<td><div align="center"><%=rec.getString("firstName") %></div></td>
		<td><div align="center"><%=rec.getString("lastName") %></div></td>
		<td><div align="center"><%=rec.getString("phoneNumber") %></div></td>
		<td><div align="center"><%=rec.getString("gender") %></div></td>
		<td><div align="center"><%=rec.getString("description") %></div></td>
		<td><div align="center"><%=rec.getString("vehicle") %></div></td>
		<td><div align="center"><%=rec.getString("way") %></div></td>
		<td><div align="center"><%=rec.getString("img") %></div></td>
		<td><a href="DeleteData.jsp?id=<%=rec.getInt("employeeID") %> " >Delete</a></td>
		<td><a href="Form.jsp?id=<%=rec.getInt("employeeID") %>">Update</a></td>
	</tr>
	<%
		}
	%>
	
</table>
<%
} catch (Exception e) {
	// TODO Auto-generated catch block
	out.println(e.getMessage());
	e.printStackTrace();
}

try {
	if (s != null) {
		s.close();
		connect.close();
	}
} catch (SQLException sqls) {
	// TODO Auto-generated catch block
	out.println(sqls.getMessage());
	sqls.printStackTrace();
}
%>

</body>
</html>