<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-21
  Time: 下午4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <a href="register.jsp">还不是会员?</a><p>
        <div style="color: antiquewhite"><%= request.getAttribute("error")%></div>
        <form method="post" action="/login.do">
            <tr>
                <td colspan='2'>会员登录</td>
            </tr>
            <tr>
                <td>名称:</td>
                <td><input type="text" name="username" value="<%= request.getParameter("username")%>"></td>
            </tr>
        </form>
    </div>
</body>
</html>
