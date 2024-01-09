class MediaPlayer extends StandaloneApplication{
	
	String[] favourites;
	
	MediaPlayer(String name,ApplicationType type){
		super(name,type);
	}
	
	void displayInfo(){
		
		play();
		delete();
		download();
	}
	
	void setFavourites(String[] favourites){
		this.favourites=favourites;
		for(int i=0; i<favourites.length; i++){
			String fa = favourites[i];
			System.out.println("favourites are" +favourites[i]+ "at seq" +i);
		}
	}
	
	void play(){
		System.out.println("Accessing play in MediaPlayer");
	}
	
	void delete(){
		System.out.println("Accessing delete in MediaPlayer");
	}
	
	void download(){
		System.out.println("Accessing download in MediaPlayer");
	}
}