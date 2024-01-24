package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankUpdatePS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery ="UPDATE BANK SET BRANCH = ? WHERE LOCATION = ? AND IFSC = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,"Vijaynagar");
            preparedStatement.setString(2,"Bangalore");
            preparedStatement.setString(3,"BCD786576");
            preparedStatement.execute();
            System.out.println("DataBase Updated Successfully");
            System.out.println("DataBase Connection Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
