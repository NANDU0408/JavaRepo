class WebApplication extends Application{
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication(String name,ApplicationType type){
		super(name,type);
	}
	
	void displayInfo(String[] supportedBrowsers){
		this.supportedBrowsers=supportedBrowsers;
		
		System.out.println("Browsers list");
		for(int i=0;i<this.supportedBrowsers.length;i++){
			String browser= this.supportedBrowsers[i];
			System.out.println("SupportedBrowsers:"+browser);
		}
	}
	void freeSelect(boolean free){
		this.free=free;
		System.out.println("free browser:"+this.free);
		
		connectInternet();
		sendUsage();
	}
	
	void connectInternet(){
		System.out.println("Accessing connectInternet in WebApplication");
	}
	
	void sendUsage(){
		System.out.println("Accessing sendUsage WebApplication");
	}
}