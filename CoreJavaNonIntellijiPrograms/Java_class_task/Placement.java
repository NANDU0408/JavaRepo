class Placement{
	String companyName;
	String jobRole;
	int internshipDurationInMonth;
	int noOfProjectsCovering;
	int noOfWorkingHours;
	int offeredPakage;
	String certified;
	String technologyUsed;
	String Location;
	int intershipStyfund;
	int noOfEmployeesAccepted;
	String experienceNeeded;
	
	
	Placement(){
		System.out.println(" ");
		System.out.println("Placement");	
		this.companyName="Oracle";
		this.jobRole="Software Developer";
		this.internshipDurationInMonth=8;
		this.noOfProjectsCovering=4;
		this.noOfWorkingHours=8;
		this.offeredPakage=1000000;
		this.certified="Yes";
		this.technologyUsed="MongoDB";
		this.Location="Bangalore";
		this.intershipStyfund=25000;
		this.noOfEmployeesAccepted=10;
		this.experienceNeeded="No";
	}
	
	Placement(String companyName){
		super();
		this.companyName=companyName;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName);
	}
	
	Placement(String companyName, String jobRole){
		this(companyName);
		this.jobRole=jobRole;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth){
		this(companyName,jobRole);
		this.internshipDurationInMonth=internshipDurationInMonth;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering){
		this(companyName,jobRole,internshipDurationInMonth);
		this.noOfProjectsCovering=noOfProjectsCovering;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering);
		this.noOfWorkingHours=noOfWorkingHours;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours);
		this.offeredPakage=offeredPakage;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage);
		this.certified=certified;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified, String technologyUsed){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage,certified);
		this.technologyUsed=technologyUsed;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified+ "," +technologyUsed);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified, String technologyUsed, String Location){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage,certified,technologyUsed);
		this.Location=Location;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified+ "," +technologyUsed+ "," +Location);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified, String technologyUsed, String Location, int intershipStyfund){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage,certified,technologyUsed,Location);
		this.intershipStyfund=intershipStyfund;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified+ "," +technologyUsed+ "," +Location+ "," +intershipStyfund);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified, String technologyUsed, String Location, int intershipStyfund, int noOfEmployeesAccepted){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage,certified,technologyUsed,Location,intershipStyfund);
		this.noOfEmployeesAccepted=noOfEmployeesAccepted;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified+ "," +technologyUsed+ "," +Location+ "," +intershipStyfund+ "," +noOfEmployeesAccepted);
	}
	
	Placement(String companyName,  String jobRole,  int internshipDurationInMonth, int noOfProjectsCovering, int noOfWorkingHours, int offeredPakage, String certified, String technologyUsed, String Location, int intershipStyfund, int noOfEmployeesAccepted, String experienceNeeded){
		this(companyName,jobRole,internshipDurationInMonth,noOfProjectsCovering,noOfWorkingHours,offeredPakage,certified,technologyUsed,Location,intershipStyfund,noOfEmployeesAccepted);
		this.experienceNeeded=experienceNeeded;
		System.out.println("Creating the Placement constructor with parameter Placement name:" +companyName+ "," +jobRole+ "," +internshipDurationInMonth+ "," +noOfProjectsCovering+ "," +noOfWorkingHours+ "," +offeredPakage+ "," +certified+ "," +technologyUsed+ "," +Location+ "," +intershipStyfund+ "," +noOfEmployeesAccepted+ "," +experienceNeeded);
	}
	
	
	void displayInfo(){
		System.out.println("Placement companyName:"+this.companyName);
		System.out.println("Placement jobRole:"+this.jobRole);
		System.out.println("Placement internshipDurationInMonth:"+this.internshipDurationInMonth);
		System.out.println("Placement noOfProjectsCovering:"+this.noOfProjectsCovering);
		System.out.println("Placement noOfWorkingHours:"+this.noOfWorkingHours);
		System.out.println("Placement offeredPakage:"+this.offeredPakage);
		System.out.println("Placement certified:"+this.certified);
		System.out.println("Placement technologyUsed:"+this.technologyUsed);
		System.out.println("Placement Location:"+this.Location);
		System.out.println("Placement intershipStyfund:"+this.intershipStyfund);
		System.out.println("Placement noOfEmployeesAccepted:"+this.noOfEmployeesAccepted);
		System.out.println("Placement experienceNeeded:"+this.experienceNeeded);
	}	
}