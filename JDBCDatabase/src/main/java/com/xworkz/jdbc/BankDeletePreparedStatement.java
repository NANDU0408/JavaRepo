package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankDeletePreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String deleteQuery = "DELETE FROM BANK WHERE BRANCH=? AND LOCATION= ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,"SBI");
            preparedStatement.setString(2,"Bangalore");
            preparedStatement.execute();
            System.out.println("Deleted successfully");
            System.out.println("DataBase Connection Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
