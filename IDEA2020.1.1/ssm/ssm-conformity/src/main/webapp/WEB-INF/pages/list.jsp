<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户表</title>
</head>
<body>
    账户表 <br>
    <c:forEach items="${list}" var="account">
        ${account.name} <br>
    </c:forEach>
</body>
</html>
