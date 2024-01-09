class Theater {
    public int seatsAvailable = 100;
	public int getMovieTicketPrice(String movieName){
		movieName.toUpperCase();
		switch (movieName) {
    case "LEO":return 250;

	case "GHOST": return 120;
	case "KANTARA": return 300;
	case "SSE": return 100;
	default: return -1;
}
	}

	}
    public int purchaseInAdvance(String movieName, int quantity) {
	
		
		  if (seatsAvailable < quantity) {
            System.out.println("Insufficient seats");
            return 0;
		  }
		  
		  
        int price = getMovieTicketPrice(movieName);
		
        if (price<0) {
            System.out.println("Movie not found");
            return 0; 
        }
  
        return 1;
    }

    public int provideTotal(String movieName, int quantity) {
	

        if (movie == null) {
            System.out.println("Movie not found");
            return -1;
        }

    }
}