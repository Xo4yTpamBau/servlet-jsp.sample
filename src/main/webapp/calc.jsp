<%--
  Created by IntelliJ IDEA.
  User: xo4y_
  Date: 11.04.2021
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>

    </title>
</head>
<body>
<form action="/calc" method="post">
    <input type="number" name="num1" placeholder="Num 1">
    <input type="number" name="num2" placeholder="Num 2">
    <input type="text" name="operation" placeholder="Operation">
    <button>Calc</button>
    <a href="/">back</a>
</form>
<p>Result ${result}</p>
</body>
</html>
