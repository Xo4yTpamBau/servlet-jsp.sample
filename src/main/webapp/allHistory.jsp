<%--
  Created by IntelliJ IDEA.
  User: xo4y_
  Date: 13.04.2021
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${requestScope.allHistory}" var="item">
    <p>${item}</p>
</c:forEach>
<a href="/">back</a>

</body>
</html>
