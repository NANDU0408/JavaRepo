class StateGovernment{
	
	String stateName;
	String chiefSecratraitName;
	double noOfDepts;
	Districts district;
	double noOfStateAssemblies;
	String stateAssemblyName;
	double noOfElectedMLA;
	String chiefMinisterName;
	String chiefJusticeName;
	String stateParlimentLocation;
	
	StateGovernment(String stateName,String chiefSecratraitName,double noOfDepts,Districts district, double noOfStateAssemblies, String stateAssemblyName, double noOfElectedMLA, String chiefMinisterName, String chiefJusticeName, String stateParlimentLocation){
		this.stateName=stateName;
		this.chiefSecratraitName=chiefSecratraitName;
		this.noOfDepts=noOfDepts;
		this.district=district;
		this.noOfStateAssemblies=noOfStateAssemblies;
		this.stateAssemblyName=stateAssemblyName;
		this.noOfElectedMLA=noOfElectedMLA;
		this.chiefMinisterName=chiefMinisterName;
		this.chiefJusticeName=chiefJusticeName;
		this.stateParlimentLocation=stateParlimentLocation;
	}
	
	
	
	void assembly(){
		System.out.println("State winter assembly has started");
	}
	
	void election(){
		System.out.println("Election is conducted after dissolving or completing the term");
	}
	
	void holidays(){
		System.out.println("Holidays are decided by the state secretrait council");
	}
	
	void byElection(){
		System.out.println("ByElection is conducted whenever there is a vacated position of MLA");
	}
	
	void nominateMLC(){
		System.out.println("MLC is nominated by Governor of the State");
	}
	
	void dissolveGovt(){
		System.out.println("Governor can dissolve the govt");
	}
	
	void vote(){
		System.out.println("People of the state vote to elect the MLA's");
	}
	
	void terminate(){
		System.out.println("CM has the power to terminate any GOVT employee");
	}
	
	void transfer(){
		System.out.println("StateGovt has the power to transfer any govt employee");
	}
	
	void passBill(){
		System.out.println("StateGovt will pass the bill for state development");
	}
	
	void budget(){
		System.out.println("StateGovt will make the budget for the year");
	}
}