class CameraRunning{
	public static void main(String... nnn){
		DigitalCamera digitalCamera = new DigitalCamera("Canon",Color.RED,200,5);
		digitalCamera.displayInfo();
		
		HandCamera handCamera = new HandCamera(3,"Canon",Color.BLACK,194,5);
		digitalCamera.displayInfo();
	}
}