package work03;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/19/20 12:06 AM
 * @Version 1.0
 * @Description:
 **/

public class JDBCUtils {

    public static Connection getConnection() {
        // 1.准备配置信息
        String dirverClass = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mikey";
        String user = "root";
        String password = "123456";
        // 2.加载驱动，获得链接
        Connection connection = null;
        try {
            Class.forName(dirverClass);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源，注意资源的释放顺序
     */
    public static void release(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
