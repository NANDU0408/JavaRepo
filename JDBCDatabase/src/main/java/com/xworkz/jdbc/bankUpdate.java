package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bankUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery= "update bank set branch = 'Ramnagar' where name= 'SBI'";
        String updateQuery1= "update bank set name = 'Union' where branch= 'Sapthapur'";
        String updateQuery2= "update bank set branch = 'Radhanagar' where name= 'SBI'";
        String updateQuery3= "update bank set name = 'Union' where branch= 'Corporation'";
        String updateQuery4= "update bank set branch = 'Vikasnagar' where name= 'Canara'";
        String updateQuery5= "update bank set branch = 'Jaynagar' where name= 'Union'";
        String updateQuery6= "update bank set location = 'Chennai' where name= 'SBI'";
        String updateQuery7= "update bank set location = 'Mausoori' where name= 'Canara'";
        String updateQuery8= "update bank set branch = 'Vijaynagar' where name= 'Union'";
        String updateQuery9= "update bank set name = 'IDFC' where location= 'Dharwad'";


        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            Statement statement = connection.createStatement();
            boolean result = statement.execute(updateQuery);
            System.out.println(result);
            System.out.println("Updated data into Bank");
            System.out.println("Database connection is successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
