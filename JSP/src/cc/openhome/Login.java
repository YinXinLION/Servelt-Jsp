package cc.openhome;

import org.w3c.dom.Element;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * Created by yinxin on 16-9-12.
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
    private final String USERS="";
    private final String SUCCESS_VIEW = "./weibo/member.jsp";
    private final String ERROR_VIEW = "index.html";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("login");
        String password = request.getParameter("password");
        String page = null;
        try {
            if(checkLogin(username,password))
            {
                request.getSession().setAttribute("login",username);
                UserService userService = new UserService();
                getServletContext().setAttribute("userService",userService);
                List<Blah> blahs = (List<Blah>) userService.getBlahs();
                request.setAttribute("blahs",blahs);
                page = SUCCESS_VIEW;

            }
            else {
                page = ERROR_VIEW;
                request.setAttribute("error","名称或密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher(page).forward(request,response);
    }

    private boolean checkLogin(String username,String password) throws Exception
    {//要修改
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = jdbcUtils.getConnection();//连接
            st = conn.createStatement();//创建语句
            rs = st.executeQuery("select * from User");//执行语句
            while (rs.next())//处理
            {
                if(rs.getObject("username").toString().equals(username))
                {
                    System.out.println(username);
                    if(rs.getObject("password").toString().equals(password) )
                    {
                        System.out.println(password);
                        return true;
                    }
                }
            }
        } finally {
            jdbcUtils.free(rs,st,conn);
        }
        return false;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
