package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.DTO.FlightBooking;
import com.xworkz.jdbc.repository.FlightBookingRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
