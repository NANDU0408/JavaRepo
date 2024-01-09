class Hardware{
	
	String name;
	String type;
	Brand brand;
	
	Hardware(){
		
		System.out.println("Hardware Created");
	}
	
	void setBrand(Brand brand){
		
		this.brand=brand;
	}
	
	void setName(String name){
		this.name=name;
	}
	
	void setType(String type){
		this.type=type;
	}
	
	void displayInfo(){
		
		System.out.println("Starting info in Hardware");
		System.out.println("Hardware name is "+this.name);
		System.out.println("Hardware name is "+this.type);
		System.out.println("Hardware name is "+this.brand);
		if(this.brand!=null){
			brand.displayInfo();
		}
		
		System.out.println("Ending info in Hardware");
	}
}