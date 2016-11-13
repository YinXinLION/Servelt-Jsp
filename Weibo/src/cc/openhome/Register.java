package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yinxin on 16-9-7.
 */
@WebServlet("/register.do")
public class Register extends HttpServlet {
    private final String USERS = "./User";
    private final String SUCCESS_VIEW = "success.view";//
    private final String ERROR_VIEW = "error.view";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");//取得请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmedPasswd = request.getParameter("confirmedPasswd");
        List<String> errors = new ArrayList<String>();
        if(isInvalidEmail(email))
        {
            errors.add("未填写邮件或邮件格式不对");
        }
        if(isInvalidUsername(username))
        {
            errors.add("用户名称为空或已存在");
        }
        if(isInvalidPassword(password,confirmedPasswd))
        {
            errors.add("请确认密码符合格式并再次确认密码");
        }
        String resultPage = ERROR_VIEW;
        //窗体验证出uowu,设置收集错误的List为请求属性
        if(!errors.isEmpty())
        {
            request.setAttribute("errors",errors);
        }else {
            resultPage = SUCCESS_VIEW;
            System.out.println(email + username +  password);
            createUserData(email,username,password);//创建用户资料
        }
        request.getRequestDispatcher(resultPage).forward(request,response);


    }

    private boolean isInvalidEmail(String email)
    {
        String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+";
        return email == null || !email.matches(regex);
    }
    private boolean isInvalidUsername(String username)
    {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from User");
            while (rs.next())
            {
                if(rs.getObject("username").equals(username))
                {
                    return true;
                }
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return false;
    }

    private boolean isInvalidPassword(String password,String confirmedPasswd)
    {
        return password == null || password.length() < 6 || password.length() > 16 || !password.equals(confirmedPasswd);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void createUserData(String email,String username,String password) throws IOException
    {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "insert into User(username,password,email) values('"+username+"','"+password+"','"+email+"')";
        try {
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            st.executeUpdate(sql);
        }catch (Exception e)
        {
            System.out.println(e);
        } finally {
            jdbcUtils.free(rs,st,conn);
        }

    }

}