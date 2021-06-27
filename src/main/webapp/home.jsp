<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>


<c:if test="${sessionScope.user == null}">
    <a href="/registration">Registration</a>
    <a href="/authorization">Authorization</a>
</c:if>

<c:if test="${sessionScope.user != null}">
    <p>Welcome ${sessionScope.user.name}</p>
    <a href="/logout">Logout</a>
    <a href="/user/updatePassword">Update password</a>
    <a href="/user/updateName">Update name</a>
    <a href="/calc">Calculator</a>
    <c:if test="${sessionScope.user.role == Role.ADMIN}">
        <a href="/allHistory">History</a>
    </c:if>
    <a href="/individualHistory">Individual history</a>
</c:if>

</body>
</html>
