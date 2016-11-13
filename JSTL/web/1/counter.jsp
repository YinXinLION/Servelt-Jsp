<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-23
  Time: 下午5:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="count" value="${sessionScope.count+1}" scope="session"/>
<html>
<head>
    <title>计数程序</title>
</head>
<body>
    <h1>JSP count ${sessionScope.count}</h1>
    <a href="<c:url value="counter.jsp"/>">递增</a>
</body>
</html>
