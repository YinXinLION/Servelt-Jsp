<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-17
  Time: 下午11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ page import="cc.openhome.user" %>
<%
    user user = (cc.openhome.user)request.getAttribute("user");
    if(user == null){
        user = new user();
        request.setAttribute("user",user);
    }
    user.setName(request.getParameter("name"));
    user.setPassword(request.getParameter("password"));
%>

    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登陆页面</title>
    </head>
    <body>

<%
    if(user.isValid()){
%>
    <h1><%= user.getName()%>>登陆成功</h1>
<%
    }else{
%>
    <h1>登录失败</h1>
<%
    }
%>
</body>
</html>
