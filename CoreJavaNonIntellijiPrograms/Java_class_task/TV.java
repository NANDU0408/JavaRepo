class TV{
	boolean display= true;
	Speaker speaker;
	
	TV(){
		super();
		System.out.println("TV");
		System.out.println("Non-parameterized Constructor:");
	}
	
	TV(Speaker speaker){
		super();
		this.speaker=speaker;
		System.out.println("Creating the TV constructor with parameter TV brand:" +speaker);
	}
	
	void displayInfo(){
		System.out.println("display:"+this.display);
		System.out.println("speaker:"+this.speaker);
		if(this.speaker!=null){
			System.out.println("maxVolume:"+this.speaker.maxVolume);
		}
	}
}