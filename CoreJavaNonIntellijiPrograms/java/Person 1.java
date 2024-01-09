class Person1{
	String name;
	Email[] email;
	
	Person(String name, Email[] email){
		this.name=name;
		this.email=email;
	}
	
	void displayInfo(){
		System.out.println("Starting info in Person");
		System.out.println("Person name:"+this.name);
		System.out.println("Person email:"+this.email);
		if(this.email!=null){
			System.out.println("Email length:"+this.email.length);
			for(int i=0; i<this.email.length; i++){
				Email emailArray=this.email[i];
				System.out.println("Email:"+emailArray);
				emailArray.displayInfo();
			}
		}
		System.out.println("Starting info in Person");
	}
}