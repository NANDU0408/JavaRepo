class ToughenedGlass extends Glass{
	double weight;
	String ownerName;
	
	ToughenedGlass(double weight, String ownerName, double length, double thickness, GlassType type, String usage, String brand){
		super(length,thickness,type,usage,brand);
		this.weight=weight;
		this.ownerName=ownerName;
		
		System.out.println("ToughenedGlass weight:"+this.weight);
		System.out.println("ToughenedGlass ownerName:"+this.ownerName);
	}
}