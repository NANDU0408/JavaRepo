class Helmet{
	String brand;
	String type;
	int price;
	String quality;
	String size;
	 
	
	Helmet(){
		super();
		System.out.println("Helmet");
	}
	
	
	Helmet(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Helmet constructor with parameter Helmet brand:" +brand);
	}
	
	Helmet(String brand, String type){
		super();
		this.brand=brand;
		this.type=type;
		System.out.println("Creating the Helmet constructor with parameter Helmet brand:" +brand+ "," +type);
	}
	
	Helmet(String brand,  String type,  int price){
		this(brand,type);
		this.price=price;
		System.out.println("Creating the Helmet constructor with parameter Helmet brand:" +brand+ "," +type+ "," +price);
	}
	
	Helmet(String brand, String type,  int price, String quality){
		this(brand,type,price);
		this.quality=quality;
		System.out.println("Creating the Helmet constructor with parameter Helmet brand:" +brand+ "," +type+ "," +price+ "," +quality);
	}
		
	Helmet(String brand, String type,  int price, String quality, String size){
		this(brand,type,price,quality);
		this.size=size;
		System.out.println("Creating the Helmet constructor with parameter Helmet brand:" +brand+ "," +type+ "," +price+ "," +quality+ "," +size);
	}
	
}