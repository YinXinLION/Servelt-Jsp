<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  user: yinxin
  Date: 16-10-21
  Time: 下午3:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> errors = (List<String>) request.getAttribute("errors");
    if(errors != null){
%>
    <h1>新增会员失败</h1>
    <ul style="color:red">
        <%
            for (String error : errors){
        %>
        <li><%= error%></li>
        <%
            }
        %>
    </ul>
<br>
    <%
        }
    %>
    <h1>会员注册</h1>
    <form action="/register.do" method="post">
        <table bgcolor="aqua">
            <tr>
                <td>邮件地址:</td>
                <td><input type="text" name="email" value="<%=request.getParameter("email")%>" size="25" maxlength="100">
                </td>
            </tr>
            <tr>
                <td>用户名(最大16字符):</td>
                <td><input type="text" name="username" value="<%=request.getParameter("username")%>" size="25" maxlength="16"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password" value="<%=request.getParameter("password")%>" size="25" maxlength="16"></td>
            </tr>
            <tr>
                <td>密码确认:</td>
                <td><input type="password" name="confirmedPasswd" value="<%=request.getParameter("confirmedPasswd")%>" size="25" maxlength="16"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
