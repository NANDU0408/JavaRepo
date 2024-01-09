class Vendor{
	public static int billProduct(String product, int quantity){
		//int TotalPrice;
		int Price=0;
		int discount = Manufacturer.getDiscount(product, quantity);
		if(product=="tv"){
			
			Price= (2000 * quantity)-(2000 * quantity*discount);
			System.out.println("Price of TV after discount:"+Price);
			//return Price;
		}
		else if(product=="fridge"){
			if(product=="fridge"){
			Price= (25000 * quantity)-(25000 * quantity*discount);
			System.out.println("Price of fridge after discount:"+Price);
			return Price;	
			}
		
		else{
				Price= (25000 * quantity);
				return Price;
			}
			    
			}
			
		else if(product=="toaster"){
			Price= (1000* quantity);
			System.out.println("Price of toaster after discount:"+Price);
			//return Price;	
		}
		else if(product=="owen"){
			Price= (5000 * quantity)-discount;
			System.out.println("Price of owen after discount:"+Price);
			//return Price;	
		}
		else if(product=="mobile"){
			Price= (75000 * quantity)-discount;
			System.out.println("Price of mobile after discount:"+Price);
			//return Price;	
		}
		else{
			System.out.println("Invalid Choice");
		}
		return Price;
	}
	 
	
	
}