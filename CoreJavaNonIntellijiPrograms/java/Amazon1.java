class Amazon1{
	public static boolean onlinePurchase(String clientName, String product, int quantity){
		double msg= Vendor1.billProduct(product, quantity);
		//int msg=Vendor.billProduct("fridge", 5);
		if(clientName=="Divya" || clientName=="Shreyas" || clientName=="Shambu" || clientName=="Geetha" || clientName=="Nitin"){
			System.out.println("Free Delivery");
			Client1.purchaseProduct(clientName);
		}
		else{
			System.out.println("No Free Delivery");
		}
		return true;
	}
}