package com.xworkz.interfacea.nandishA.abstracti;

public class Customer implements TicketBooking{
    @Override
    public String cancel() {
       String tickets="Cancelled";
        //System.err.println(tickets);
        return tickets;
    }

    @Override
    public int buy(int quantity){
        System.out.println("TicketBooked="+quantity);
        double sell=1089;
        return quantity;
    }

    @Override
    public int bookTicket() {
        return 0;
    }
}
