class LaminatedGlass extends Glass{
	double cost;
	double warranty;
	
	LaminatedGlass(double cost, double warranty, double length, double thickness, GlassType type, String usage, String brand){
		super(length,thickness,type,usage,brand);
		this.cost=cost;
		this.warranty=warranty;
		
		System.out.println("LaminatedGlass cost:"+this.cost);
		System.out.println("LaminatedGlass warranty:"+this.warranty);
	}
}