package com.xworkz.jdbc.service;

import com.xworkz.jdbc.DTO.FlightBooking;

import java.util.List;

public interface FlightBookingService {
    public void save(FlightBooking booking);

    public  void saveAll(List<FlightBooking> booking);
}
