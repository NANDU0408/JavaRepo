package com.xworkz.jdbc;

import java.sql.*;

public class BankFetchPS {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String selectQuery = "Select * from bank where name = ? and branch = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1,"SBI");
            preparedStatement.setString(2,"Ramnagar");
            resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()){
                System.out.println("Bank Details_______________");
                System.out.println("Bank id___________"+resultSet.getInt("id"));
                System.out.println("Bank Name_________"+resultSet.getString("name"));
                System.out.println("Bank branch_______"+resultSet.getString("branch"));
                System.out.println("IFSC______________"+resultSet.getString("IFSC"));
                System.out.println("Location__________"+resultSet.getString("LOCATION"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection!= null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
