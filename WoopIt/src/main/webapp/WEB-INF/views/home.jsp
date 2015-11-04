<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
</head>
<body>
	<h1>Home</h1>
	<form action="<spring:url value="/home"/>" method="post">
	<table>
		<tr><td colspan="2">Message: </td></tr>
		<tr><td colspan="5"><textarea name="message" rows="10" cols="50"></textarea></td></tr>
		<tr><td colspan="2"><input type="submit" name="submit" value="Whoop It!"></td></tr>
	</table>
	</form>
	<br /><br /><br />
	${message.content}
	<!-- <c:forEach items="${messages}" var="message">
		${message.content }
		<br />
	</c:forEach> -->
</body>
</html>