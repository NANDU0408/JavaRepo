class EdgeBrowser extends Browser{
	
	EdgeBrowser(String name,ApplicationType type){
		super(name,type);
	}
	
	void overrideEdge(){
		settings();
		displayHistory();
		consumerMemory();
		consumerInternet();
		run();
		stop();
		execute();
		collectInfo();
		displayInfo();
	}
	@Override
	void settings(){
		
		System.out.println("Accessing settings in EdgeBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Accessing displayHistory in EdgeBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Accessing consumerMemory in EdgeBrowser");
	}
	
	@Override
	void consumerInternet(){
		System.out.println("Accessing consumeInternet in EdgeBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Accessing run in EdgeBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Accessing stop in EdgeBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Accessing execute in EdgeBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Accessing collectInfo in EdgeBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Accessing displayInfo in EdgeBrowser");
	}

}