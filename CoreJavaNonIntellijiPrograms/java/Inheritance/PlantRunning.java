class PlantRunning{
	public static void main(String[] nnn){
		Plant plant = new Food1();
		plant.Growth();
		
		Food1 food = (Food1)plant;
		food.Growth();
		food.Preparing();
	}
	
}

