class Brand{
	
	String name="Dell";
	String origin="US";
	String ceoName="Michael Dell";
	City[] cities;
	
	Brand(){
		
		System.out.println("created Brand using no arg const....");
	}
	
	void setCities(City[] cities){
		
		this.cities=cities;
	}
	
	void displayInfo(){
		
		System.out.println("Starting info in Brand");
		System.out.println("Brand name "+this.name);
		System.out.println("Brand origin "+this.origin);
		System.out.println("Brand ceoName "+this.ceoName);
		System.out.println("Brand cities "+this.cities);
		if(this.cities!=null){
			for(int i=0;i<this.cities.length;i++){
				
				City citiesArray=this.cities[i];
				System.out.println("Cities are "+this.cities[i]+" at the index of "+citiesArray);
				citiesArray.displayInfo();
			}
		}
		
		System.out.println("Ending info in Brand");
	}
	
}