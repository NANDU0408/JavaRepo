class MakeupKit{
	String brand;
	String ingredients;
	int price;
	int expiryDate;
	 
	
	MakeupKit(){
		super();
		System.out.println("MakeupKit");
	}
	
	
	MakeupKit(String brand){
		super();
		this.brand=brand;
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit brand:" +brand);
	}
	
	MakeupKit(String brand, String ingredients){
		super();
		this.brand=brand;
		this.ingredients=ingredients;
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit brand:" +brand);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit ingredients:" +ingredients);
	}
	
	MakeupKit(String brand,  String ingredients,  int price){
		super();
		this.brand=brand;
		this.ingredients=ingredients;
		this.price=price;
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit brand:" +brand);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit ingredients:" +ingredients);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit price:" +price);
	}
	
	MakeupKit(String brand, String color,  int price, int expiryDate){
		super();
		this.brand=brand;
		this.ingredients=ingredients;
		this.price=price;
		this.expiryDate=expiryDate;
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit brand:" +brand);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit ingredients:" +ingredients);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit price:" +price);
		System.out.println("Creating the MakeupKit constructor with parameter MakeupKit expiryDate:"+expiryDate);
	}
	
}