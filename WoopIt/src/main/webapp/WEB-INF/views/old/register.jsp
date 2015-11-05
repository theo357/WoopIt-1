<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
</head>
<body>
	 <form action="register" method="post">
	  	Username:<br>
	  	<input type="text" name="userName" value="" required />
	  	<br>
	  	Password:<br>
	  	<input type="password" name="userPass" value="" required />
	  	<br>
	  	Email:<br>
	  	<input type="text" name="userEmail" value="" required />
	  	<br>
	  	Sex:<br>
	  	<input type="radio" name="userSex" value="male" checked>Male
  		<br>
  		<input type="radio" name="userSex" value="female">Female
  		<br>
  		Country:<br>
			<select name="userCountry">
	  			<option value="Greece">Greece</option>
	  			<option value="Germany">Germany</option>
	  			<option value="France">France</option>
	  			<option value="Italy">Italy</option>
			</select>
		<br>
		<br>
	  	<input type="submit" value="Sign Up">
	  	<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
	</form> 
</body>
</html>