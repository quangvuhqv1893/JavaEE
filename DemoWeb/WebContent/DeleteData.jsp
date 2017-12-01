<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String id = request.getParameter("id");
Connection connect = null;
PreparedStatement preparedStatement =null;
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

connect =DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=User;user=sa;password=1");
String sql = "DELETE FROM dbo.Employee WHERE employeeID=?";
preparedStatement = connect.prepareStatement(sql);
preparedStatement.setString(1, id);
preparedStatement.executeUpdate();
out.println("delete is successful!");
response.sendRedirect("ShowData.jsp");
} catch (Exception e) {
	out.println(e.getMessage());
	e.printStackTrace();
}

finally {
	connect.close();
	preparedStatement.close();
}
%>