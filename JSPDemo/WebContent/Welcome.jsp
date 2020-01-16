<%@ page import="java.util.Date, java.sql.*, java.io.IOException"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 1; i <= 10; i++) {
			out.print(i);
	%>
	<br>
	<%
		}
	%>
</body>
</html>