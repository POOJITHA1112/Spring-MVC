<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <!-- here model attribute name=employee is not comming from controller here 
 we can give any name -->
	<form action="update" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" readonly="readonly"
					value="${employee.id}"></td>
			</tr>

			<tr>
				<td>NAME</td>
				<td><input type="text" name="name" value="${employee.id}"></td>
			</tr>

			<tr>
				<td>SALA RY</td>
				<td><input type="text" name="salary" value="${employee.salary}"></td>
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email" value="${employee.email}"></td>
			</tr>
			
			<tr>
			<td><input type="submit" value="UPDATE"></td>
			</tr>

		</table>

	</form>

</body>
</html>