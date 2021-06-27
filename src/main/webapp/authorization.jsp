<%--
  Created by IntelliJ IDEA.
  User: xo4y_
  Date: 11.04.2021
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/authorization" method="post">
    <input type="text" name="login" placeholder="login">
    <input type="text" name="password" placeholder="password">
    <button>Authorization</button>
</form>
<p>${message}</p>
</body>
</html>
