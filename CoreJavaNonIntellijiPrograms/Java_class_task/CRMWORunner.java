class CRMWORunner{
	public static void main(String[] nnn){
		Clock clock= new Clock();
		Clock clock1= new Clock("Rolex");
		Clock clock2= new Clock("Seiko","Black");
		Clock clock3= new Clock("Howard Miller", "Golden", 2500);
		Clock clock4= new Clock("Casio", "Silver",3000, 10/2023);		
		
	System.out.println(" ");	
	System.out.println("clock brand :"+clock.brand);
	System.out.println("clock color:"+clock.color);
	System.out.println("clock price:"+clock.price);
	System.out.println("clock expiryDate:"+clock.expiryDate);
	System.out.println(" ");	
	System.out.println("clock1 brand :"+clock1.brand);
	System.out.println("clock1 color:"+clock1.color);
	System.out.println("clock1 price:"+clock1.price);
	System.out.println("clock1 expiryDate:"+clock1.expiryDate);
	System.out.println(" ");
	System.out.println("clock2 brand :"+clock2.brand);
	System.out.println("clock2 color:"+clock2.color);
	System.out.println("clock2 price:"+clock2.price);
	System.out.println("clock2 expiryDate:"+clock2.expiryDate);
	System.out.println(" ");
	System.out.println("clock3 brand :"+clock3.brand);
	System.out.println("clock3 color:"+clock3.color);
	System.out.println("clock3 price:"+clock3.price);
	System.out.println("clock3 expiryDate:"+clock3.expiryDate);
	System.out.println(" ");
	System.out.println("clock4 brand :"+clock4.brand);
	System.out.println("clock4 color:"+clock4.color);
	System.out.println("clock4 price:"+clock4.price);
	System.out.println("clock4 expiryDate:"+clock4.expiryDate);
	System.out.println(" ");
	
	
		Rocket rocket= new Rocket();
		Rocket rocket1= new Rocket("PSLV");
		Rocket rocket2= new Rocket("GSLV","Silver");
		Rocket rocket3= new Rocket("GSLV Mk III", "White", 250000);
		Rocket rocket4= new Rocket("Vikram-1", "SkyBlue",300000, 25000);		
		
	System.out.println(" ");	
	System.out.println("rocket name :"+rocket.name);
	System.out.println("rocket color:"+rocket.color);
	System.out.println("rocket payloadCapacity:"+rocket.payloadCapacity);
	System.out.println("rocket fuelCapacity:"+rocket.fuelCapacity);
	System.out.println(" ");
	System.out.println("rocket1 name :"+rocket1.name);
	System.out.println("rocket1 color:"+rocket1.color);
	System.out.println("rocket1 payloadCapacity:"+rocket1.payloadCapacity);
	System.out.println("rocket1 fuelCapacity:"+rocket1.fuelCapacity);
	System.out.println(" ");
	System.out.println("rocket2 name :"+rocket2.name);
	System.out.println("rocket2 color:"+rocket2.color);
	System.out.println("rocket2 payloadCapacity:"+rocket2.payloadCapacity);
	System.out.println("rocket2 fuelCapacity:"+rocket2.fuelCapacity);
	System.out.println(" ");
	System.out.println("rocket3 name :"+rocket3.name);
	System.out.println("rocket3 color:"+rocket3.color);
	System.out.println("rocket3 payloadCapacity:"+rocket3.payloadCapacity);
	System.out.println("rocket3 fuelCapacity:"+rocket3.fuelCapacity);
	System.out.println(" ");
	System.out.println("rocket4 name :"+rocket4.name);
	System.out.println("rocket4 color:"+rocket4.color);
	System.out.println("rocket4 payloadCapacity:"+rocket4.payloadCapacity);
	System.out.println("rocket4 fuelCapacity:"+rocket4.fuelCapacity);
	System.out.println(" ");

		MakeupKit makeupKit= new MakeupKit();
		MakeupKit makeupKit1= new MakeupKit("Lakme");
		MakeupKit makeupKit2= new MakeupKit("SUGAR Cosmetics","Minerals and Pigments");
		MakeupKit makeupKit3= new MakeupKit("MyGlamm", "Emollients", 2500);
		MakeupKit makeupKit4= new MakeupKit("Colorbar", "Waxes",300, 10/24);

	String brand;
	String ingredients;
	int price;
	int expiryDate;		
		
	System.out.println(" ");	
	System.out.println("makeupKit brand :"+makeupKit.brand);
	System.out.println("makeupKit ingredients:"+makeupKit.ingredients);
	System.out.println("makeupKit price:"+makeupKit.price);
	System.out.println("makeupKit expiryDate:"+makeupKit.expiryDate);
	System.out.println(" ");
	System.out.println("makeupKit1 brand :"+makeupKit1.brand);
	System.out.println("makeupKit1 ingredients:"+makeupKit1.ingredients);
	System.out.println("makeupKit1 price:"+makeupKit1.price);
	System.out.println("makeupKit1 expiryDate:"+makeupKit1.expiryDate);
	System.out.println(" ");
	System.out.println("makeupKit2 brand :"+makeupKit2.brand);
	System.out.println("makeupKit2 ingredients:"+makeupKit2.ingredients);
	System.out.println("makeupKit2 price:"+makeupKit2.price);
	System.out.println("makeupKit2 expiryDate:"+makeupKit2.expiryDate);
	System.out.println(" ");
	System.out.println("makeupKit3 brand :"+makeupKit3.brand);
	System.out.println("makeupKit3 ingredients:"+makeupKit3.ingredients);
	System.out.println("makeupKit3 price:"+makeupKit3.price);
	System.out.println("makeupKit3 expiryDate:"+makeupKit3.expiryDate);
	System.out.println(" ");
	System.out.println("makeupKit4 brand :"+makeupKit4.brand);
	System.out.println("makeupKit4 ingredients:"+makeupKit4.ingredients);
	System.out.println("makeupKit4 price:"+makeupKit4.price);
	System.out.println("makeupKit4 expiryDate:"+makeupKit4.expiryDate);
	System.out.println(" ");

		Wallet wallet= new Wallet();
		Wallet wallet1= new Wallet("Gucci");
		Wallet wallet2= new Wallet("Louis Vuitton","Black");
		Wallet wallet3= new Wallet("Hermès", "Orange", 1500);
		Wallet wallet4= new Wallet("Coach", "Grey",1200, "Leather");		
		
	System.out.println(" ");	
	System.out.println("wallet brand :"+wallet.brand);
	System.out.println("wallet color:"+wallet.color);
	System.out.println("wallet price:"+wallet.price);
	System.out.println("wallet type:"+wallet.type);
	System.out.println(" ");	
	System.out.println("wallet1 brand :"+wallet1.brand);
	System.out.println("wallet1 color:"+wallet1.color);
	System.out.println("wallet1 price:"+wallet1.price);
	System.out.println("wallet1 type:"+wallet1.type);
	System.out.println(" ");
	System.out.println("wallet2 brand :"+wallet2.brand);
	System.out.println("wallet2 color:"+wallet2.color);
	System.out.println("wallet2 price:"+wallet2.price);
	System.out.println("wallet2 type:"+wallet2.type);
	System.out.println(" ");
	System.out.println("wallet3 brand :"+wallet3.brand);
	System.out.println("wallet3 color:"+wallet3.color);
	System.out.println("wallet3 price:"+wallet3.price);
	System.out.println("wallet3 type:"+wallet3.type);
	System.out.println(" ");
	System.out.println("wallet4 brand :"+wallet4.brand);
	System.out.println("wallet4 color:"+wallet4.color);
	System.out.println("wallet4 price:"+wallet4.price);
	System.out.println("wallet4 type:"+wallet4.type);
	System.out.println(" ");

		Ornament ornament= new Ornament();
		Ornament ornament1= new Ornament("Joyalukas");
		Ornament ornament2= new Ornament("Tanishq","Gold");
		Ornament ornament3= new Ornament("Malabar Gold & Diamonds", "Silver", 250000);
		Ornament ornament4= new Ornament("PC Jeweller", "Platinum",300000, 24);
	
		
	System.out.println(" ");	
	System.out.println("ornament brand :"+ornament.brand);
	System.out.println("ornament type:"+ornament.type);
	System.out.println("ornament price:"+ornament.price);
	System.out.println("ornament purityInCarat:"+ornament.purityInCarat);
	System.out.println(" ");	
	System.out.println("ornament1 brand :"+ornament1.brand);
	System.out.println("ornament1 type:"+ornament1.type);
	System.out.println("ornament1 price:"+ornament1.price);
	System.out.println("ornament1 purityInCarat:"+ornament1.purityInCarat);
	System.out.println(" ");
	System.out.println("ornament2 brand :"+ornament2.brand);
	System.out.println("ornament2 type:"+ornament2.type);
	System.out.println("ornament2 price:"+ornament2.price);
	System.out.println("ornament2 purityInCarat:"+ornament2.purityInCarat);
	System.out.println(" ");
	System.out.println("ornament3 brand :"+ornament3.brand);
	System.out.println("ornament3 type:"+ornament3.type);
	System.out.println("ornament3 price:"+ornament3.price);
	System.out.println("ornament3 purityInCarat:"+ornament3.purityInCarat);
	System.out.println(" ");
	System.out.println("ornament4 brand :"+ornament4.brand);
	System.out.println("ornament4 type:"+ornament4.type);
	System.out.println("ornament4 price:"+ornament4.price);
	System.out.println("ornament4 purityInCarat:"+ornament4.purityInCarat);
	System.out.println(" ");	
	
	}	
}