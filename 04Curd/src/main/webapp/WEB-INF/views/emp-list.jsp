<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp-List Page</title>

</head>
<body>
	<form action="listemp">
		<h4>List of Employees</h4>
		
		<a href="home" >Register Employee</a>

		<table border="1px">
			<tr>
				<th>EMPLOYEE ID</th>
				<th>EMPLOYEE NAME</th>
				<th>EMPLOYEE SALARY</th>
				<th>EMPLOYEE EMAIL</th>
				<th>ACTION</th>

			</tr>


			<c:forEach var="list" items="${emps}">

				<tr>
					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.salary}</td>
					<td>${list.email}</td>

					<td><a href="updateEmp?id=${list.id}">Update</a></td>
					<td><a href="deleteEmp?id=${list.id}">Delete</a></td>
				</tr>

			</c:forEach>

		</table>
	</form>

	${employee.id} ${employee.name} ${employee.salary} ${employee.email}

</body>
</html>