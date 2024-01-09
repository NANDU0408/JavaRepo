class THCCRunner{
	public static void main(String[] nnn){
		System.out.println("Starting the main");
		
		Speaker speaker= new Speaker(100);
		TV tv= new TV(speaker);
		tv.displayInfo();
		
		System.out.println("Ending the main");
	}
}