class Printer{
	String brand;
	String type;
	int price;
	int serialNo;
	int noOfPages;
	 
	
	Printer(){
		super();
		System.out.println("Printer");
	}
	
	
	Printer(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Printer constructor with parameter Printer brand:" +brand);
	}
	
	Printer(String brand, String type){
		super();
		this.brand=brand;
		this.type=type;
		System.out.println("Creating the Printer constructor with parameter Printer brand:" +brand+ "," +type);
	}
	
	Printer(String brand,  String type,  int price){
		this(brand,type);
		this.price=price;
		System.out.println("Creating the Printer constructor with parameter Printer brand:" +brand+ "," +type+ "," +price);
	}
	
	Printer(String brand, String type,  int price, int serialNo){
		this(brand,type,price);
		this.serialNo=serialNo;
		System.out.println("Creating the Printer constructor with parameter Printer brand:" +brand+ "," +type+ "," +price+ "," +serialNo);
	}
		
	Printer(String brand, String type,  int price, int serialNo, int noOfPages){
		this(brand,type,price,serialNo);
		this.noOfPages=noOfPages;
		System.out.println("Creating the Printer constructor with parameter Printer brand:" +brand+ "," +type+ "," +price+ "," +serialNo+ "," +noOfPages);
	}
	
}