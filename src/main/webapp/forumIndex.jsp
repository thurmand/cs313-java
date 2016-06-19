<%-- 
    Document   : index
    Created on : Jun 15, 2016, 7:19:22 PM
    Author     : Andrew T
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Sign In</h1>
        <form action="loginForum" method="POST">
            <input type="text" placeholder="Username" name="uname">
            <br>
            <input type="password" placeholder="Password" name="pass">
            <br><br>
            <input type="submit" value="Login">     
        </form>
    </body>
</html>
