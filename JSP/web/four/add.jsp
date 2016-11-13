<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-19
  Time: 下午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" errorPage="error.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>加法网页</title>
</head>
<body>
<%
    String a =request.getParameter("a");
    String b =request.getParameter("b");
    out.println("a + b =" + (Integer.parseInt(a) + Integer.parseInt(b)));
%>
</body>
</html>
