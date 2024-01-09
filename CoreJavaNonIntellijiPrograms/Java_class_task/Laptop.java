class Laptop{
	
	Owner owner;
	Brand brand;
	Hardware[] hardware;
	
	Laptop(){
		
		System.out.println(" Laptop Created");
	}
	
	void setHardware(Hardware[] hardware){
		this.hardware=hardware;
	}
	
	void setOwner(Owner owner){
		this.owner=owner;
	}
	
	void setBrand(Brand brand){
		
		this.brand=brand;
	}
	
	void displayInfo(){
		
		System.out.println("Starting info in Laptop");
		System.out.println("Hardware is "+this.hardware);
		if(this.hardware!=null){
			for(int i=0;i<this.hardware.length;i++){
				
				Hardware hardwareArray=this.hardware[i];
				System.out.println("Hardware is "+this.hardware[i]+" at the index of "+hardwareArray);
				hardwareArray.displayInfo();
			}
		}
		
		System.out.println("owner is "+this.owner);
		if(this.owner!=null){
			owner.displayInfo();
		}
		System.out.println("brand is "+this.brand);
		if(this.brand!=null){
			brand.displayInfo();
		}
		
		System.out.println("Ending info in Laptop");
	}
}