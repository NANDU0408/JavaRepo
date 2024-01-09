class Player{
	String name;
	Game game = new Game(1171,"BADMINTON","INDIA");
	
	void setName(String name){
		this.name=name;
	}
	
	void displayInfo(){
		System.out.println("Starting the main");
		System.out.println("Player name:"+name);
		System.out.println("Game name"+game.name);
		game.play();
		game.pause();
		game.end();
		System.out.println("Starting the main");
	}
}