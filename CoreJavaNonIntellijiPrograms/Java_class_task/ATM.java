class ATM{
	String bankName;
	Branch[] branch;
	Accounts[] accounts;
	CctvBrands[] cctvBrands;
	
	ATM(String bankName, Branch[] branch, Accounts[] accounts, CctvBrands[] cctvBrands){
		this.bankName=bankName;
		this.branch=branch;
		this.accounts=accounts;
		this.cctvBrands=cctvBrands;
	}
	
	void displayInfo(){
		System.out.println("Starting info in ATM");
		System.out.println("Person bankName:"+this.bankName);
		System.out.println("Person branch:"+this.branch);
		System.out.println("Person accounts:"+this.accounts);
		System.out.println("Person cctvBrands:"+this.cctvBrands);
		if(this.branch!=null){
			System.out.println("Branch length:"+this.branch.length);
			for(int i=0; i<this.branch.length; i++){
				Branch branchArray=this.branch[i];
				System.out.println("branch:"+branchArray);
				branchArray.displayInfo();
			}
		}
		if(this.accounts!=null){
			System.out.println("Accounts length:"+this.accounts.length);
			for(int i=0; i<this.accounts.length; i++){
				Accounts accountsArray=this.accounts[i];
				System.out.println("accounts:"+accountsArray);
				accountsArray.displayInfo();
			}
		}
		if(this.cctvBrands!=null){
			System.out.println("CctvBrands length:"+this.cctvBrands.length);
			for(int i=0; i<this.cctvBrands.length; i++){
				CctvBrands cctvBrandsArray=this.cctvBrands[i];
				System.out.println("cctvBrands:"+cctvBrandsArray);
				cctvBrandsArray.displayInfo();
			}
		}
		System.out.println("Starting info in ATM");
	}
}