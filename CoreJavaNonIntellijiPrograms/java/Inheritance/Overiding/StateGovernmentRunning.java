class StateGovernmentRunning{
	public static void main(String... nnn){
		
		System.out.println("Starting main in StateGovernmentRunning");
		Governor governor = new Governor("Thawar Chand Gehlot",50000000,"Karnataka","Vandita Sharma",128,Districts.BANGALORE,2,"Vidhana Soudha",224,"Siddaramaiah","Prasanna B. Varale","Bangalore");
		governor.assembly();
		governor.election();
		governor.holidays();
		governor.byElection();
		governor.nominateMLC();
		governor.dissolveGovt();
		governor.vote();
		governor.terminate();
		governor.transfer();
		governor.passBill();
		governor.budget();
		governor.governorRule();
		governor.governorPower();
		governor.governorPosition();
		governor.governorNomination();
		System.out.println("stateName:"+governor.stateName);
		System.out.println("chiefSecratraitName:"+governor.chiefSecratraitName);
		System.out.println("noOfDepts:"+governor.noOfDepts);
		System.out.println("districts:"+governor.district);
		System.out.println("noOfStateAssemblies:"+governor.noOfStateAssemblies);
		System.out.println("stateAssemblyName:"+governor.stateAssemblyName);
		System.out.println("noOfElectedMLA:"+governor.noOfElectedMLA);
		System.out.println("chiefMinisterName:"+governor.chiefMinisterName);
		System.out.println("chiefJusticeName:"+governor.chiefJusticeName);
		System.out.println("stateParlimentLocation:"+governor.stateParlimentLocation);
		System.out.println("governorName:"+governor.governorName);
		System.out.println("budget:"+governor.budget);
		
		StateGovernment stateGovernment = new StateGovernment("Karnataka","Vandita Sharma",128,Districts.BANGALORE,2,"Vidhana Soudha",224,"Siddaramaiah","Prasanna B. Varale","Bangalore");
		stateGovernment.assembly();
		stateGovernment.election();
		stateGovernment.holidays();
		stateGovernment.byElection();
		stateGovernment.nominateMLC();
		stateGovernment.dissolveGovt();
		stateGovernment.vote();
		stateGovernment.terminate();
		stateGovernment.transfer();
		stateGovernment.passBill();
		stateGovernment.budget();
	    System.out.println("stateName:"+stateGovernment.stateName);
		System.out.println("chiefSecratraitName:"+stateGovernment.chiefSecratraitName);
		System.out.println("noOfDepts:"+stateGovernment.noOfDepts);
		System.out.println("districts:"+stateGovernment.district);
		System.out.println("noOfStateAssemblies:"+stateGovernment.noOfStateAssemblies);
		System.out.println("stateAssemblyName:"+stateGovernment.stateAssemblyName);
		System.out.println("noOfElectedMLA:"+stateGovernment.noOfElectedMLA);
		System.out.println("chiefMinisterName:"+stateGovernment.chiefMinisterName);
		System.out.println("chiefJusticeName:"+stateGovernment.chiefJusticeName);
		System.out.println("stateParlimentLocation:"+stateGovernment.stateParlimentLocation);
		System.out.println("Ending main in StateGovernmentRunning");
		
}

}