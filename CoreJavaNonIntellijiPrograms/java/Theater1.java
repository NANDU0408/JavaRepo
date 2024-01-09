class Theater1{
	public int provideTotal(String movieName, int quantity){
		System.out.println("Starting provideTotal in Theater1");
		if(movieName!=null && quantity>1){
			if(movieName=="LEO"){
				return quantity*250;
			}
			else if(movieName=="Ghost"){
				return quantity*120;
			}
			else if(movieName=="Kantara"){
				return quantity*300;
			}
			else {
				return quantity*100;
			System.out.println("Ending provideTotal in Theater1");
			return 0
		}
	}
}