class Agent{
	int id=1701;
	String name="Vivek";
	String company="Infosys";
	Tent tent;
	
	void openTent(Tent tent){
		this.tent=tent;
		System.out.println("Starting of openTent in Agent");
		System.out.println("Tent slNo:"+tent.slNo);
		System.out.println("Tent width:"+tent.width);
		System.out.println("Tent height:"+tent.height);
		tent.open();
		System.out.println("Ending of openTent in Agent");
	}
	
	void closeTent(Tent tent){
		this.tent=tent;
		System.out.println("Starting of closeTent in Agent");
		System.out.println("Tent slNo:"+tent.slNo);
		System.out.println("Tent width:"+tent.width);
		System.out.println("Tent height:"+tent.height);
		tent.close();
		System.out.println("Ending of closeTent in Agent");
	}
	
	void displayInfo(){
		System.out.println("Starting of info in Agent");
		openTent(tent);
		closeTent(tent);
		System.out.println("Agent id:"+id);
		System.out.println("Agent name:"+name);
		System.out.println("Agent company:"+company);
		System.out.println("Starting of info in Agent");
	}
}