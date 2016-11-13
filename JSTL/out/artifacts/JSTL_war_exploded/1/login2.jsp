<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-23
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="user" class="cc.openhome.user" >
    <jsp:setProperty name="user" property="*"/>
</jsp:useBean>


<html>
<head>
    <title></title>
</head>
<body>
    <c:choose>
        <c:when test="${user.valid}">
            <h1>
                <jsp:getProperty name="user" property="name"/>登陆成功
            </h1>
        </c:when>
        <c:otherwise>
            <h1>登录失败</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>
