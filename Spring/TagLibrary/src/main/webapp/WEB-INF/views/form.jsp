<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Form</h1>

	<form:form action="open" modelAttribute="student">

		Enter FirstName<form:input path="firstname"/>
			Enter LasttName<form:input path="lastname"/>
				Gender: <form:radiobutton path="gender" value="Male"/>Male
				<form:radiobutton path="gender" value="Female"/>Female
		<input type="submit">
	</form:form>

</body>
</html>