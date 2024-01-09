class RestaurantRunning{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		SpecialItems[] specialItems= new SpecialItems[5];
		
		specialItems[0]=new SpecialItems("PURI_KURMA",2,120);
		specialItems[1]=new SpecialItems("DUM_BIRYANI",5,540);
		specialItems[2]=new SpecialItems("VEG_BIRYANI",3,400);
		specialItems[3]=new SpecialItems("MUSHROOM_NOODLES",4,600);
		specialItems[4]=new SpecialItems("DAHI_PURI",4,160);

		Restaurant restaurant = new Restaurant("Vikas",specialItems);
		restaurant.displayInfo();
		
		System.out.println("Ending main");
	}
}