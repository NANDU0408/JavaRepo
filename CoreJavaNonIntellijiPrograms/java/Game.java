class Game{
	int id;
	String name;
	enum TotalPlayers{
		Eleven,TWENTYONE,THIRTEEN,FOURTEEN,SEVENTEEN;
	}
	String origin;
	
	Game(int id, String name,String origin){
		this.id=id;
		this.name=name;
		this.origin=origin;
	}
	
	void play(){
		System.out.println("Starting in game");
		System.out.println("Running play in game");
		System.out.println("Ending in game");
	}
	
	void pause(){
		System.out.println("Starting in game");
		System.out.println("Running pause in game");
		System.out.println("Ending in game");
	}
	
	void end(){
		System.out.println("Starting in game");
		System.out.println("Running end in game");
		System.out.println("Ending in game");
	}
	
	void displayInfo(){
		System.out.println("Starting info in game");
		System.out.println("Game id:"+id);
		System.out.println("Game name:"+name);
		TotalPlayers tp= TotalPlayers.SEVENTEEN;
		System.out.println("Game TotalPlayers:"+tp);
		play();
		pause();
		end();
		System.out.println("Ending info in game");
	}
}