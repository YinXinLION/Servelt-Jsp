package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by yinxin on 16-10-22.
 */
@WebServlet(
        urlPatterns = {"/user/*"},     //处理/user/开头的请求
        initParams = {
            @WebInitParam(name="USER_VIEW" ,value = "/weibo/user.jsp")
        }
)
public class User extends HttpServlet {
    private String USER_VIEW;
    @Override
    public void init() throws ServletException{
        USER_VIEW = getServletConfig().getInitParameter("USER_VIEW");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService = (UserService)getServletContext().getAttribute("userService");
        String username = request.getPathInfo().substring(1); //根据路径信息取得用户名称
        if(userService.isUserExisted(username)){
            List<Blah> blahs = userService.getBlahs(username);
            request.setAttribute("blahs",blahs);
        }
//        List<Blah> blahs = (List<Blah>) userService.getBlahs();
//        for (Blah blah : blahs)
//        {
//            System.out.println(blah.getUsername());
//        }
        request.setAttribute("username",username);
        System.out.println(USER_VIEW);
        request.getRequestDispatcher(USER_VIEW).forward(request,response);
    }
}
