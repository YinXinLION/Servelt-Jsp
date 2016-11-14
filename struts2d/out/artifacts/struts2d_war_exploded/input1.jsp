<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-11-13
  Time: 下午7:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>局部类型转换器</title>
</head>
<body>
<h3>局部类型转换器</h3>
<s:form action="login">
    <s:textfield name="user" label="用户"/>
    <tr>
        <td colspan="2"><s:submit value="转换" theme="simple"/>
            <s:reset value="重填" theme="simple"/></td>
    </tr>
</s:form>
</body>
</html>