<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-23
  Time: 下午4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${param.name == 'momor' && param.password == '1234'}">
        <h1>${param.name}登陆成功</h1>
    </c:if>
</body>
</html>
