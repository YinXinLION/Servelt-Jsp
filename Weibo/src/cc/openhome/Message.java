package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yinxin on 16-10-12.
 */
@WebServlet("/Message.do")
public class Message extends HttpServlet {
    String LOGIN_VIEW = "index.html";
    String SUCCESS_VIEW = "/member.view";
    String ERROR_VIEW = "/member.view";
    // new日期对象
    Date date = new Date();
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date_time = format.format(date);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect(LOGIN_VIEW);//若无"login"属性，直接重定向到登陆页面
            return;
        }
        request.setCharacterEncoding("UTF-8"); // -----------

        String blabla = request.getParameter("blabla");
        System.out.println(blabla);
        if(blabla != null && blabla.length() != 0){
            if(blabla.length() < 140)
            {
                String username = (String)request.getSession().getAttribute("login");
                    addMessage(username,blabla);

                response.sendRedirect(SUCCESS_VIEW);
            }
            else {
                request.getRequestDispatcher(ERROR_VIEW).forward(request,response);
            }
        }
    }

    private void addMessage(String username,String blabla)
    {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "insert into Forum_info(username,speak,time) values('"+username+"','"+blabla+"','"+date_time+"')";
        try{
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            st.executeUpdate(sql);
        }catch (Exception e)
        {
            System.out.println(e);
        }finally {
            jdbcUtils.free(rs,st,conn);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
