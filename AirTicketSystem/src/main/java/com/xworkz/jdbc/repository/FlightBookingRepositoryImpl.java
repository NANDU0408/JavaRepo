package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.DTO.FlightBooking;
import com.xworkz.jdbc.repository.FlightBookingRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{
    @Override
    public void saveFlightBookingDetails(FlightBooking booking) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "Xworkzodc@123";

        String insertQuery = "INSERT INTO AIRTICKET" +
                "(flight_name, source, destination, ticket_price)" +
                "VALUES(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, booking.getFlightName());
            preparedStatement.setString(2,booking.getSource());
            preparedStatement.setString(3,booking.getDestination());
            preparedStatement.setDouble(4,booking.getTicketPrice());
            preparedStatement.execute();
            System.out.println("Data Inserted");
            System.out.println("DataBase Connection Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveAll(List<FlightBooking> bookings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "Xworkzodc@123";

        String insertQuery = "INSERT INTO AIRTICKET" +
                "(flight_name, source, destination, ticket_price)" +
                "VALUES(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            for (FlightBooking flightBooking: bookings){
                preparedStatement.setString(1,flightBooking.getFlightName());
                preparedStatement.setString(2,flightBooking.getSource());
                preparedStatement.setString(3,flightBooking.getDestination());
                preparedStatement.setDouble(4,flightBooking.getTicketPrice());
                preparedStatement.execute();
                System.out.println("Inserted Data Successfully"+flightBooking);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String flight_name, String source, String destination) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "Xworkzodc@123";

        String updateQuery = "UPDATE AIRTICKET SET source = ?, destination = ? " +
                "where flight_name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,source);
            preparedStatement.setString(2,destination);
            preparedStatement.setString(3,flight_name);
            preparedStatement.executeUpdate();
            System.out.println("Updated data !!!!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String flight_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "Xworkzodc@123";

        String deleteQuery = "DELETE FROM AIRTICKET WHERE flight_name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,flight_name);
            preparedStatement.execute();
            System.out.println("Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
