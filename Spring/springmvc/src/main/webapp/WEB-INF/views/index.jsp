<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Index</h1>


<%out.println(request.getAttribute("name"));

out.println(request.getAttribute("id"));
%>
</body>
</html>