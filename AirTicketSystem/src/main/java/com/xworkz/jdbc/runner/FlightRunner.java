package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.DTO.FlightBooking;
import com.xworkz.jdbc.repository.FlightBookingRepository;
import com.xworkz.jdbc.repository.FlightBookingRepositoryImpl;

public class FlightRunner {
    public static void main(String[] args) {
        FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();
        FlightBooking flightBooking = new FlightBooking("AirAsia","Mumbai","Bali", 45000);
        flightBookingRepository.saveFlightBookingDetails(flightBooking);
    }
}
