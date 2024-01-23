package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank1 {
    public static void main(String[] args) {
        Connection connection= null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String passward = "Xworkzodc@123";

        String deleteQuery= "delete from bank where name= 'Union'";

        try {
             connection = DriverManager.getConnection(jdbcUrl,userName,passward);
             statement = connection.createStatement();
            int result = statement.executeUpdate(deleteQuery);
            System.out.println(result);
            System.out.println("Updated details into the bank");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
