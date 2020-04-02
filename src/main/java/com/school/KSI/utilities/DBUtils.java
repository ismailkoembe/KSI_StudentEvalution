package com.school.KSI.utilities;

import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**Method creates DB connection without parameter*/
    protected static void createConnection() {
        String url = "jdbc:mysql://127.0.0.1/ksi";
        String username = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**Method destroy connection*/
    public static void destroyConnection(){
         if(connection!=null) connection=null;
         if(statement!=null) connection=null;
         if(resultSet!=null) connection=null;
    }


}
