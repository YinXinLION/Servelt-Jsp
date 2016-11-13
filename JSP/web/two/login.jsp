<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-16
  Time: 下午9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%!
    String name = "caterpillar";
    String password = "123456";
    boolean checUser(String name, String password){
        return this.name.equals(name) && this.password.equals(password);
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>登陆页面</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if(checUser(name,password)){
%>
    <h1><%= name %>登陆成功</h1>
<%
    }else{
%>
    <h1>登陆失败</h1>
<%
    }
%>
</body>
</html>
