package com.xworkz.interfacea.nandishA.abstracti;

public class Theater {
    TicketBooking ticketBooking;
    public Theater(TicketBooking ticketBooking){
        this.ticketBooking= ticketBooking;
    }
    //int bookTicket1 = ticketBooking.bookTicket();
   // if(bookTicket1>0)


        public double bookTicket (int quantity) {
            int bookTicket = ticketBooking.buy(quantity);
            String cancel = ticketBooking.cancel();
           // int total = ticketBooking.buy();
            int total = bookTicket*200;
            if (bookTicket > 0) {
                System.out.println(bookTicket);
                if (bookTicket > 5) {
                    int res= (int) (total*(0.1));
                    int grandTotal=total-res;
                    System.out.println("10% Discount:"+grandTotal);
                    return grandTotal;
                }
                else {
                    System.err.println("Less than or equal to 5 number of tickets No Discount:"+total);
                    System.out.println("Total Amt:"+total);
                    return total;
                }
            } else {
                System.err.println(cancel);
            }
        return 0;
    }


}
