<%@page import="com.entities.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="600" border="1px #000000;"
		style="margin: 0 auto; border-collapse: collapse;">
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
		<c:forEach items="${showData}" var="employee">
		<tr>
			<td><div align="center"><c:out value="${employee.EmployeeID}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.firstName}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.lastName}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.phoneNumber}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.gender}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.description}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.vehicle}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.way}" /> </div> </td>
			<td><div align="center"><c:out value="${employee.img}" /> </div> </td>
			<td><a href="DeleteData.jsp?id=<c:out value="${employee.EmployeeID}"/>" > Delete </a></td>
			<td><a href="Form.jsp?id=<c:out value="${employee.EmployeeID}"/>" > Update </a></td>
		</tr>
		<%-- <tr>
			<td><div align="center"><%=employee.getEmployeeID()%></div></td>
			<td><div align="center"><%=employee.getFirstName()%></div></td>
			<td><div align="center"><%=employee.getLastName()%></div></td>
			<td><div align="center"><%=employee.getPhoneNumber()%></div></td>
			<td><div align="center"><%=employee.getGender()%></div></td>
			<td><div align="center"><%=employee.getDescription()%></div></td>
			<td><div align="center"><%=employee.getVehicle()%></div></td>
			<td><div align="center"><%=employee.getWay()%></div></td>
			<td><div align="center"><%=employee.getImg()%></div></td>
			<td><a href="DeleteData.jsp?id=<%=employee.getEmployeeID()%> ">Delete</a></td>
			<td><a href="Form.jsp?id=<%=employee.getEmployeeID()%>">Update</a></td>
		</tr> --%>
		</c:forEach>

	</table>
</body>
</html>