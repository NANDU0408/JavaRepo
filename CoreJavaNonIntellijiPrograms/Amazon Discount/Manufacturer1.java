class Manufacturer1{
	public static double getDiscount(String product, int quantity ){
		 //if (product > 1 && product < 50){
			 double discount=0;
			  if(quantity>20 && product=="tv"){
				  if(quantity>1 || quantity<50){
				  discount=5.0/100.0;
				 System.out.println("Discount for tv: " + (discount));
				 return discount;
				}
				else{
				 System.out.println("Please enter the valid number");
				}
			 }
			 else if(quantity>20 && product=="fridge"){
				  if(quantity>1 || quantity<50){
				  discount=10.0/100.0;
				 System.out.println("Discount for fridge: " + (discount));
				 return discount;
				}
				else{
				 System.out.println("Please enter the valid number");
				}
			 }
			 
			  else if(quantity>20 && product=="owen"){
				  if(quantity>1 || quantity<50){
				  discount=15.0/100.0;
				 System.out.println("Discount for owen: " + (discount));
				 return discount;
				}
				else{
				 System.out.println("Please enter the valid number");
				}
			 }
			 
			  else if(quantity>20 && product=="mobile"){
				  if(quantity>1 || quantity<50){
				  discount=15.0/100.0;
				 System.out.println("Discount for mobile: " + (discount));
				 return discount;
				}
				else{
				 System.out.println("Please enter the valid number");
				}
			 }
			 else{
				 System.out.println("Invalid Choice");
			 }
			 return discount;
		 }
	}
//Discounted Price = Original Price - (Original Price * (5 / 100))



 