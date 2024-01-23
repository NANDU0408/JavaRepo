package com.xworkz.jdbc;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankAllInsertion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String passward = "Xworkzodc@123";

        String insertQuery = "INSERT INTO BANK VALUES(?,?,?,?,?)";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, passward);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//            preparedStatement.setInt(1,7);
//            preparedStatement.setString(2,"ICICI");
//            preparedStatement.setString(3,"Rajnagar");
//            preparedStatement.setString(4,"IFGR765775");
//            preparedStatement.setString(5,"Bangalore");
//            preparedStatement.execute();
            preparedStatement.setInt(1,8);
            preparedStatement.setString(2,"Axis");
            preparedStatement.setString(3,"Rajnagar");
            preparedStatement.setString(4,"YUIHG78667");
            preparedStatement.setString(5,"Mangalore");
            preparedStatement.execute();
            preparedStatement.setInt(1,9);
            preparedStatement.setString(2,"Union");
            preparedStatement.setString(3,"Ramnagar");
            preparedStatement.setString(4,"GHLAN79687");
            preparedStatement.setString(5,"Mangalore");
            preparedStatement.execute();
//            System.out.println(result);
            System.out.println("Data added successfully");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
