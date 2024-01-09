class Client{
	public static String purchaseProduct(String clientName){
		
		if(clientName=="Divya" || clientName=="Shreyas" || clientName=="Shambu" || clientName=="Geetha" || clientName=="Nitin" || clientName=="Ram"){
			if(clientName=="Divya"){
				System.out.println("Divya purchased the product");
			}
			else if(clientName=="Shreyas"){
				System.out.println("Shreyas purchased the product");
			}
			else if(clientName=="Shambu"){
				System.out.println("Shambu purchased the product");
			}
			else if(clientName=="Geetha"){
				System.out.println("Geetha purchased the product");
			}
			else if(clientName=="Nitin"){
				System.out.println("Nitin purchased the product");
			}
			else if(clientName=="Ram"){
				System.out.println("Ram purchased the product");
			}
			else if(clientName=="Raj"){
				System.out.println("Raj Not purchased the product");
			}
			else{
				System.out.println("Invalid");
			}
			
		}
		else{
			System.out.println("Return");
		}
		return clientName;
	}
}


			
			
		
		
		
		/* else if(quantity>20 && product=="fridge"){
				 if(quantity>1 || quantity<50){
				  discount= 25000*(10 / 100);
				 System.out.println("Discount for TV:"+discount);
				 return discount;
				 }
				 else{
					 System.out.println("Please enter the valid number");
				 }
				
			 } */
			 
			