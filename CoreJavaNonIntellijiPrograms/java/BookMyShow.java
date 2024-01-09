class BookMyShow {
    public Theater theater;
    public boolean isTheaterInitialized = false;


    public int bookTicket(String movieName, int quantity, int result ) {
        if (theater == null) {
            System.out.println("Theater is not initialized. Cannot book a ticket.");
            return 0;
        }
		
		
		if (movieName == null) {
            System.out.println("Provide Movie name");
            return 0; 
        }

        if (quantity < 1) {
            System.out.println("Please select seats");
            return 0; 
        }
		
		if (result<0) {
            System.out.println("Booking Failed");
        }
		else{
			System.out.println("Booking Successful");
		}
		
		
        return theater.purchaseInAdvance(movieName, quantity);
    }
}
