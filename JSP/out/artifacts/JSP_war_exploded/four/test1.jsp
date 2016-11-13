<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Scanner" %>
<%@ page import="java.util.StringJoiner" %><%--
  Created by IntelliJ IDEA.
  user: yinxin
  Date: 16-10-19
  Time: 下午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String []name = {"caterpillar","momor","hamimi"};
        request.setAttribute("array",name);
        Map<String,String> map = new HashMap<String,String>();
        map.put("user","caterpillar");
        map.put("yinxin","lion");
        request.setAttribute("login",map);
    %>
    ${array[0]}<br>
    ${array[1]}<br>
    ${array[2]}<br>
    User:${login["user"]}<br>
    yinxin:${login["yinxin"]}<br>
</body>
</html>
