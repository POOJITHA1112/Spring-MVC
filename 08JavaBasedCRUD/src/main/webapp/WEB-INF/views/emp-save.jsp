<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp-save page</title>
</head>
<body>
	<form:errors path="employee1.*" />

	<h2>Enter Employee Details</h2>

	<form action="save" method="post">

		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" placeholder="enter id in digits"
					name="id"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" placeholder="enter name in characters"
					name="name"></td>
			</tr>

			<tr>
				<td>SALARY:</td>
				<td><input type="text" placeholder="enter salary in digits"
					name="salary"></td>
			</tr>

			<tr>
				<td>EMAIL:</td>
				<td><input type="text"
					placeholder="enter email ends with @gmail.com" name="email"></td>
			</tr>

			<tr>
				<td><input type="submit" value="register"></td>
			</tr>

		</table>

	</form>


</body>
</html>