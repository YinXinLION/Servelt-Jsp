package HttpSerlevtResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by yinxin on 16-10-26.
 */
//向浏览器输出中国2字
@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
    private static final long serialVersionUID = 4312868947607181532L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            outputChineseVyOutputStream(response);//使用OutputStream输出中文
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void outputChineseVyOutputStream(HttpServletResponse response) throws Exception
    {
        String data="中国";
        OutputStream outputStream = response.getOutputStream();//获取OutputStream输出流
        response.setHeader("content-type","text/html;charset=UTF-8");//设置响应头控制UTF-8的编码
        byte[] dataByteArr = data.getBytes("UTF-8");
        //getBytes不带参数根据操作系统环境选择码表 将字符转成字节数组
        outputStream.write(dataByteArr);

    }
}
