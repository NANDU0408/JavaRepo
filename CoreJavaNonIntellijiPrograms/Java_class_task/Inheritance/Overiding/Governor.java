class Governor extends StateGovernment{
	
	String governorName;
	double budget;
	
	Governor(String governorName, double budget, String stateName, String chiefSecratraitName, double noOfDepts, Districts district, double noOfStateAssemblies, String stateAssemblyName, double noOfElectedMLA, String chiefMinisterName, String chiefJusticeName, String stateParlimentLocation){
		super(stateName,chiefSecratraitName,noOfDepts,district,noOfStateAssemblies,stateAssemblyName,noOfElectedMLA,chiefMinisterName,chiefJusticeName,stateParlimentLocation);
		this.governorName=governorName;
		this.budget=budget;
	}
	
	void governorRule(){
		System.out.println("Governor rule is applied in pathetic situations");
	}
	
	void governorPower(){
		System.out.println("Governor has the power to dissolve state legislative assembly");
	}
	
	void governorPosition(){
		System.out.println("Governor is the chairPerson in state legislative council");
	}
	
	void governorNomination(){
		System.out.println("Governor is appointed by President of the Country");
	}
	
	@Override
	void assembly(){
		System.out.println("Governor addresses the assembly");
	} 
	
	@Override
	void vote(){
		System.out.println("Governor is not elected by voting");
	} 
	
	@Override
	void passBill(){
		System.out.println("Governor gives perssion to ammend the bill and signs to pass it");
	} 
	
	@Override
	void budget(){
		System.out.println("Governor passes the budget by signing");
	} 
}