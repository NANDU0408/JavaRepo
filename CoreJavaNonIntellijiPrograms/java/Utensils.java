class Utensils{
	String utensilName;
	int quantity;
	String used;
	
	Utensils(String utensilName, int quantity, String used){
		this.utensilName=utensilName;
		this.quantity=quantity;
		this.used=used;
		
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in Utensils");
		System.out.println("SpecialItems utensilName:"+this.utensilName);
		System.out.println("SpecialItems quantity:"+this.quantity);
		System.out.println("SpecialItems used:"+this.used);
		System.out.println("SpecialItems info in Utensils");
	}
}