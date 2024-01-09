class Company{
	String companyName;
	String gstNo;
	String companyLocation;
	Job job;
	
	Company(String companyName, String gstNo, String companyLocation, Job job){
		this.companyName=companyName;
		this.gstNo=gstNo;
		this.companyLocation=companyLocation;
		this.job=job;
	}
	
	void displayInfo(){
		System.out.println("Company companyName:"+this.companyName);
		System.out.println("Hotel gstNo:"+this.gstNo);
		System.out.println("Hotel companyLocation:"+this.companyLocation);
		System.out.println("Hotel Job:"+this.job);
		if(this.job!=null){
				System.out.println("Hotel role:"+this.job.role);
				System.out.println("Hotel salary:"+this.job.salary);
				System.out.println("Hotel type:"+this.job.type);
		}
	}
}