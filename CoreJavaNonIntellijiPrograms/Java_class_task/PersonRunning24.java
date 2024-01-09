class PersonRunning24{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Email[] email= new Email[4];
		
		email[0]=new Email("email.com",171,"Vivek","Raj");
		email[1]=new Email("gmail.com",177,"Vikas","Ved");
		email[2]=new Email("yahoo.com",717,"Ram","Vihan");
		email[3]=new Email("facebook.com",771,"Krishna","Maharsh");
		
		Person24 person = new Person24("Alok",email);
		person.displayInfo();
		
		System.out.println("Ending main");
	}
}