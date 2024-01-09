class LgRemote extends Remote{
	
	double warranty;
	double totalBatteries;
	
	LgRemote(double warranty, double totalBatteries,  double totalButtons, boolean original, UsedFor usedFor){
		super(totalButtons,original,usedFor);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
	}	
	void voiceCommand(){
		System.out.println("Selecting voiceCommand in LgRemote");
	}
	
	@Override
	void on(){
		System.out.println("On function running in LgRemote");
	}
	
	@Override
	void off(){
		System.out.println("OFF function running in LgRemote");
	}
}