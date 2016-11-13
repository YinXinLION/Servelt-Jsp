package cc.openhome;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

/**
 * Created by yinxin on 16-9-12.
 */
@WebServlet("/member.view")
public class Member extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String LoginPage = "index.html";
        response.setContentType("text/html;charset=UTF-8");
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        if(request.getSession().getAttribute("login") == null)
        {
            response.sendRedirect(LoginPage);
        }
        PrintWriter out = response.getWriter();
        String username = (String) request.getSession().getAttribute("login");
        out.println("<!DOCTYPE html PUBLIC "+"'-//W3C//DTD HTML 4.01 Transitional//EN'>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta content='text/html;charset=UTF-8'" + "http-equiv='content-type'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src='images/caterpillar.jpg' alt='Gossip 微博'/><br><br>");
        out.println("<a href='loginout.do?username="+username+"'>注销 " + username + "</a>");

        out.println("<form method='post' action='/Message.do'>");
        out.println("分享新鲜事..<br>");
        String blabla = request.getParameter("blabla");
        if(blabla == null)
        {
            blabla = "";
        }else {
            out.println("信息要140字以内<br>");
        }
        out.println("<textarea cols='60' rows='4' name='blabla'>" + blabla + "</textarea>");
        out.println("<input type='submit' name='' value='送出'>");
        out.println("</form>");

        try {
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("Select * from Forum_info");
            while (rs.next())
            {
                String name = (String) rs.getObject("username");
                String speak = (String) rs.getObject("speak");
                Date time = rs.getDate("time");
                out.println("<tr><td style='vertival-align:top;'>");
                out.println(name + "<br>");
                out.println(time + "<br>");
                out.println(speak + "<br>");

                out.println("<a href='delete.do?message=" +  "'>删除</a>");
                out.println("<hr></td></tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.free(rs,st,conn);
        }

            out.println("</body>");
            out.println("</html>");
            out.close();




        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
