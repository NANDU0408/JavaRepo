package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnchorIUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl= "jdbc:mysql://localhost:3306/NEWSCHANNEL";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery = "UPDATE ANCHORSLIST SET name=?, salary=?, experience=?, location=? WHERE id=?";;

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,"Vijay");
            preparedStatement.setDouble(2,75000);
            preparedStatement.setInt(3,7);
            preparedStatement.setString(4,"Vijaynagar");
            preparedStatement.setInt(5,1);
            preparedStatement.execute();

            preparedStatement.setString(1,"Ajay");
            preparedStatement.setDouble(2,75000);
            preparedStatement.setInt(3,7);
            preparedStatement.setString(4,"Ramnagar");
            preparedStatement.setInt(5,2);
            preparedStatement.execute();

            preparedStatement.setString(1,"Narmadha");
            preparedStatement.setDouble(2,60000);
            preparedStatement.setInt(3,6);
            preparedStatement.setString(4,"Azadnagar");
            preparedStatement.setInt(5,3);
            preparedStatement.execute();

            preparedStatement.setString(1,"Raj");
            preparedStatement.setDouble(2,70000);
            preparedStatement.setInt(3,6);
            preparedStatement.setString(4,"BTM");
            preparedStatement.setInt(5,4);
            preparedStatement.execute();

            preparedStatement.setString(1,"Jagdeep");
            preparedStatement.setDouble(2,75000);
            preparedStatement.setInt(3,5);
            preparedStatement.setString(4,"Malleshwaram");
            preparedStatement.setInt(5,5);
            preparedStatement.execute();

            preparedStatement.setString(1,"Vinay");
            preparedStatement.setDouble(2,90000);
            preparedStatement.setInt(3,7);
            preparedStatement.setString(4,"Vijaynagar");
            preparedStatement.setInt(5,6);
            preparedStatement.execute();

            preparedStatement.setString(1,"Harish");
            preparedStatement.setDouble(2,60000);
            preparedStatement.setInt(3,4);
            preparedStatement.setString(4,"Rajnagar");
            preparedStatement.setInt(5,7);
            preparedStatement.execute();

            preparedStatement.setString(1,"Nathuram");
            preparedStatement.setDouble(2,75000);
            preparedStatement.setInt(3,7);
            preparedStatement.setString(4,"Ganginagar");
            preparedStatement.setInt(5,8);
            preparedStatement.execute();

            preparedStatement.setString(1,"Bhagat");
            preparedStatement.setDouble(2,500000);
            preparedStatement.setInt(3,5);
            preparedStatement.setString(4,"Amannagar");
            preparedStatement.setInt(5,9);
            preparedStatement.execute();

            preparedStatement.setString(1,"Rukmini");
            preparedStatement.setDouble(2,750000);
            preparedStatement.setInt(3,4);
            preparedStatement.setString(4,"Mathura");
            preparedStatement.setInt(5,10);
            preparedStatement.execute();
            System.out.println("Data added successfully");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
