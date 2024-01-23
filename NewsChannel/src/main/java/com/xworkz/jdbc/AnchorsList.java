package com.xworkz.jdbc;

import java.sql.*;

public class AnchorsList {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl= "jdbc:mysql://localhost:3306/NEWSCHANNEL";
        String userName = "root";
        String password = "Xworkzodc@123";

        String insertQuery = "INSERT INTO ANCHORSLIST VALUES(?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
           PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
           preparedStatement.setInt(1,1);
           preparedStatement.setString(2,"Vikas");
           preparedStatement.setDouble(3,50000);
           preparedStatement.setInt(4,5);
           preparedStatement.setString(5,"BTM");
           preparedStatement.execute();

            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Vedha");
            preparedStatement.setDouble(3,55000);
            preparedStatement.setInt(4,4);
            preparedStatement.setString(5,"Rajnagar");
            preparedStatement.execute();

            preparedStatement.setInt(1,3);
            preparedStatement.setString(2,"Ramya");
            preparedStatement.setDouble(3,40000);
            preparedStatement.setInt(4,5);
            preparedStatement.setString(5,"Rajnagar");
            preparedStatement.execute();

            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"Ajay");
            preparedStatement.setDouble(3,45000);
            preparedStatement.setInt(4,3);
            preparedStatement.setString(5,"BTM");
            preparedStatement.execute();

            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"Madhav");
            preparedStatement.setDouble(3,500000);
            preparedStatement.setInt(4,15);
            preparedStatement.setString(5,"K.R.Puram");
            preparedStatement.execute();

            preparedStatement.setInt(1,6);
            preparedStatement.setString(2,"Radha");
            preparedStatement.setDouble(3,500000);
            preparedStatement.setInt(4,15);
            preparedStatement.setString(5,"BTM");
            preparedStatement.execute();

            preparedStatement.setInt(1,7);
            preparedStatement.setString(2,"Arjun");
            preparedStatement.setDouble(3,70000);
            preparedStatement.setInt(4,5);
            preparedStatement.setString(5,"Rajnagar");
            preparedStatement.execute();

            preparedStatement.setInt(1,8);
            preparedStatement.setString(2,"Janani");
            preparedStatement.setDouble(3,65000);
            preparedStatement.setInt(4,5);
            preparedStatement.setString(5,"K.R.Puram");
            preparedStatement.execute();

            preparedStatement.setInt(1,9);
            preparedStatement.setString(2,"Sita");
            preparedStatement.setDouble(3,500000);
            preparedStatement.setInt(4,15);
            preparedStatement.setString(5,"BTM");
            preparedStatement.execute();

            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Lakshmi");
            preparedStatement.setDouble(3,60000);
            preparedStatement.setInt(4,9);
            preparedStatement.setString(5,"BTM");
            preparedStatement.execute();
            System.out.println("Data added successfully");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
