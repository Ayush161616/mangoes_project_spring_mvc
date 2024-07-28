<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login form</title>
<%@ include file = "header.jsp" %>
<link href="mangoproject/css/style.css" rel="stylesheet">
</head>
<body>
<div class="loginbox">
<h1>Login Here</h1>
<form action ="http://localhost:8080/mangoproject/UserLogin" method="post">
<p><b>User Name</b></p>
<input type="text" placeholder="Enter Username" name="uname" required>
<p><b>Password</b></p>
<input type="password" placeholder="Enter Passsword" name="psw" required>
<input type="submit" name="login" value="login">
</form>
</div>
</body>
</html>