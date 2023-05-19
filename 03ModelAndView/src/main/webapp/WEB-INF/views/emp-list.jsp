<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List page</title>
</head>
<body>
	<h1>List Of Employees</h1>

	<%
// 		String s1 = (String) request.getParameter("id");
// 		out.println(s1);
// 		 String s2 = (String) request.getParameter("name"); 
// 		out.println(s2);
// 		String s3 = (String) request.getParameter("salary");
// 		out.println(s3);



	%>

<%-- 	${id} ${name} ${salary} --%>
<table>
${employee}
</table>

</body>
</html>