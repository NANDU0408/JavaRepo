class Free{
	String what;
	String why;
	String freeForAllOrNot;
	
	 
	
	Free(){
		System.out.println(" ");
		System.out.println("Free");
		this.what="Bluetooth";
		this.why="MaxBill";
		this.freeForAllOrNot="Yes";
	}
	
	Free(String what){
		super();
		this.what=what;
		System.out.println("Creating the Free constructor with parameter Free what:" +what);
	}
	
	Free(String what, String why){
		this(what);
		this.why=why;
		System.out.println("Creating the Free constructor with parameter Free what:" +what+ "," +why);
	}
	
	Free(String what,  String why,  String freeForAllOrNot){
		this(what,why);
		this.freeForAllOrNot=freeForAllOrNot;
		System.out.println("Creating the Free constructor with parameter Free what:" +what+ "," +why+ "," +freeForAllOrNot);
	}
	
	void displayInfo(){
		System.out.println("free what:"+this.what);
		System.out.println("free why:"+this.why);
		System.out.println("free freeForAllOrNot:"+this.freeForAllOrNot);
	}	
}