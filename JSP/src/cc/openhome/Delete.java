package cc.openhome;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yinxin on 16-10-22.
 */
@WebServlet("/delete.do")
public class Delete extends HttpServlet {
    String MEMBER_VIEW = "/message.do";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number= Integer.parseInt(request.getParameter("message"));

        UserService userService = (UserService) getServletContext().getAttribute("userService");
        userService.deleteBlah(number);
        request.getRequestDispatcher(MEMBER_VIEW).forward(request,response);
    }
}
