class Bracelet{
	String brand;
	String type;
	int price;
	int qualityInCarat;
	int durabilityOfMetalInYears;
	 
	
	Bracelet(){
		this("Joyallukas","Silver",30000,22,10);
		System.out.println("Bracelet");
	}
	
	
	Bracelet(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Bracelet constructor with parameter Bracelet brand:" +brand);
	}
	
	Bracelet(String brand, String type){
		this(brand);
		this.type=type;
		System.out.println("Creating the Bracelet constructor with parameter Bracelet brand:" +brand+ "," +type);
	}
	
	Bracelet(String brand,  String type,  int price){
		this(brand,type);
		this.price=price;
		System.out.println("Creating the Bracelet constructor with parameter Bracelet brand:" +brand+ "," +type+ "," +price);
	}
	
	Bracelet(String brand, String type,  int price, int qualityInCarat){
		this(brand,type,price);
		this.qualityInCarat=qualityInCarat;
		System.out.println("Creating the Bracelet constructor with parameter Bracelet brand:" +brand+ "," +type+ "," +price+ "," +qualityInCarat);
	}
		
	Bracelet(String brand, String type,  int price, int qualityInCarat, int durabilityOfMetalInYears){
		this(brand,type,price,qualityInCarat);
		this.durabilityOfMetalInYears=durabilityOfMetalInYears;
		System.out.println("Creating the Bracelet constructor with parameter Bracelet brand:" +brand+ "," +type+ "," +price+ "," +qualityInCarat+ "," +durabilityOfMetalInYears);
	}
	
}