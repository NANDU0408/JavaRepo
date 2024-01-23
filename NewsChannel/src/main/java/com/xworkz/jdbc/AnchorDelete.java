package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnchorDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl= "jdbc:mysql://localhost:3306/NEWSCHANNEL";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery = "DELETE FROM ANCHORSLIST WHERE id=?";;

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setInt(1, 1);
            preparedStatement.execute();

            preparedStatement.setInt(1, 2);
            preparedStatement.execute();

            preparedStatement.setInt(1, 3);
            preparedStatement.execute();

            preparedStatement.setInt(1, 4);
            preparedStatement.execute();

            preparedStatement.setInt(1, 5);
            preparedStatement.execute();

            preparedStatement.setInt(1, 6);
            preparedStatement.execute();

            preparedStatement.setInt(1, 7);
            preparedStatement.execute();

            preparedStatement.setInt(1, 8);
            preparedStatement.execute();

            preparedStatement.setInt(1, 9);
            preparedStatement.execute();

            preparedStatement.setInt(1, 10);
            preparedStatement.execute();
            System.out.println("Data added successfully");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
