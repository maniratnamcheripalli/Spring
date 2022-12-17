<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.register1{
background-color:white;
 text-align: center;
 height:700px;
 width:1000px;
 align-items: center;
 margin-left:300px;
 border:15px solid green
}
b{
font-size:20px;}
.error{color:red}  
</style>
</head>
<body>
<form:form action="register" modelAttribute="customer" method="POST">
<div class="register1">
<div class="div1">
<h2>Registration page</h2><br><br>
<form:hidden path="id"/>
<b>FirstName(*):</b>
<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/><br><br><br>
<b>LastName(*):</b>
<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/><br><br><br>  
<b>MailId(*):</b>
<form:input path="MailId"/>
<form:errors path="mailId" cssClass="error"/><br><br><br>  
<b>Password(*):</b>
<form:password path="password"/>
<form:errors path="password" cssClass="error"/><br><br><br>  
<b>Confirm-password(*):</b>
<form:password path="confirmPassword"/>
<form:errors path="confirmPassword" cssClass="error"/><br><br><br>  
<input type="submit" value="Register" style="background-color:hotpink;color:black;font-size:24px">
</div>
</div>
</form:form>
</body>
</html>