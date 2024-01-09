class FireFoxBrowser extends Browser{
	
	FireFoxBrowser(String name,ApplicationType type){
		super(name,type);
		overrideFox();
	}
	
	void overrideFox(){
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
		
		System.out.println("Accessing settings in FireFoxBrowser");
	}
	
	@Override
	void displayHistory(){
		
		System.out.println("Accessing displayHistory in FireFoxBrowser");
	}
	
	@Override
	void consumerMemory(){
		
		System.out.println("Accessing consumerMemory in FireFoxBrowser");
	}
	
	@Override
	void consumerInternet(){
		System.out.println("Accessing consumeInternet in FireFoxBrowser");
		
	}
	
	@Override
	void run(){
		
		System.out.println("Accessing run in FireFoxBrowser");
	}
	
	@Override
	void stop(){
		
		System.out.println("Accessing stop in FireFoxBrowser");
	}
	
	@Override
	void execute(){
		
		System.out.println("Accessing execute in FireFoxBrowser");
	}
	
	@Override
	void collectInfo(){
		
		System.out.println("Accessing collectInfo in FireFoxBrowser");
	}
	
	@Override
	void displayInfo(){
		
		System.out.println("Accessing displayInfo in FireFoxBrowser");
	}
}