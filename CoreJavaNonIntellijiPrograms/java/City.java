class City{
	
	String name;
	String stateName;
	
	City(){
		
		System.out.println("created City using no arg const....");
	}
	
	void displayInfo(){
		System.out.println("Starting in City");
		System.out.println("City name is "+this.name);
		System.out.println("City stateName is "+this.stateName);
		System.out.println("Ending in City");
		
	}
}