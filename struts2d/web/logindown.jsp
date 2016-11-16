<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-11-16
  Time: 下午3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>下载前的登录页面</title>
</head>
<body>
<h3>下载前的登录页面</h3>
<span style="color:red">${requestScope.tip}</span>
<s:form action="login1">
    <s:textfield name="user" label="用户名"/>
    <s:textfield name="pass" label="密码"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>