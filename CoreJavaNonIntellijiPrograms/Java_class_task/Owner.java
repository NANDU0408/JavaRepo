class Owner{
	
	String name;
	String email;
	Address permanantAddress;
	Address temporaryAddress;
	
	Owner(){
		System.out.println("Owner Created ");
	}
	
	void setPermanantAddress(Address permanantAddress){
		
		this.permanantAddress=permanantAddress;
	}
	
	void setTemporaryAddress(Address temporaryAddress){
		this.temporaryAddress=temporaryAddress;
	}
	
	void displayInfo(){
		
		System.out.println("Starting info in Owner");
		System.out.println("Owner name is "+this.name);
		System.out.println("Owner email is "+this.email);
		System.out.println("Owner name is "+this.permanantAddress);
		if(permanantAddress!=null){

			permanantAddress.displayInfo();
		}
		System.out.println("Owner name is "+this.temporaryAddress);
		if(temporaryAddress!=null){

			temporaryAddress.displayInfo();
		}
		System.out.println("Starting info in Owner");
	}
}