package dao;

import java.sql.*;

public class Util {
    private static String DRIVER="com.mysql.jdbc.Driver";//数据库连接jar包5.0是com.mysql.jdbc.Driver，此为8.0的驱动路径
    private static String URL="jdbc:mysql://localhost:3306/xrep?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&autoReconnect=true";  //指定连接的数据库以及连接属性设置
    private static String USERNAME="root";//用户名
    private static String PWD="123456";//密码

    public static Connection getConnection() throws ClassNotFoundException, SQLException {//获得连接
        Connection connection=null;
        Class.forName(DRIVER);
        connection= DriverManager.getConnection(URL, USERNAME, PWD);
        return connection;
    }

    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {//关闭连接
        if(connection!=null) connection.close();
        if(statement!=null) statement.close();
        if(resultSet!=null) resultSet.close();
    }

    public static void closeAll(Connection connection,Statement statement) throws SQLException {//关闭连接
        if(connection!=null) connection.close();
        if(statement!=null) statement.close();
    }
}
