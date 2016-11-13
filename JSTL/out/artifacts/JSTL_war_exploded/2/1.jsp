<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-24
  Time: 下午3:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<head>
    <title>在线书签</title>
</head>
<body>
    <x:parse var="bookmarks">
    <bookmarks>
        <bookmark id="1">
            <title encoding="Big5">我的网站</title>
            <url>http://openhome.cc</url>
            <category>程序设计</category>
        </bookmark>
    </bookmarks>
    </x:parse>
    <x:out select="$bookmarks//bookmark[1]/title"/>

</body>
</html>
