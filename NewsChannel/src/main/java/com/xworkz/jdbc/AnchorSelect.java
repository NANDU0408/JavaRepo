package com.xworkz.jdbc;

import java.sql.*;

public class AnchorSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl= "jdbc:mysql://localhost:3306/NEWSCHANNEL";
        String userName = "root";
        String password = "Xworkzodc@123";

        String selectQuery = "SELECT * FROM ANCHORSLIST WHERE ID=?";;

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, 1);
            preparedStatement.setInt(1, 2);
            preparedStatement.setInt(1, 3);
            preparedStatement.setInt(1, 4);
            preparedStatement.setInt(1, 5);
            preparedStatement.setInt(1, 6);
            preparedStatement.setInt(1, 7);
            preparedStatement.setInt(1, 8);
            preparedStatement.setInt(1, 9);
            preparedStatement.setInt(1, 10);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                int experience = resultSet.getInt("experience");
                String location = resultSet.getString("location");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary +
                        ", Experience: " + experience + ", Location: " + location);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

            System.out.println("Data shown successfully");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
