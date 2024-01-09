class Wallet{
	String brand;
	String color;
	int price;
	String type;
	 
	
	Wallet(){
		super();
		System.out.println("Wallet");
	}
	
	
	Wallet(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Wallet constructor with parameter Wallet brand:" +brand);
	}
	
	Wallet(String brand, String color){
		super();
		this.brand=brand;
		this.color=color;
		System.out.println("Creating the Wallet constructor with parameter Wallet brand:" +brand);
		System.out.println("Creating the Wallet constructor with parameter Wallet color:" +color);
	}
	
	Wallet(String brand,  String color,  int price){
		super();
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("Creating the Wallet constructor with parameter Wallet brand:" +brand);
		System.out.println("Creating the Wallet constructor with parameter Wallet color:" +color);
		System.out.println("Creating the Wallet constructor with parameter Wallet price:" +price);
	}
	
	Wallet(String brand, String color,  int price, String type){
		super();
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		System.out.println("Creating the Wallet constructor with parameter Wallet brand:" +brand);
		System.out.println("Creating the Wallet constructor with parameter Wallet color:" +color);
		System.out.println("Creating the Wallet constructor with parameter Wallet price:" +price);
		System.out.println("Creating the Wallet constructor with parameter Wallet type:"+type);
	}
	
}