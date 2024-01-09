class Month{
	String name;
	int noOfDays;
	int noOfWeekEnds;
	int noOfHolidays;
	
	 
	
	Month(){
		
		System.out.println("Month");	
		this.name="August";
		this.noOfDays=31;
		this.noOfWeekEnds=4;
		this.noOfHolidays=2;
	}
	
	Month(String name){
		super();
		this.name=name;
		System.out.println("Creating the Month constructor with parameter Month name:" +name);
	}
	
	Month(String name, int noOfDays){
		this(name);
		this.noOfDays=noOfDays;
		System.out.println("Creating the Month constructor with parameter Month name:" +name+ "," +noOfDays);
	}
	
	Month(String name,  int noOfDays,  int noOfWeekEnds){
		this(name,noOfDays);
		this.noOfWeekEnds=noOfWeekEnds;
		System.out.println("Creating the Month constructor with parameter Month name:" +name+ "," +noOfDays+ "," +noOfWeekEnds);
	}
	
	Month(String name,  int noOfDays,  int noOfWeekEnds, int noOfHolidays){
		this(name,noOfDays,noOfWeekEnds);
		this.noOfHolidays=noOfHolidays;
		System.out.println("Creating the Month constructor with parameter Month name:" +name+ "," +noOfDays+ "," +noOfWeekEnds+ "," +noOfHolidays);
	}
	
	void displayInfo(){
		System.out.println("month name:"+this.name);
		System.out.println("month noOfDays:"+this.noOfDays);
		System.out.println("month noOfWeekEnds:"+this.noOfWeekEnds);
		System.out.println("month noOfHolidays:"+this.noOfHolidays);
	}	
}