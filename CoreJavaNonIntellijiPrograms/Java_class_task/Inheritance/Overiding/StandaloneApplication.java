class StandaloneApplication extends Application{
	double size;
	String compatabileWith;
	OS os;
	
	StandaloneApplication(String name,ApplicationType type){
		
		super(name,type);
		
	}
	
	void displayInfo1(double size, String compatabileWith, OS os){
		this.size=size;
		this.compatabileWith=compatabileWith;
		this.os=os;
		System.out.println("StandaloneApplication size:"+this.size);
		System.out.println("StandaloneApplication compatabileWith:"+this.compatabileWith);
		System.out.println("StandaloneApplication os:"+this.os);
		consumerMemory();
		consumerInternet();
	}
	
	void consumerMemory(){
		System.out.println("Accessing consumerMemory in StandaloneApplication");
	}
	
	void consumerInternet(){
		System.out.println("Accessing consumerInternetin StandaloneApplication");
	}
}