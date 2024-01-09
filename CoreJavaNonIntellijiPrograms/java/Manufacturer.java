class Manufacturer{
	public static int getDiscount(String product, int quantity ){
		 //if (product > 1 && product < 50){
			 int discount;
			 if(quantity>10 && product=="tv"){
				 if(quantity>1 || quantity<50){
				 discount= (5 / 100) ;
				 System.out.println("Discount for TV:"+discount);
				 return discount;
				 }
				 else{
					 System.out.println("Please enter the valid number");
				 }
			 }
			 else if(quantity>20 && product=="fridge"){
				 if(quantity>1 || quantity<50){
				  discount= (10 / 100) ;
				 System.out.println("Discount for TV:"+discount);
				 return discount;
				 }
				 else{
					 System.out.println("Please enter the valid number");
				 }
				
			 } 
			  else if(quantity>30 && product=="owen" || product=="mobile"){
				 if(quantity>1 || quantity<50){
				 discount= (15 / 100) ;
				 System.out.println("Discount for TV:"+discount);
				 return discount;
				 }
				 else{
					 System.out.println("Please enter the valid number");
				 }
				
			 } 
			 return 1;
		 }
	
	}

//Discounted Price = Original Price - (Original Price * (5 / 100))