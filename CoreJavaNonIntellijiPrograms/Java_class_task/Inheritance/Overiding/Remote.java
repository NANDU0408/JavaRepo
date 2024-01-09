class Remote{
	
	UsedFor usedFor;
	double totalButtons;
	boolean original;
	
	Remote(double totalButtons, boolean original, UsedFor usedFor){
		this.usedFor=usedFor;
		this.totalButtons=totalButtons;
		this.original=original;
	}
	
	void on(){
		System.out.println("Selecting ON in Remote");
	}
	
	void off(){
		System.out.println("Selecting OFF in Remote");
	}
	
	void increaseVolume(){
		System.out.println("Selecting increaseVolume in Remote");
	}
	
	void decreaseVolume(){
		System.out.println("Selecting decreaseVolume in Remote");
	}
	
	void changeChannel(){
		System.out.println("Selecting changeChannel in Remote");
	}
	
	
}