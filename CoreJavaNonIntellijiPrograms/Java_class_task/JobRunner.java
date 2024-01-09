class JobRunner{
	public static void main(String[] nnn){
		System.out.println("Starting the main");
		Job job = new Job();
		Company company =new Company("Accenture", "ACC123EN456", "Bangalore", job);
		company.displayInfo();
		System.out.println("Starting the main");
	}
}