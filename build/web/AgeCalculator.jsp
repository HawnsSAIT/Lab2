<%-- 
    Document   : AgeCalculator
    Created on : Sep 12, 2019, 9:42:09 AM
    Author     : 703174
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="AgeCalculatorServlet" method="POST">
            Enter your age:
            <input type="text" name="userAge"><br><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <div>${message}</div>
        <a href="Arithmetic.jsp">Arithmetic Calculator</a>
    </body>
</html>
