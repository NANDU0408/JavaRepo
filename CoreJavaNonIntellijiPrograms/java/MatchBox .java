class MatchBox{
	String brand;
	int noOfSticks=56;
	int lengthInCm;
	int price;
	String size= "Medium";
	int weightInGms;
	String type;
	
	
	MatchBox(){
		System.out.println("MatchBox");
	}
	
	MatchBox(String brand){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBox(String brand, int noOfSticks){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBox(String brand,  int noOfSticks,  int lengthInCm){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBox(String brand, int noOfSticks,  int lengthInCm, int price){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBox(String brand, int noOfSticks, int lengthInCm, int price, String size){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBox(String brand, int noOfSticks,  int lengthInCm, int price, String size ,int weightInGms ){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
}


 

