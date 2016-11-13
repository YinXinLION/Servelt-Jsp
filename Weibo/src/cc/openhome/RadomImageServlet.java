package cc.openhome;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * Created by yinxin on 16-9-17.
 */
@WebServlet("/RadomImageServlet")
public class RadomImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("image/jpeg");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++)
        {
            int number = (int) (Math.random() * 10);
            builder.append(number);
        }
        BufferedImage passwd = getPasswdImage(builder.toString());
        // 將產生的驗證碼存在某個地方，以供之後比對

        OutputStream out = response.getOutputStream();
        ImageIO.write(passwd, "JPG", out);
        out.close();
    }


    //一些 java 2D 的东西,传入数字产生验证码
    public BufferedImage getPasswdImage(String passwd) throws IOException
    {
        BufferedImage image = new BufferedImage(60,20,BufferedImage.TYPE_3BYTE_BGR);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("標楷體", Font.BOLD, 16));
        graphics.drawString(passwd, 10, 15);
        return image;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
