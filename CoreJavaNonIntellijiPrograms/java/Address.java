class Address{
	
	String street="Mico Layout";
	long pincode=560076;
	City city;
	
	Address(){
		
		System.out.println(" Address Created");
	}
	void setCity(City city){
		this.city=city;
	}
	void displayInfo(){
		
		System.out.println("Starting info in Address");
		System.out.println("Street name is "+this.street);
		System.out.println("Street pincode is "+this.pincode);
		System.out.println("Street city is "+this.city);
		if(this.city!=null){
			city.displayInfo();
		}
		
		System.out.println("Ending info in Address");
	}
}