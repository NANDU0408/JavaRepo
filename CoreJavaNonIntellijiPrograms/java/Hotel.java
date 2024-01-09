class Hotel{
	String name;
	String ownerName;
	MenuCard menuCard;
	
	Hotel(){
		System.out.println("Hotel");
		System.out.println("Non-parameterized Constructor:");
	}
	
	Hotel(String name, String ownerName,MenuCard menuCard){
		this.name=name;
		this.ownerName=ownerName;
		this.menuCard=menuCard;
	}
	 void displayInfo(){
		 System.out.println("Hotel name:"+this.name);
		 System.out.println("Hotel ownerName:"+this.ownerName);
		 System.out.println("Hotel menuCard:"+this.menuCard);
		 if(this.menuCard!=null){
			 System.out.println("totalItems:"+this.menuCard.totalItems);
			 System.out.println("cost:"+this.menuCard.cost);
		 }
	 }
}