package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yinxin on 16-10-13.
 */
@WebServlet("/loginout.do")
public class Loginout extends HttpServlet {
    private String LOGIN_VIEW = "index.html";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("login") != null)
        {
            request.getSession().invalidate();//使HttpSesion失效
        }
        response.sendRedirect(LOGIN_VIEW);
    }
}
