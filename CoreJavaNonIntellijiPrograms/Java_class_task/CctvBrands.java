class CctvBrands{
	String brandName;
	String type;
	int price;
	
	CctvBrands(String brandName, String type, int price){
		this.brandName=brandName;
		this.type=type;
		this.price=price;
		
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in CctvBrands");
		System.out.println("CctvBrands brandName:"+this.brandName);
		System.out.println("CctvBrands type:"+this.type);
		System.out.println("CctvBrands price:"+this.price);
		System.out.println("Ending info in CctvBrands");
	}
}