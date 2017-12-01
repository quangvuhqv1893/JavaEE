<%@page import="java.sql.PreparedStatement"%>
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
<%
	String id = request.getParameter("id");
	String firstName=request.getParameter("firstName");
	String lastName=request.getParameter("lastName");
	String phoneNumber=request.getParameter("area")+request.getParameter("pre")+request.getParameter("last");
	String gender=request.getParameter("gender");
	String description=request.getParameter("description");
	String vehicle=request.getParameter("vehicle");
	String way=request.getParameter("way");
	String img=request.getParameter("img");
%>

	<%
	Connection connect = null;
	PreparedStatement preparedStatement =null;
	try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=User;user=sa;password=1");
	String sql =null;
	if(id==null||id==""){
	sql = "INSERT dbo.Employee VALUES(?,?,?,?,?,?,?,?)";
	}else{
	 sql = "UPDATE dbo.Employee SET firstName=?, lastName=?, phoneNumber=?, gender=?,description=?,vehicle=?,way=?,img=? WHERE employeeID=?";
	}
	preparedStatement =connect.prepareStatement(sql);
	preparedStatement.setString(1, firstName);
	preparedStatement.setString(2, lastName);
	preparedStatement.setString(3, phoneNumber);
	preparedStatement.setString(4, gender);
	preparedStatement.setString(5, description);
	preparedStatement.setString(6, vehicle);
	preparedStatement.setString(7, way);
	preparedStatement.setString(8, img);
	out.println((id!=null||id!=""));
	if(id!=null&&id!=""){
		preparedStatement.setString(9, id);
	}
	preparedStatement.executeUpdate();
	out.println("register is successful!");
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
