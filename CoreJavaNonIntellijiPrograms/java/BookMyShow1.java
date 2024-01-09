class BookMyShow1{
	public boolean purchaseInAdvance(String movieName, int quantity){
		//static int result= Theater1.provideTotal();
		//system.out.println("result:"+result);
		System.out.println("Starting of purchaseInAdvance in BookMyShow1")
		if(movieName!=null && quantity>1){
			if(movieName=="LEO" || movieName=="Ghost" || movieName== "Kantara" || movieName== "SSE"){
							int total=Theater1.provideTotal(movieName, quantity);
							System.out.println("movieName:"+movieName);
							System.out.println("Total cost of the ticket is:"+total+ "for" +quantity+ "person");
							return true;
					}
				}
				System.out.println("Ending of purchaseInAdvance in BookMyShow1");
				return false;
			}
		}
		
	
