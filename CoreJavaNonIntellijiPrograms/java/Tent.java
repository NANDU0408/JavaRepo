class Tent{
	int slNo;
	enum Color{
		RED,PINK,BLUE,WHITE,VIOLET,PURPLE,GREEN,YELLOW;
	}
	double width=120,height=140;
	
	boolean open(){
		System.out.println("starting the open in the Tent");
		System.out.println("the open method is running");
		System.out.println("ending the open in the Tent");
		return true;
	}
	
	boolean close(){
		System.out.println("starting the close in the Tent");
		System.out.println("the close method is running");
		System.out.println("ending the close in the Tent");
		return false;
	}
	
	void displayInfo(){
		System.out.println("Starting the info in tent");
		System.out.println("Tent slNo:"+slNo);
		Color color=Color.PURPLE;
		System.out.println("Tent color:"+color);
		System.out.println("Tent width:"+width);
		System.out.println("Tent height:"+height);
		open();
		close();
		System.out.println("Ending the info in tent");
	}
	
}