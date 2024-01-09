class Clinic{
	String specialization;
	int totalBeds;
	int totalPatients;
	Doctor doctor;
	
	Clinic(String specialization, int totalBeds, int totalPatients, Doctor doctor){
		this.specialization=specialization;
		this.totalBeds=totalBeds;
		this.totalPatients=totalPatients;
		this.doctor=doctor;
	}
	
	void displayInfo(){
		System.out.println("Clinic specialization:"+this.specialization);
		System.out.println("Clinic totalBeds:"+this.totalBeds);
		System.out.println("Clinic totalPatients:"+this.totalPatients);
		System.out.println("Clinic doctor:"+this.doctor);
		if(this.doctor!=null){
			System.out.println("Doctor name:"+this.doctor.name);
			System.out.println("Doctor experience:"+this.doctor.experience);
			System.out.println("Doctor fake:"+this.doctor.fake);
			System.out.println("Doctor fees:"+this.doctor.fees);
		}
	}
}