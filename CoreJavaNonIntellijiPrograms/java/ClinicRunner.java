class ClinicRunner{
	public static void main(String[] nnn){
		System.out.println("Starting the main");
		Doctor doctor = new Doctor();
		Clinic clinic = new Clinic("NeuroSurgeon", 25, 20, doctor);
		doctor.name="Ram";
		doctor.experience= 10;
		doctor.fake= false;
		doctor.fees=1500;
		clinic.displayInfo();
		System.out.println("Starting the main");
	}
}