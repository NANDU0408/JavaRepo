class Browser extends StandaloneApplication{
	String[] downloads;
	String[] browsingHistory;
	
	Browser(String name,ApplicationType type){
		super(name,type);
		
	}
	
	void setDownloads(String[] downloads){
		this.downloads=downloads;
		for(int i=0; i<downloads.length;i++){
			String download = downloads[i];
			System.out.println("Downloads are" +downloads[i]+ "in" +i);
		}
	}
	
	void setBrowserHistory(String[] browsingHistory){
		this.browsingHistory=browsingHistory;
		for(int i=0; i<browsingHistory.length; i++){
			String browse=browsingHistory[i];
			System.out.println("browsingHistory are" +browsingHistory[i]+ "at seq" +i);
		}
	}
	
	void displayInfo(){
		settings();
		displayHistory();
	}
	
	void settings(){
		System.out.println("Accessing settings in Browser");
	}
	
	void displayHistory(){
		System.out.println("Accessing displayHistory in Browser");
	}
}