class MachineRunning{
	public static void main(String[] nnn){
		
		Machine machine = new Generator();
		machine.Easy();
		
		Generator generator = (Generator)machine;
		generator.LoadShedding();
		generator.Easy();
	}
}