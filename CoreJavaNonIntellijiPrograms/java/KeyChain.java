class KeyChain{
	int durabilityOfMetalInYears;
	String type;
	int price;
	String quality;
	String color;
	 
	
	KeyChain(){
		this(12,"Leather",300,"Good","Brown");
		System.out.println("KeyChain");
	}
	
	
	KeyChain(int durabilityOfMetalInYears){
		super();
		this.durabilityOfMetalInYears=durabilityOfMetalInYears;
		System.out.println("Creating the KeyChain constructor with parameter KeyChain brand:" +durabilityOfMetalInYears);
	}
	
	KeyChain(int durabilityOfMetalInYears, String type){
		this(durabilityOfMetalInYears);
		this.type=type;
		System.out.println("Creating the KeyChain constructor with parameter KeyChain brand:" +durabilityOfMetalInYears+ "," +type);
	}
	
	KeyChain(int durabilityOfMetalInYears,  String type,  int price){
		this(durabilityOfMetalInYears,type);
		this.price=price;
		System.out.println("Creating the KeyChain constructor with parameter KeyChain brand:" +durabilityOfMetalInYears+ "," +type+ "," +price);
	}
	
	KeyChain(int durabilityOfMetalInYears, String type,  int price, String quality){
		this(durabilityOfMetalInYears,type,price);
		this.quality=quality;
		System.out.println("Creating the KeyChain constructor with parameter KeyChain brand:" +durabilityOfMetalInYears+ "," +type+ "," +price+ "," +quality);
	}
		
	KeyChain(int durabilityOfMetalInYears, String type,  int price, String quality, String color){
		this(durabilityOfMetalInYears,type,price,quality);
		this.color=color;
		System.out.println("Creating the Printer constructor with parameter KeyChain brand:" +durabilityOfMetalInYears+ "," +type+ "," +price+ "," +quality+ "," +color);
	}
	
}