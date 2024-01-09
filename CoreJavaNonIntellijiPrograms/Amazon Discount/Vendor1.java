class Vendor1{
	public static double billProduct(String product, int quantity){
		double dis = Manufacturer1.getDiscount(product, quantity );
		double price;
		double originalPrice;
		if(product=="tv"){
			if(product=="tv" && quantity > 10){
			originalPrice=(2000*quantity);
			price= (2000 * quantity)-(2000 * quantity * dis);
			System.out.println("Original Price of the fridge:"+originalPrice);
			System.out.println("Price of tv after discount:"+price);
			return 1;
		}
		else{
			price= (2000 * quantity);
				return 1;
		}
		}
		else if(product=="fridge"){
			if(product=="fridge" && quantity > 20){
			originalPrice=(25000*quantity);
			price= (25000 * quantity)-(25000 * quantity * dis);
			System.out.println("Original Price of the fridge:"+originalPrice);
			System.out.println("Price of fridge after discount:"+price);
			return 1;	
			}
		
		else{
				price= (25000 * quantity);
				return 1;
			}
		}
		
		else if(product=="toaster"){
			if(product=="toaster"){
			price= (1000 * quantity);
			System.out.println("Price of toaster after discount:"+price);
			return 1;
			}
			else{
				price= (1000 * quantity);
				return 1;
			}			
		}
		else if(product=="owen"){
			if(product=="owen" && quantity > 30){
			originalPrice=(5000*quantity);
			price= (5000 * quantity)-(5000 * quantity * dis);
			System.out.println("Original Price of the fridge:"+originalPrice);
			System.out.println("Price of owen after discount:"+price);
			return 1;	
			}
		
		else{
				price= (5000 * quantity);
				return 1;
			}
		}
		else if(product=="mobile"){
			if(product=="mobile" && quantity > 20){
			originalPrice=(75000*quantity);
			price= (75000 * quantity)-(75000 * quantity * dis);
			System.out.println("Original Price of the fridge:"+originalPrice);
			System.out.println("Price of mobile after discount:"+price);
			return 1;	
			}
		
		else{
				price= (75000 * quantity);
				return 1;
			}
		}
		else{
			System.out.println("Invalid Choice");
		}
		return 1;
	}
}
	