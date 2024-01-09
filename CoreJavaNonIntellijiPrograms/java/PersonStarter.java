class PersonStarter{
	public static String bookTicket(String movieName, int quantity){
		String place=BookMyShow1.purchaseInAdvance("LEO",6 );
		String msg;
		msg=Person.bookTicket("LEO",3);
		System.out.println(msg);
		msg=Person.bookTicket("Ghost",3);
		System.out.println(msg);
		msg=Person.bookTicket("Kantara",3);
		System.out.println(msg);
		msg=Person.bookTicket("SSE",3);
		System.out.println(msg);
	}
	return place;
}