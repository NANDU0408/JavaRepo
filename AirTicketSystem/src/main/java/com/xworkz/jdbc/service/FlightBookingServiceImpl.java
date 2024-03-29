package com.xworkz.jdbc.service;

import com.xworkz.jdbc.DTO.FlightBooking;
import com.xworkz.jdbc.repository.FlightBookingRepository;
import com.xworkz.jdbc.repository.FlightBookingRepositoryImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService{
    FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();

    @Override
    public void save(FlightBooking booking) {
        //Validation Logic
        if (booking.getFlightName().isEmpty()){
            System.out.println("Please Enter Valid Flight Name");
        }
        else {
            //repository method save
            flightBookingRepository.saveFlightBookingDetails(booking);
        }
    }

    @Override
    public void saveAll(List<FlightBooking> booking) {
        boolean validBooking= true;
        for(FlightBooking flightBooking: booking) {
            if (flightBooking.getFlightName().isEmpty()) {
                System.out.println("Please Enter The Valid Flight Name");
                validBooking = false;
            }
        }
        if(!validBooking){
            return;
        }
        flightBookingRepository.saveAll(booking);

    }

    @Override
    public void update(String flight_name, String source, String destination) {
    if (flight_name == null || flight_name.isEmpty()){
        System.out.println("Please Enter Valid Flight Name");
    }else {
        flightBookingRepository.update(flight_name, source,destination);
    }
    }

    @Override
    public void delete(String flight_name) {
       if (flight_name == null || flight_name.isEmpty()){
           System.out.println("Please Enter Valid Flight Name");
       }else {
           flightBookingRepository.delete(flight_name);
       }
    }
}
