class SpecialItems{
	String specialItemName;
	int quantity;
	int price;
	
	SpecialItems(String specialItemName, int quantity, int price){
		this.specialItemName=specialItemName;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in SpecialItems");
		System.out.println("SpecialItems specialItemName:"+this.specialItemName);
		System.out.println("SpecialItems quantity:"+this.quantity);
		System.out.println("SpecialItems price:"+this.price);
		System.out.println("SpecialItems info in SpecialItems");
	}
}