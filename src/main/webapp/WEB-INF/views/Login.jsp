<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="/login.do" method="post">
        <p><font color="red">${errorMessage}</font></p>
        Enter Your Name : <input type="text" id="first" name="first" placeholder="FirstName">
                          <input type="text" id="last" name="last" placeholder="LastName">
                          <br><br>
        Enter Password  :  <input type="password" id="password" name="password" placeholder="****">
                          <br><br>
        <input type="submit" value="Submit">
    </body>
</html>