class Camera{
	String brand;
	Color color;
	double pixel;
	double batteryDuration;
	
	
	Camera(String brand, Color color, double pixel, double batteryDuration){
		this.brand=brand;
		this.color=color;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
	}
	
	void displayInfo(){
		System.out.println("Starting displayInfo in Camera");
		System.out.println("Camera brand:"+this.brand);
		System.out.println("Camera color:"+this.color);
		System.out.println("Camera pixel:"+this.pixel);
		System.out.println("Camera batteryDuration:"+this.batteryDuration);
		System.out.println("Ending displayInfo in Camera");
	}
	
}