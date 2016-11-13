<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-23
  Time: 下午5:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:catch var="error">
        ${param.a} + ${param.b} = ${param.a + param.b}
    </c:catch>
    <c:if test="${error != null}">
        <br>
        <span style="color: aqua">${error.message}</span>
        <br>${error}
    </c:if>
</body>
</html>
