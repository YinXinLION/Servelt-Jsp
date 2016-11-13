package cc.openhome;

import java.sql.*;

public final class jdbcUtils {
    private static String url = "jdbc:mysql://localhost:3306/WeiBo?characterEncoding=utf8";
    private static String user = "root";
    private static String password = "123456";
    private jdbcUtils()
    {

    }
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");//注册驱动
        }catch (ClassNotFoundException e)
        {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url,user,password);//连接
    }

    public static void free(ResultSet rs, Statement st, Connection conn)
    {
        try {
            if(rs != null)
            {
                rs.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                if(st != null)
                {
                    st.close();
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
            finally {
                try{
                    if(conn != null)
                        st.close();
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}