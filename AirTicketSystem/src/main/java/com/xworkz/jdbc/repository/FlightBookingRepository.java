package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.DTO.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {
    public void saveFlightBookingDetails(FlightBooking booking);

    public void saveAll(List<FlightBooking> booking);

    public void update(String flight_name, String source, String destination);

    public void delete(String flight_name);
}
