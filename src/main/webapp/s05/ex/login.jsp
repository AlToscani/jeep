<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang=it>
<head>
<meta charset="UTF-8">
<link rel="icon" href="data:;base64,=">
<title>Login</title>
</head>
<body>
<h1>LOGIN!</h1>
	<c:if test="${not empty message}">
		<p>${message}</p>
	</c:if>
	<form action="login" method="post">
	<input name="username" placeholder="Enter username" value="${param.username}" autofocus required>
	<input name="password" type="password" placeholder="Enter password" required>
	<button>Log</button>
	</form>
</body>
</html>