class Application{
	double id;
	String name;
	ApplicationType type;
	double version;
	String developer;
	String date;
	
	Application(String name, ApplicationType type){
		this.name=name;
		this.type=type;
	}
	
		void displayInfo(double id, double version, String developer, String date){
		this.id=id;
		this.version=version;
		this.developer=developer;
		this.date=date;
		System.out.println("Sarting displayInfo in Application");
		System.out.println("Application id:"+this.id);
		System.out.println("Application version:"+this.version);
		System.out.println("Application developer:"+this.developer);
		System.out.println("Application date:"+this.date);
		run();
		stop();
		execute();
		collectInfo();
		
		System.out.println("Ending displayInfo in Application");
	}
	
	void run(){
		System.out.println("Accessing run function in Application");
	}
	
	void stop(){
		System.out.println("Accessing stop function in Application");
	}
	
	void execute(){
		System.out.println("Accessing execute function in Application");
	}
	
	void collectInfo(){
		System.out.println("Accessing collectInfo function in Application");
	}
}