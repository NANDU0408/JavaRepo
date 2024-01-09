class Canteen{
	String type;
	Utensils[] utensils;
	
	Canteen(String type, Utensils[] utensils){
		this.type=type;
		this.utensils=utensils;
	}
	
	void displayInfo(){
		System.out.println("Starting info in Canteen");
		System.out.println("Canteen type:"+this.type);
		System.out.println("Canteen utensils:"+this.utensils);
		if(this.utensils!=null){
			System.out.println("Utensils length:"+this.utensils.length);
			for(int i=0; i<this.utensils.length; i++){
				Utensils utensilsArray=this.utensils[i];
				System.out.println("utensils:"+utensilsArray);
				utensilsArray.displayInfo();
			}
		}
		System.out.println("Starting info in Canteen");
	}
}