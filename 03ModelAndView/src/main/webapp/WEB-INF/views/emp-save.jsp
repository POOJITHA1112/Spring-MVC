<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save page</title>
</head>
<body>
	<h1>Emp-Save JSP Page</h1>

	<!-- 	<form action="save" method="get"> -->
	<form action="save" method="POST">
	
	<table>
<tr>	
		<th>Id:</th><td><input type="text" name="id" required="required"><br><br></td>
</tr>
		
<tr>
		<th>Name:</th><td><input type="text" name="name" required="required"><br><br></td>
</tr>

<tr>
		<th>Salary:</th><td><input type="text" name="salary" required="required"><br><br></td>
</tr>		
		
<tr>
		<th>Mobile Number:</th><td><input type="text" name="mblnmbr" required="required"><br><br></td>
</tr>		 
		

</table>
		<input type="submit" name="save">

	</form>

</body>
</html>