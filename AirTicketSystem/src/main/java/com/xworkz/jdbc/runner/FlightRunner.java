package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.DTO.FlightBooking;
import com.xworkz.jdbc.repository.FlightBookingRepository;
import com.xworkz.jdbc.repository.FlightBookingRepositoryImpl;
import com.xworkz.jdbc.service.FlightBookingService;
import com.xworkz.jdbc.service.FlightBookingServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {
//        FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();
        FlightBooking flightBooking = new FlightBooking("AirAsia","Mumbai","Bali", 45000);
//        flightBookingRepository.saveFlightBookingDetails(flightBooking);

        FlightBookingService flightBookingService = new FlightBookingServiceImpl();
        flightBookingService.save(flightBooking);

        List<FlightBooking> flightBookings = new ArrayList<>();
        FlightBooking flightBooking1 = new FlightBooking("AirAsia","Bangalore","Dehli",10000);
        FlightBooking flightBooking2 = new FlightBooking("Indigo", "Bangalore", "Chennai", 7000);
        flightBookings.add(flightBooking1);
        flightBookings.add(flightBooking2);
        flightBookingService.saveAll(flightBookings);

        flightBookingService.update("AirIndia", "Bangalore","Assam");
        flightBookingService.delete("AirAsia");

    }
}
