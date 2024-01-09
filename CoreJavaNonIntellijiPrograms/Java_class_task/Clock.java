class Clock{
	String brand;
	String color;
	int price;
	int expiryDate;
	 
	
	Clock(){
		super();
		System.out.println("Clock");
	}
	
	
	Clock(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the Clock constructor with parameter Clock brand:" +brand);
	}
	
	Clock(String brand, String color){
		super();
		this.brand=brand;
		this.color=color;
		System.out.println("Creating the Clock constructor with parameter Clock brand:" +brand);
		System.out.println("Creating the Clock constructor with parameter Clock color:" +color);
	}
	
	Clock(String brand,  String color,  int price){
		super();
		this.brand=brand;
		this.color=color;
		this.price=price;
		System.out.println("Creating the Clock constructor with parameter Clock brand:" +brand);
		System.out.println("Creating the Clock constructor with parameter Clock color:" +color);
		System.out.println("Creating the Clock constructor with parameter Clock price:" +price);
	}
	
	Clock(String brand, String color,  int price, int expiryDate){
		super();
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.expiryDate=expiryDate;
		System.out.println("Creating the Clock constructor with parameter Clock brand:" +brand);
		System.out.println("Creating the Clock constructor with parameter Clock color:" +color);
		System.out.println("Creating the Clock constructor with parameter Clock price:" +price);
		System.out.println("Creating the Clock constructor with parameter Clock expiryDate:"+expiryDate);
	}
	
}