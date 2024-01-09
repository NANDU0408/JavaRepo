class Carom{
	String brand;
	String type;
	int price;
	String madeOf;
	int noOfstrikers;
	 
	
	Carom(){
		super();
		System.out.println("Carom");
	}
	
	
	Carom(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Carom constructor with parameter Carom brand:" +brand);
	}
	
	Carom(String brand, String type){
		super();
		this.brand=brand;
		this.type=type;
		System.out.println("Creating the Carom constructor with parameter Carom brand:" +brand+ "," +type);
	}
	
	Carom(String brand,  String type,  int price){
		this(brand,type);
		this.price=price;
		System.out.println("Creating the Carom constructor with parameter Carom brand:" +brand+ "," +type+ "," +price);
	}
	
	Carom(String brand, String type,  int price, String madeOf){
		this(brand,type,price);
		this.madeOf=madeOf;
		System.out.println("Creating the Carom constructor with parameter Carom brand:" +brand+ "," +type+ "," +price+ "," +madeOf);
	}
		
	Carom(String brand, String type,  int price, String madeOf, int noOfstrikers){
		this(brand,type,price,madeOf);
		this.noOfstrikers=noOfstrikers;
		System.out.println("Creating the Carom constructor with parameter Carom brand:" +brand+ "," +type+ "," +price+ "," +madeOf+ "," +noOfstrikers);
	}
	
}