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
name:<s:property value="user.name"/><br/>
password<s:property value="user.pass\"/><br/>

</body>
</html>