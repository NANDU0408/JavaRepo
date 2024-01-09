class Technology{
	String name;
	String trainerName;
	int courseDurationInMonth;
	int noOfConceptsCovering;
	int noOfAssignments;
	int price;
	String certified;
	String technologyUsed;
	String companyAccepted;
	int salaryOfferedPerYear;
	int noOfEmployeesAccepted;
	String experienceNeeded;
	
	
	Technology(){
		System.out.println(" ");
		System.out.println("Technology");	
		this.name="Angular_js";
		this.trainerName="Amit";
		this.courseDurationInMonth=4;
		this.noOfConceptsCovering=24;
		this.noOfAssignments=15;
		this.price=2000;
		this.certified="Yes";
		this.technologyUsed="Oracle";
		this.companyAccepted="Yes";
		this.salaryOfferedPerYear=1050000;
		this.noOfEmployeesAccepted=10;
		this.experienceNeeded="No";
	}
	
	Technology(String name){
		super();
		this.name=name;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name);
	}
	
	Technology(String name, String trainerName){
		this(name);
		this.trainerName=trainerName;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth){
		this(name,trainerName);
		this.courseDurationInMonth=courseDurationInMonth;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering){
		this(name,trainerName,courseDurationInMonth);
		this.noOfConceptsCovering=noOfConceptsCovering;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering);
		this.noOfAssignments=noOfAssignments;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments);
		this.price=price;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price);
		this.certified=certified;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified, String technologyUsed){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price,certified);
		this.technologyUsed=technologyUsed;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified+ "," +technologyUsed);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified, String technologyUsed, String companyAccepted){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price,certified,technologyUsed);
		this.companyAccepted=companyAccepted;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified+ "," +technologyUsed+ "," +companyAccepted);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified, String technologyUsed, String companyAccepted, int salaryOfferedPerYear){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price,certified,technologyUsed,companyAccepted);
		this.salaryOfferedPerYear=salaryOfferedPerYear;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified+ "," +technologyUsed+ "," +companyAccepted+ "," +salaryOfferedPerYear);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified, String technologyUsed, String companyAccepted, int salaryOfferedPerYear, int noOfEmployeesAccepted){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price,certified,technologyUsed,companyAccepted,salaryOfferedPerYear);
		this.noOfEmployeesAccepted=noOfEmployeesAccepted;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified+ "," +technologyUsed+ "," +companyAccepted+ "," +salaryOfferedPerYear+ "," +noOfEmployeesAccepted);
	}
	
	Technology(String name,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified, String technologyUsed, String companyAccepted, int salaryOfferedPerYear, int noOfEmployeesAccepted, String experienceNeeded){
		this(name,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price,certified,technologyUsed,companyAccepted,salaryOfferedPerYear,noOfEmployeesAccepted);
		this.experienceNeeded=experienceNeeded;
		System.out.println("Creating the Technology constructor with parameter Technology name:" +name+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified+ "," +technologyUsed+ "," +companyAccepted+ "," +salaryOfferedPerYear+ "," +noOfEmployeesAccepted+ "," +experienceNeeded);
	}
	
	
	void displayInfo(){
		System.out.println("Technology name:"+this.name);
		System.out.println("Technology trainerName:"+this.trainerName);
		System.out.println("Technology courseDurationInMonth:"+this.courseDurationInMonth);
		System.out.println("Technology noOfConceptsCovering:"+this.noOfConceptsCovering);
		System.out.println("Technology noOfAssignments:"+this.noOfAssignments);
		System.out.println("Technology price:"+this.price);
		System.out.println("Technology certified:"+this.certified);
		System.out.println("Technology technologyUsed:"+this.technologyUsed);
		System.out.println("Technology companyAccepted:"+this.companyAccepted);
		System.out.println("Technology salaryOfferedPerYear:"+this.salaryOfferedPerYear);
		System.out.println("Technology noOfEmployeesAccepted:"+this.noOfEmployeesAccepted);
		System.out.println("Technology experienceNeeded:"+this.experienceNeeded);
	}	
}