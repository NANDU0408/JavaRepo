class Rocket{
	String name;
	String color;
	int payloadCapacity;
	int fuelCapacity;
	 
	
	Rocket(){
		super();
		System.out.println("Rocket");
	}
	
	
	Rocket(String name){
		super();
		this.name=name;
		System.out.println("Creating the Rocket constructor with parameter Rocket name:" +name);
	}
	
	Rocket(String name, String color){
		super();
		this.name=name;
		this.color=color;
		System.out.println("Creating the Rocket constructor with parameter Rocket name:" +name);
		System.out.println("Creating the Rocket constructor with parameter Rocket color:" +color);
	}
	
	Rocket(String name,  String color,  int payloadCapacity){
		super();
		this.name=name;
		this.color=color;
		this.payloadCapacity=payloadCapacity;
		System.out.println("Creating the Rocket constructor with parameter Rocket name:" +name);
		System.out.println("Creating the Rocket constructor with parameter Rocket color:" +color);
		System.out.println("Creating the Rocket constructor with parameter Rocket payloadCapacity:"+payloadCapacity);
	}
	
	Rocket(String name, String color,  int payloadCapacity, int fuelCapacity){
		super();
		this.name=name;
		this.color=color;
		this.payloadCapacity=payloadCapacity;
		this.fuelCapacity=fuelCapacity;
		System.out.println("Creating the Rocket constructor with parameter Rocket name:" +name);
		System.out.println("Creating the Rocket constructor with parameter Rocket color:" +color);
		System.out.println("Creating the Rocket constructor with parameter Rocket payloadCapacity:"+payloadCapacity);
		System.out.println("Creating the Rocket constructor with parameter Rocket fuelCapacity:"+fuelCapacity);
	}
	
}