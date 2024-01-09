class Branch{
	String branchName;
	String location;
	int interestInPercentage;
	
	Branch(String branchName, String location, int interestInPercentage){
		this.branchName=branchName;
		this.location=location;
		this.interestInPercentage=interestInPercentage;
		
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in Branch");
		System.out.println("Branch branchName:"+this.branchName);
		System.out.println("Branch location:"+this.location);
		System.out.println("Branch interestInPercentage:"+this.interestInPercentage);
		System.out.println("Branch info in Branch");
	}
}