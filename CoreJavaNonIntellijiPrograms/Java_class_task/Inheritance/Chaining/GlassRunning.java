class GlassRunning{
	public static void main(String[] nnn){
		System.out.println("Starting main in GlassRunning");
		TintedGlass tintedglass = new TintedGlass(4,"RAM",40,25,GlassType.TINTEDGLASS,"Office Windows","Regal Glass");
		tintedglass.displayInfo();
		
		GorillaGlass gorillaGlass = new GorillaGlass(85,7,24,17,GlassType.LAMINATEDGLASS,"Mobile Shops","Corning Glass");
		gorillaGlass.displayInfo();
		System.out.println("Ending main in GlassRunning");
	}
}