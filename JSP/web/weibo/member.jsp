<%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-20
  Time: 下午12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@page import="java.util.*, java.text.*" %>
<%@ page import="cc.openhome.UserService" %>
<%@ page import="cc.openhome.Blah" %>
<%
    String username = (String) request.getSession().getAttribute("login");
    int i = 0;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Gossip 微博</title>
    <link rel="stylesheet" href="css/member.css" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <div class="leftPanel">
        <img src="images/caterpillar.jpg" alt="Gossip 微博">
        <br><br>
        <a href="/user/<%=username%>">查看</a>
        <a href='logout.do?username=<%=username%>'>>
        注销 <%=username%> </a>
    </div>
    <form action="message.do" method="post">
        分享新鲜事... <br>
        <%
            String blabla = request.getParameter("blabla");
            if(blabla == null)
            {
                blabla = "";
            }
            else {
        %>
            信息要在140字以内<br>
        <%
            }
        %>
        <textarea name="blabla" id="" cols="60" rows="4">
            <%= blabla %>
        </textarea><br>
        <button type="submit">送出</button>
    </form>
    <table style="text-align: left;width: 510px;height: 88px;" border="0" cellpadding="2" cellspacing="2">
        <thead>
        <tr>
            <th><hr></th>
        </tr>
        </thead>
        <tbody>
        <%
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            List<Blah> blahs = (List<Blah>) request.getAttribute("blahs");//从请求范围中取得信息列表
            for(Blah blah : blahs){
                i++;
        %>
            <tr>
                <td style="vertical-align: top;">
                    <%= blah.getUsername()%>
                    <%= blah.getTxt()%>
                    <%=  format.format(blah.getDate())%>
                    <a href="delete.do?message=<%=i%>">删除</a>
                </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
    <hr style="width:100%; height: 1px;">
</body>
</html>
