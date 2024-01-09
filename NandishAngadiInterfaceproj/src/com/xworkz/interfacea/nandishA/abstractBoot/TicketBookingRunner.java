package com.xworkz.interfacea.nandishA.abstractBoot;

import com.xworkz.interfacea.nandishA.abstracti.*;

public class TicketBookingRunner {
    public static void main(String[] args) {
        TicketBooking ticketBooking= new Customer();
        Theater theater= new Theater(ticketBooking);
        theater.bookTicket(6);
    }
}

