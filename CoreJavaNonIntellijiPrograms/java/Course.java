class Course{
	String courseName;
	String trainerName;
	int courseDurationInMonth;
	int noOfConceptsCovering;
	int noOfAssignments;
	int price;
	String certified;
	
	
	Course(){
		System.out.println(" ");
		System.out.println("Course");	
		this.courseName="JAVA";
		this.trainerName="Amit";
		this.courseDurationInMonth=4;
		this.noOfConceptsCovering=24;
		this.noOfAssignments=15;
		this.price=2000;
		this.certified="Yes";
	}
	
	Course(String courseName){
		super();
		this.courseName=courseName;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName);
	}
	
	Course(String courseName, String trainerName){
		this(courseName);
		this.trainerName=trainerName;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName);
	}
	
	Course(String courseName,  String trainerName,  int courseDurationInMonth){
		this(courseName,trainerName);
		this.courseDurationInMonth=courseDurationInMonth;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName+ "," +courseDurationInMonth);
	}
	
	Course(String courseName,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering){
		this(courseName,trainerName,courseDurationInMonth);
		this.noOfConceptsCovering=noOfConceptsCovering;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering);
	}
	
	Course(String courseName,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments){
		this(courseName,trainerName,courseDurationInMonth,noOfConceptsCovering);
		this.noOfAssignments=noOfAssignments;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments);
	}
	
	Course(String courseName,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price){
		this(courseName,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments);
		this.price=price;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price);
	}
	
	Course(String courseName,  String trainerName,  int courseDurationInMonth, int noOfConceptsCovering, int noOfAssignments, int price, String certified){
		this(courseName,trainerName,courseDurationInMonth,noOfConceptsCovering,noOfAssignments,price);
		this.certified=certified;
		System.out.println("Creating the Course constructor with parameter Course name:" +courseName+ "," +trainerName+ "," +courseDurationInMonth+ "," +noOfConceptsCovering+ "," +noOfAssignments+ "," +price+ "," +certified);
	}

	
	void displayInfo(){
		System.out.println("Course courseName:"+this.courseName);
		System.out.println("Course trainerName:"+this.trainerName);
		System.out.println("Course courseDurationInMonth:"+this.courseDurationInMonth);
		System.out.println("Course noOfConceptsCovering:"+this.noOfConceptsCovering);
		System.out.println("Course noOfAssignments:"+this.noOfAssignments);
		System.out.println("Course price:"+this.price);
		System.out.println("Course certified:"+this.certified);
	}	
}