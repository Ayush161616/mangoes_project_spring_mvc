<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration form</title>
<%@ include file = "header.jsp"  %>
<link href="mangoproject/css/style.css" rel="stylesheet">

</head>
<body>
 <div class = "regisbox">
 <h1>Registration </h1>
 <form action ="http://localhost:8080/mangoproject/UserRegis" method="post">
 <p><b>FirstName</b></p>
 <input type ="text" placeholder="Enter Firstname" name="fname" required>
 <p><b>LasttName</b></p>
  <input type ="text" placeholder="Enter Lasttname" name="lname" required>
  <p><b>Password</b></p>
  <input type ="password" placeholder="Enter password" name="aname" required>
  <p><b>Email id</b></p>
  <input type ="text" placeholder="Enter emailid" name="ename" required>
  <input type="submit" name="regis" value="Regisration">
  
</form>

</div>

</body>
</html>