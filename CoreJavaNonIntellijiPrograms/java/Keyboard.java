class Keyboard{
	String brand;
	String color="black";
	int cost;
	int noOfKeys;
	String type;
	int serialNo=1971;
	
	
	Keyboard(){
		System.out.println("Keyboard");
	}
	
	Keyboard(String brand){
		this.brand=brand;
		System.out.println("Creating the keyboard constructor with parameter brand:" +brand);
	}
	
	Keyboard(String brand, int cost){
		this.brand=brand;
		this.cost=cost;
		System.out.println("Creating the keyboard constructor with parameter brand:" +brand);
	}
	
	Keyboard(String brand, int cost, int noOfKeys){
		this.brand=brand;
		this.cost=cost;
		this.noOfKeys=noOfKeys;
		System.out.println("Creating the keyboard constructor with parameter brand:" +brand);
	}
	
	Keyboard(String brand, int cost,  int noOfKeys, String color){
		this.brand=brand;
		this.cost=cost;
		this.noOfKeys=noOfKeys;
		this.color=color;
		System.out.println("Creating the keyboard constructor with parameter brand:" +brand);
	}
	
	Keyboard(String brand, int cost, int noOfKeys, String color, int serialNo ){
		this.brand=brand;
		this.cost=cost;
		this.noOfKeys=noOfKeys;
		this.color=color;
		this.serialNo=serialNo;
		System.out.println("Creating the keyboard constructor with parameter brand:" +brand);
	}
}
