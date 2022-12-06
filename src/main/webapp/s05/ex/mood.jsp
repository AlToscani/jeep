<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<link rel="icon" href="data:;base64,=">
<link rel="stylesheet" type="text/css" href="mood.css">
<title>Hello</title>
</head>

<body class="${param.mood}">
    Hello ${param.name}!
</body>

</html>