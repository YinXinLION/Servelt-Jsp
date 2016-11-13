<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  user: yinxin
  Date: 16-10-19
  Time: 下午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" isErrorPage="true" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>错误</title>
</head>
<body>
    <h1>网页发生错误:</h1><%= exception %>
    <h2>显示异常堆栈跟踪:</h2>
<%
    exception.printStackTrace(new PrintWriter(out));
%>
</body>
</html>
