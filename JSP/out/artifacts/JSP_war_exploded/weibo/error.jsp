<%@ page import="java.util.List" %>
<%@ page import="static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error" %><%--
  Created by IntelliJ IDEA.
  user: yinxin
  Date: 16-10-19
  Time: 下午11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"  language="java" %>
<html>
<head>
    <title>新增会员失败</title>
</head>
<body>
    <h1>新增会员失败</h1>
    <ul style="color: red">
        <%
            List<String> errors = (List<String>)request.getAttribute("errors");
            for(String error : errors){
        %>
    <li><%= error%></li>
        <%
            }
        %>
    </ul>
    <a href="/weibo/register.jsp">返回注册页面</a>
</body>
</html>
