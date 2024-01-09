class Accounts{
	String type;
	int minBalance;
	int interestInPercentage;
	
	Accounts(String type, int minBalance, int interestInPercentage){
		this.type=type;
		this.minBalance=minBalance;
		this.interestInPercentage=interestInPercentage;
		
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in Accounts");
		System.out.println("Accounts type:"+this.type);
		System.out.println("Accounts minBalance:"+this.minBalance);
		System.out.println("Accounts interestInPercentage:"+this.interestInPercentage);
		System.out.println("Ending info in Accounts");
	}
}