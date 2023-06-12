<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${Header} </title>
</head>
<body>
<h1>${Header}</h1>
<h1 style="color:green">${msg}</h1>
<hr>
<h1>welcome,${user.userName }</h1>
<h1>Your email address is ${user.email}</h1>
<h1>Your password is ${user.password} try to scure the password</h1>

</body>
</html>