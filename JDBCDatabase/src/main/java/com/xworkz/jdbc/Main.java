package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/Bank_Application";
        String userName = "root";
        String password = "Xworkzodc@123";

        String insertQuery= "INSERT INTO bank VALUES(1,'SBI', 'BTM','NNA125671','Bangalore');";
        String insertQuery1= "INSERT INTO bank VALUES(2,'Canara', 'Marathalli','NAN125771','Bangalore');";
        String insertQuery2= "INSERT INTO bank VALUES(3,'SBI', 'Marathalli','NNN125971','Bangalore');";
        String insertQuery3= "INSERT INTO bank VALUES(4,'SBI', 'Jayanagar','NNV325277','Bangalore');";
        String insertQuery4= "INSERT INTO bank VALUES(5,'Corporation', 'Vijaynagar','NVV325277','Bangalore');";
        String insertQuery5= "INSERT INTO bank VALUES(6,'IDFC', 'WhiteField','BCD786576','Bangalore');";
        String insertQuery6= "INSERT INTO bank VALUES(7,'Union', 'KR Market','HDF567474','Bangalore');";
        String insertQuery7= "INSERT INTO bank VALUES(8,'Canara', 'KR Market','YUF57577','Bangalore');";
        String insertQuery8= "INSERT INTO bank VALUES(9,'Union', 'Vidhyagiri','UIY56865','Dharwad');";
        String insertQuery9= "INSERT INTO bank VALUES(10,'Canara', 'Sapthapur','RTY6699','Dharwad');";


        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName,password);
            Statement statement = connection.createStatement();
            boolean result = statement.execute(insertQuery);
            System.out.println(result);
            System.out.println("Inserted data into bank");
            System.out.println("Connection to Database is successful !!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}