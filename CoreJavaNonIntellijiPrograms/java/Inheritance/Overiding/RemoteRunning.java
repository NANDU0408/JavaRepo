class RemoteRunning{
	
	public static void main(String... nnn){
		System.out.println("Starting main in RemoteRunning");
		LgRemote lgRemote = new LgRemote(2,4,30,true,UsedFor.AC);
		lgRemote.on();
		lgRemote.off();
		lgRemote.increaseVolume();
		lgRemote.decreaseVolume();
		lgRemote.changeChannel();
		lgRemote.voiceCommand();
		System.out.println("totalButtons:"+lgRemote.totalButtons);
		System.out.println("original:"+lgRemote.original);
		System.out.println("UsedFor:"+lgRemote.usedFor);
		System.out.println("warranty:"+lgRemote.warranty);
		System.out.println("totalBatteries:"+lgRemote.totalBatteries);
		System.out.println("Ending main in RemoteRunning");
		
		Remote remote = new Remote(30,true,UsedFor.TV);
		remote.on();
		remote.off();
		System.out.println("totalButtons:"+remote.totalButtons);
		System.out.println("Ending main in RemoteRunning");
	}
}