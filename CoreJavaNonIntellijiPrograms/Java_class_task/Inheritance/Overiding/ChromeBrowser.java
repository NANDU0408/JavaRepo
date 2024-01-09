class ChromeBrowser extends Browser{
	
	ChromeBrowser(String name,ApplicationType type){
		super(name,type);
	}
	
	void override(){
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
		
		System.out.println("Accessing settings in ChromeBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Accessing displayHistory in ChromeBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Accessing consumerMemory in ChromeBrowser");
	}
	
	@Override
	void consumerInternet(){
		System.out.println("Accessing consumeInternet in ChromeBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Accessing run in ChromeBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Accessing stop in ChromeBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Accessing execute in ChromeBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Accessing collectInfo in ChromeBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Accessing displayInfo in ChromeBrowser");
	}
}