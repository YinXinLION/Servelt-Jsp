<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-11-13
  Time: 下午7:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>转换结果</title>
</head>
<body>
<s:actionmessage/>
key为one的用户名为:<s:property value="users['one'].name"/><br/>
key为one的密码为：<s:property value="users['one'].pass"/><br/>
key为two的用户名为:<s:property value="users['two'].name"/><br/>
key为two的密码为：<s:property value="users['two'].pass"/><br/>

</body>
</html>