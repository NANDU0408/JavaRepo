class Bakery{
	public static void main(String[] args){
		String[] biscuits = {"parle_G","marieGold","oreo","tiger"};
		
		System.out.println("Biscuits in menu of Bakery");
		for(int i=0; i< biscuits.length; i++){
			System.out.println((i + 1) + ". " + biscuits[i]);
		}
		
		long[] contactNos = {1707697697,187698769};
		
		System.out.println("Contact numbers of Bakery");
		for(int i=0; i< contactNos.length; i++){
			System.out.println((i + 1) + ". " + contactNos[i]);
		}
		
		String[] machines = {"biscuit_machine","bread_machine","oven"};
		
		System.out.println("Machines used in Bakery");
		for(int i=0; i< machines.length; i++){
			System.out.println((i + 1) + ". " + machines[i]);
		}
		
		String[] cakes = {"cup_cake","chocolate_cake","vanila_cake"};
		
		System.out.println("Cakes in menu of Bakery");
		for(int i=0; i< cakes.length; i++){
			System.out.println((i + 1) + ". " + cakes[i]);
		}
		
		String[] chocolates = {"cadboury","kitKat","milkyBar","perk"};
		
		System.out.println("Chocolates in menu of Bakery");
		for(int i=0; i< chocolates.length; i++){
			System.out.println((i + 1) + ". " + chocolates[i]);
		}
		
	}
}
