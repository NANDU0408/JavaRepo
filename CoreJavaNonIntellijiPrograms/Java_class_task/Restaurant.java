class Restaurant{
	String ownerName;
	SpecialItems[] specialItems;
	
	Restaurant(String ownerName, SpecialItems[] specialItems){
		this.ownerName=ownerName;
		this.specialItems=specialItems;
	}
	
	void displayInfo(){
		System.out.println("Starting info in Restaurant");
		System.out.println("Person ownerName:"+this.ownerName);
		System.out.println("Person specialItems:"+this.specialItems);
		if(this.specialItems!=null){
			System.out.println("SpecialItems length:"+this.specialItems.length);
			for(int i=0; i<this.specialItems.length; i++){
				SpecialItems specialItemsArray=this.specialItems[i];
				System.out.println("specialItems:"+specialItemsArray);
				specialItemsArray.displayInfo();
			}
		}
		System.out.println("Starting info in Restaurant");
	}
}