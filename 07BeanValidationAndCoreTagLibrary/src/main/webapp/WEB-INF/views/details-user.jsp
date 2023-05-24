<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

	<h3>Success Page</h3>

	<p>Name:${user.name}</p>
	<p>Email:${user.email}</p>
	<p>Birthday:${user.birthday}</p>
	<p>Age:${user.age}</p>
	<p>role:${user.role}</p>
	<p>Address Info</p>
	<p>Street:${user.address.street}</p>
	<p>State:${user.address.state}</p>
	<p>Zip code:${user.address.zipcode}</p>

</body>

</html>