class ATMRunning{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Branch[] branch= new Branch[5];
		
		branch[0]=new Branch("VijayNagarBranch","VijayNagar",12);
		branch[1]=new Branch("RajajiNagarBranch","RajajiNagar",5);
		branch[2]=new Branch("BTMLayoutBranch","BTMLayout",8);
		branch[3]=new Branch("WhiteFieldBranch","WhiteField",6);
		branch[4]=new Branch("MarathalliBranch","Marathalli",11);
		
		Accounts[] accounts= new Accounts[5];
		
		accounts[0]=new Accounts("RD",1500,12);
		accounts[1]=new Accounts("FD",50000,5);
		accounts[2]=new Accounts("SD",2000,8);
		accounts[3]=new Accounts("FD",25000,6);
		accounts[4]=new Accounts("RD",5000,11);
		
		
		CctvBrands[] cctvBrands= new CctvBrands[5];
		
		cctvBrands[0]=new CctvBrands("Hikvision","FullCoverage",120000);
		cctvBrands[1]=new CctvBrands("Axis Communications","HalfCoverage",50000);
		cctvBrands[2]=new CctvBrands("Bosch Security Systems","LessCoverage",80000);
		cctvBrands[3]=new CctvBrands("Sony","FullCoverage",60000);
		cctvBrands[4]=new CctvBrands("Amcrest","FullCoverage",110000);
		

		ATM atm = new ATM("CANARA BANK",branch, accounts, cctvBrands);
		atm.displayInfo();
		
		System.out.println("Ending main");
	}
}