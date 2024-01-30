package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.DTO.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {
    public void saveFlightBookingDetails(FlightBooking booking);

    public void saveAll(List<FlightBooking> booking);
}
