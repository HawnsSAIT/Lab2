<%-- 
    Document   : Arithmetic
    Created on : Sep 12, 2019, 4:23:38 PM
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
        <h1>Arithmetic Calculator</h1>
        <form action="ArithmeticCalculatorServlet" method="POST">
            First:
            <input type="text" name="numFirst" value="${numFirst}"><br><br>
            Second:
            <input type="text" name="numSecond" value="${numSecond}"><br><br>
            <input type="submit" value="+" name="operator">
            <input type="submit" value="-" name="operator">
            <input type="submit" value="*" name="operator">
            <input type="submit" value="%" name="operator">
        </form>
        <div>
            Result: ${message}
        </div>
        <a href="AgeCalculator.jsp">Age Calculator</a>
    </body>
</html>
