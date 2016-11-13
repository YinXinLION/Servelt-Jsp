<%@ page import="java.util.List" %>
<%@ page import="cc.openhome.Blah" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: yinxin
  Date: 16-10-22
  Time: 下午11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<Blah> blahs = (List<Blah>) request.getAttribute("blahs");  //从请求范围中取得信息列表
        if(blahs != null){
    %>
    <div class="leftPanel">
        <br><br>
        <%= request.getAttribute("username")%> 的微博
    </div>
    <table style="text-align: left;width: 510px;height: 88px;" border="0" cellpadding="2" cellspacing="2">
        <thead>
            <tr>
                <th>
                    <hr>
                </th>
            </tr>
        </thead>
        <tbody>
        <%
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for(Blah blah : blahs){
        %>
            <tr>
                <td style="vertical-align: top;">
                    <%= blah.getUsername()%><br>
                    <%= blah.getTxt()%><br>
                    <%=  format.format(blah.getDate())%>
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <hr style="width: 100%;height: 1px;">
        <%
            }
            else {
        %>
    <h1 style="color: rebeccapurple"><%=request.getAttribute("username")%></h1>
    <%
        }
    %>
</body>
</html>
