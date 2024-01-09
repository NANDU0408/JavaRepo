class MatchBoxM{
	String brand;
	int noOfSticks=56;
	int lengthInCm;
	int price;
	String size= "Medium";
	int weightInGms;
	String type;
	
	
	MatchBoxM(){
		System.out.println("MatchBox");
	}
	
	MatchBoxM(String brand){
		this.brand=brand;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBoxM(String brand, int noOfSticks){
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBoxM(String brand,  int noOfSticks,  int lengthInCm){
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.lengthInCm=lengthInCm;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBoxM(String brand, int noOfSticks,  int lengthInCm, int price){
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.lengthInCm=lengthInCm;
		this.price=price;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBoxM(String brand, int noOfSticks, int lengthInCm, int price, String size){
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.lengthInCm=lengthInCm;
		this.price=price;
		this.size=size;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
	
	MatchBoxM(String brand, int noOfSticks,  int lengthInCm, int price, String size ,int weightInGms ){
		this.brand=brand;
		this.noOfSticks=noOfSticks;
		this.lengthInCm=lengthInCm;
		this.price=price;
		this.size=size;
		this.weightInGms=weightInGms;
		System.out.println("Creating the MatchBox constructor with parameter brand:" +brand);
	}
}


 

