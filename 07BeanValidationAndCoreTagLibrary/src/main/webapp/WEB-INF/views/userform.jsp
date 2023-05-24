<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user form</title>

<style type="text/css">
.error {
	color: red
}
</style>

</head>
<body>
	<h3>User Registration Form!!!!!!!!</h3>

	<form:form modelAttribute="user" method="post">

		<table>

			<tr>
				<td>NAME</td>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>

			<tr>
				<td>EMAIL</td>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>

			<tr>
				<td>BIRTHDAY</td>
				<td><form:input path="birthday" /> <form:errors
						path="birthday" cssClass="error" /></td>
			</tr>

			<tr>
				<td>AGE</td>
				<td><form:input path="age" /> <form:errors path="age"
						cssClass="error" /></td>
			</tr>


			<tr>
				<td>SELECT ROLE</td>
				<td><form:select path="role">
						<form:option value=""> Please select role</form:option>
						<form:options items="${roles}" />
					</form:select>
			<tr>
				<td>ADDRESS INFO</td>
			</tr>
			<tr>
				<td>STREET NAME:</td>
				<td><form:input path="address.street" /> <form:errors
						path="address.street" cssClass="error" /></td>
			</tr>
			<tr>
			<td>STATE:</td>
				<td><form:input path="address.state" /> <form:errors
						path="address.state" cssClass="error" /></td>
			</tr>
			<tr>
			<td>ZIPCODE:</td>
				<td><form:input path="address.zipcode" /> <form:errors
						path="address.zipcode" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="enter"></td>
			</tr>

		</table>

	</form:form>

</body>
</html>