package com.xworkz.jdbc;

import java.sql.*;

public class bank2 {
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

        String fetchQuery= "Select * from bank where name= 'SBI'";
//        String fetchQuery= "Select * from bank";

        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,passward);
             statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(fetchQuery);
            System.out.println(resultSet.toString());
            if(resultSet.next()){
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("branch"));
                System.out.println(resultSet.getString("IFSC"));
                System.out.println(resultSet.getString("location"));
            }
            System.out.println("Updated details into the bank");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }
    }

