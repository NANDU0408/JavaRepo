class Glass{
	
	double length;
	double thickness;
	GlassType type;
	String usage;
	String brand;
	
	Glass(double length, double thickness, GlassType type, String usage, String brand){
		this.length=length;
		this.thickness=thickness;
		this.type=type;
		this.usage=usage;
		this.brand=brand;
	}
	
	void displayInfo(){
		System.out.println("Starting displayInfo in Glass");
		System.out.println("Glass length:"+this.length);
		System.out.println("Glass thickness:"+this.thickness);
		System.out.println("Glass glassType:"+this.type);
		System.out.println("Glass usage:"+this.usage);
		System.out.println("Glass brand:"+this.brand);
		System.out.println("Ending displayInfo in Glass");
	}
}