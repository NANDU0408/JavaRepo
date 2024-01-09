class HotelRunner{
	public static void main(String[] nnn){
		System.out.println("Starting the Hotel main");
		MenuCard menuCard= new MenuCard();
		menuCard.setMenuCard(15,5000);
		Hotel hotel=new Hotel("VishistVengen","Vikas",menuCard);
		hotel.displayInfo();
		System.out.println("Ending the Hotel main");
	}
}


