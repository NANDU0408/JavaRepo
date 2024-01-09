class ShowRoom{
	String name;
	int noOfBranches=16;
	int noOfEmployees;
	int minPrice;
	String location= "Chennai";
	int maxPrice;
	int minSale;
	String type;
	
	
	ShowRoom(){
		System.out.println("ShowRoom");
	}
	
	ShowRoom(String name){
		this.name=name;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name, int noOfBranches){
		this.name=name;
		this.noOfBranches=noOfBranches;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name,  int noOfBranches,  int noOfEmployees){
		this.name=name;
		this.noOfBranches=noOfBranches;
		this.noOfEmployees=noOfEmployees;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name, int noOfBranches,  int noOfEmployees, int minPrice){
		this.name=name;
		this.noOfBranches=noOfBranches;
		this.noOfEmployees=noOfEmployees;
		this.minPrice=minPrice;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name, int noOfBranches, int noOfEmployees, int minPrice, String location){
		this.name=name;
		this.noOfBranches=noOfBranches;
		this.noOfEmployees=noOfEmployees;
		this.minPrice=minPrice;
		this.location=location;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name, int noOfBranches,  int noOfEmployees, int minPrice, String location ,int maxPrice ){
		this.name=name;
		this.noOfBranches=noOfBranches;
		this.noOfEmployees=noOfEmployees;
		this.minPrice=minPrice;
		this.location=location;
		this.maxPrice=maxPrice;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
	
	ShowRoom(String name, int noOfBranches,  int noOfEmployees, int minPrice, String location ,int maxPrice,int minSale ){
		this.name=name;
		this.noOfBranches=noOfBranches;
		this.noOfEmployees=noOfEmployees;
		this.minPrice=minPrice;
		this.location=location;
		this.maxPrice=maxPrice;
		this.minSale=minSale;
		System.out.println("Creating the ShowRoom constructor with parameter showroom name:" +name);
	}
}


 

