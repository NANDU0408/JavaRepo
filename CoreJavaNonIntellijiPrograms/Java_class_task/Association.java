class Association{
	public static void main(String[] nnn){
		System.out.println("TENT");
		System.out.println("Starting Tent in main");
		Tent tent= new Tent();
		Agent agent = new Agent();
		System.out.println("Starting openTent");
		agent.openTent(tent);
		System.out.println("Starting closeTent");
		agent.closeTent(tent);
		System.out.println("Starting info");
		agent.displayInfo();
		System.out.println("Ending Tent in main");
		
		System.out.println("");
		System.out.println("GAME");
		System.out.println("Starting Game in main");
		Game game = new Game(1177,"CRICKET","INDIA");
		game.displayInfo();
		Player player = new Player();
		player.setName("M.S.Dhoni");
		player.displayInfo();
		System.out.println("Ending Game in main");
	}
}