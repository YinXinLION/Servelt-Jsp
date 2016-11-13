package cc.openhome;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by yinxin on 16-10-20.
 */
public class UserService {

    public List<Blah> getBlahs() throws IOException{
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String username = null;
        String txt;
        Date date;
        List<Blah> blahs = new ArrayList<Blah>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql = "SELECT * FROM Forum_info ";
        try{
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                username = (String)rs.getObject("username");
                txt = (String)rs.getObject("speak");
                date = (Date)rs.getObject("time");
                blahs.add(new Blah(username,date,txt));
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }finally {
            jdbcUtils.free(rs,st,conn);
        }
        return blahs;
    }

    public List<Blah> getBlahs(String username) throws IOException{
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String txt;
        Date date;
        List<Blah> blahs = new ArrayList<Blah>();
        String sql = "SELECT * FROM Forum_info ";
        try{
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("asdasd");
            while (rs.next()){
                if(rs.getObject("username").toString().equals(username))
                {
                    txt = (String)rs.getObject("speak");
                    date = (Date)rs.getObject("time");
                    blahs.add(new Blah(username,date,txt));
                }
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }finally {
            jdbcUtils.free(rs,st,conn);
        }
        return blahs;
    }

    public void addBlah(Blah blah) throws IOException{
        String username;
        String blabla = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        username = blah.getUsername();
        blabla = blah.getTxt();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        String sql = "insert into Forum_info(username,speak,time) values('"+username+"','"+blabla+"','"+time+"')";
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
//重复太多
    public void deleteBlah(int i){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql ="delete from Forum_info WHERE id = " + i;
        try{
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            st.executeUpdate(sql);//执行语句
        }catch (Exception e)
        {
            System.out.println(e);
        }finally {
            jdbcUtils.free(rs,st,conn);
        }
    }

    public boolean isUserExisted(String username)
    {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Forum_info";
        boolean result = false;
        try {
            conn = jdbcUtils.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next())
            {
                if(rs.getObject("username").toString().equals(username))
                {
                    result = true;
                    break;
                }
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }finally {
            jdbcUtils.free(rs,st,conn);
        }
        return result;
    }
}


