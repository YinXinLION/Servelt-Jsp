package HttpSerlevtResponse;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by yinxin on 16-10-26.
 */
//生成随机图片
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("refresh", "5");//refresh控制浏览器每隔5秒刷新一次
        //在内存中创建一张图片
        BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_3BYTE_BGR);
        //得到图片
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0,0,80,20);//填充背景色
        //向图片上写数据
        g.setColor(Color.BLUE);//设置字体颜色
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(),0,20);
        //设置响应头控制浏览器以图片方式打开
        response.setContentType("image/jpeg");
        //设置浏览器不缓存图片
        response.setDateHeader("expries",-1);
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Pragma","no-cache");
        //将图片写给浏览器
        ImageIO.write(image,"jpg",response.getOutputStream());
    }
    //生成随机数
    private String makeNum(){
        Random random = new Random();
        String num = random.nextInt(9999999)+"";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 7-num.length();i++){
            sb.append("0");
        }
        num = sb.toString()+num;
        return num;
    }
}
