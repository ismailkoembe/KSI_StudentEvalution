package com.school.KSI.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    /**
     * no getter and setter, it means only one and same instance will be used.
     * */
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    /**Method creates DB connection without parameter*/
    public static void createConnection() {
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
    public static void destroyConnection() {
        try {
            if (connection != null) connection.close();
            if (statement != null) connection.close();
            if (resultSet != null) connection.close();
        }catch (SQLException s){
            System.out.println(s);
        }
    }
    /**
     * @param query
     * This method takes query and creates statement and execute query.
     * Thanks to parameters resultset can be usable first to last and reverse*/
    private static void executeQuery(String query) {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**Method returns all rows of DB in list
     * If there is a one row, it returns one list
     *
     * */
    public static List<List<Object>> getQueryResultList(String query){
            createConnection();
            executeQuery(query);
            List<List<Object>> rowList= new ArrayList<>();
            ResultSetMetaData rsmd;
            try{
            while(resultSet.next()) {
                rsmd=resultSet.getMetaData();
                List<Object> row = new ArrayList<>();
                for (int i = 1; i <=rsmd.getColumnCount() ; i++) {
                   row.add(resultSet.getObject(i));
                }
                rowList.add(row);
            }
            }catch (SQLException s){
                System.out.println(s);
            }
        return rowList;
    }
    /**
     * Methods return just one row
     * */
    public static List<Object> getRowList(String query) {
        return getQueryResultList(query).get(0);
    }

}
