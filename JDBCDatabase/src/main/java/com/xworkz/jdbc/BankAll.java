package com.xworkz.jdbc;

import java.sql.*;

public class BankAll {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String fetchQuery = "SELECT * FROM bank";

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(fetchQuery);

            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Branch: " + resultSet.getString("branch"));
                System.out.println("IFSC: " + resultSet.getString("IFSC"));
                System.out.println("Location: " + resultSet.getString("location"));
                System.out.println("----------------------");
            }

            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}