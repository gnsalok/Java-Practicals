<%--
  Created by IntelliJ IDEA.
  User: Alok-PC
  Date: 09-Nov-17
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Welcome to Student Login...</h1>
<form action="/login" method="post">
    Username: <input type="text" name="loginname" width="30"/>
    Password: <input type="password" name="password" width="10"/>
    <input type="submit" value="Login">
</form>

</body>
</html>
