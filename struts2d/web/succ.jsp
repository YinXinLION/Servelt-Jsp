<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-11-14
  Time: 下午10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>上传成功</title>
</head>
<body>
上传成功!<br/>
文件标题:<s:property value=" + title"/><br/>
文件为：<img src="<s:property value="'uploadFiles/'
		+ uploadFileName"/>"/><br/>
</body>
</html>
