class Ornament{
	String brand;
	String type;
	int price;
	int purityInCarat;
	 
	
	Ornament(){
		super();
		System.out.println("Ornament");
	}
	
	
	Ornament(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Ornament constructor with parameter Ornament brand:" +brand);
	}
	
	Ornament(String brand, String type){
		super();
		this.brand=brand;
		this.type=type;
		System.out.println("Creating the Ornament constructor with parameter Ornament brand:" +brand);
		System.out.println("Creating the Ornament constructor with parameter Ornament type:" +type);
	}
	
	Ornament(String brand,  String type,  int price){
		super();
		this.brand=brand;
		this.type=type;
		this.price=price;
		System.out.println("Creating the Ornament constructor with parameter Ornament brand:" +brand);
		System.out.println("Creating the Ornament constructor with parameter Ornament type:" +type);
		System.out.println("Creating the Ornament constructor with parameter Ornament price:" +price);
	}
	
	Ornament(String brand, String color,  int price, int purityInCarat){
		super();
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.purityInCarat=purityInCarat;
		System.out.println("Creating the Ornament constructor with parameter Ornament brand:" +brand);
		System.out.println("Creating the Ornament constructor with parameter Ornament type:" +type);
		System.out.println("Creating the Ornament constructor with parameter Ornament price:" +price);
		System.out.println("Creating the Ornament constructor with parameter Ornament purityInCarat:"+purityInCarat);
	}
	
}