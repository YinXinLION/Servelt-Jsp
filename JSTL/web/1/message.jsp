<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-23
  Time: 下午4:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="messageService" class="cc.openhome.MessageService"/>

<html>
<head>
    <title>留言板</title>
</head>
<body>
    <table style="text-align: left;width: 100%;" border="1">
        <tr>
            <td>名称</td>
            <td>信息</td>
        </tr>
        <c:forEach var="message" items="${messageService.messages}">
            <tr>
                <td>${message.name}</td>
                <td>${message.text}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
