class FMCTPRunner{
	public static void main(String[] nnn){
		Free free= new Free();
		free.displayInfo();
		System.out.println(" ");
		
		Free free1= new Free("Bag");
		free1.displayInfo();
		System.out.println(" ");
		
		Free free2= new Free("Laptop_Bag","FreeWithLaptop");
		free2.displayInfo();
		System.out.println(" ");
		
		Free free3= new Free("PrinterCover", "FreeWithPrinter", "Yes");
		free3.displayInfo();
		System.out.println(" ");
		
		
		
		Month month= new Month();
		month.displayInfo();
		System.out.println(" ");
		
		Month month1= new Month("November");
		month1.displayInfo();
		System.out.println(" ");
		
		Month month2= new Month("December",31);
		month2.displayInfo();
		System.out.println(" ");
		
		Month month3= new Month("January",31,5);
		month3.displayInfo();
		System.out.println(" ");
		
		Month month4= new Month("February", 29, 4, 4);
		month4.displayInfo();
		
		
		
		Course course= new Course();
		course.displayInfo();
		System.out.println(" ");
		
		Course course1= new Course("C++");
		course1.displayInfo();
		System.out.println(" ");
		
		Course course2= new Course("Web_Development","Ram");
		course2.displayInfo();
		System.out.println(" ");
		
		Course course3= new Course("Core_Java","Vijay",2);
		course3.displayInfo();
		System.out.println(" ");
		
		Course course4= new Course("Spring_Boot", "Shambavi", 4, 41);
		course4.displayInfo();
		System.out.println(" ");
		
		Course course5= new Course("Python","Raksha",10,56,5);
		course5.displayInfo();
		System.out.println(" ");
		
		Course course6= new Course("Front_End", "Vikas",10,61,5,21000);
		course6.displayInfo();
		System.out.println(" ");
		
		Course course7= new Course("Back_End", "Shravya", 10, 71,8,15000,"Yes");
		course7.displayInfo();
		System.out.println(" ");
		
		
		
		Technology technology= new Technology();
		technology.displayInfo();
		System.out.println(" ");
		
		Technology technology1= new Technology("REACT");
		technology1.displayInfo();
		System.out.println(" ");
		
		Technology technology2= new Technology("Angular","Ram");
		technology2.displayInfo();
		System.out.println(" ");
		
		Technology technology3= new Technology("Spring_Boot","Vijay",2);
		technology3.displayInfo();
		System.out.println(" ");
		
		Technology technology4= new Technology("Flask", "Shambavi", 4, 41);
		technology4.displayInfo();
		System.out.println(" ");
		
		Technology technology5= new Technology("Swift","Raksha",10,56,5);
		technology5.displayInfo();
		System.out.println(" ");
		
		Technology technology6= new Technology("Ruby", "Vikas",10,61,5,21000);
		technology6.displayInfo();
		System.out.println(" ");
		
		Technology technology7= new Technology("PHP", "Shravya", 10, 71,8,15000,"Yes");
		technology7.displayInfo();
		System.out.println(" ");
		
		Technology technology8= new Technology("Node", "Shravya", 10, 71,8,15000,"Yes","Google");
		technology8.displayInfo();
		System.out.println(" ");
		
		Technology technology9= new Technology("Docker", "Shravya", 10, 71,8,15000,"Yes","Apple","Yes");
		technology9.displayInfo();
		System.out.println(" ");
		
		Technology technology10= new Technology("Data_Science", "Shravya", 10, 71,8,15000,"Yes","Microsoft","Yes",5000000);
		technology10.displayInfo();
		System.out.println(" ");
		
		Technology technology11= new Technology("Artificial_Intelligence", "Shravya", 10, 71,8,15000,"Yes","Microsoft","Yes",10000000,4);
		technology11.displayInfo();
		System.out.println(" ");
		
		Technology technology12= new Technology("Apache Hadoop", "Shravya", 10, 71,8,15000,"Yes","Apple","Yes",10000000,5,"Yes");
		technology12.displayInfo();
		System.out.println(" ");
		
		
		
		
		
		
		
		
		
		Placement placement= new Placement();
		placement.displayInfo();
		System.out.println(" ");
		
		Placement placement1= new Placement("Accenture");
		placement1.displayInfo();
		System.out.println(" ");
		
		Placement placement2= new Placement("Infosys","Software Developer");
		placement2.displayInfo();
		System.out.println(" ");
		
		Placement placement3= new Placement("Dimension94","Python Developer",6);
		placement3.displayInfo();
		System.out.println(" ");
		
		Placement placement4= new Placement("Alphabet", "Data Scientist", 5, 4);
		placement4.displayInfo();
		System.out.println(" ");
		
		Placement placement5= new Placement("Microsoft","Artificial_Intelligence",11,7,8);
		placement5.displayInfo();
		System.out.println(" ");
		
		Placement placement6= new Placement("IBM", "Software Engineer",10,6,7,21000000);
		placement6.displayInfo();
		System.out.println(" ");
		
		Placement placement7= new Placement("SAP", "Python Developer", 10, 7,8,15000000,"Yes");
		placement7.displayInfo();
		System.out.println(" ");
		
		Placement placement8= new Placement("Salesforce", "Data Scientist", 10, 10,8,15000000,"Yes","Data Science");
		placement8.displayInfo();
		System.out.println(" ");
		
		Placement placement9= new Placement("Adobe", "Software Engineer", 10, 71,8,15000,"Yes","Web Development","Mangalore");
		placement9.displayInfo();
		System.out.println(" ");
		
		Placement placement10= new Placement("Amazon", "Python Developer", 10, 71,8,15000,"Yes","Python Development","USA",50000);
		placement10.displayInfo();
		System.out.println(" ");
		
		Placement placement11= new Placement("Intel", "Python Developer", 10, 71,8,15000,"Yes","Networking","UK",57000,4);
		placement11.displayInfo();
		System.out.println(" ");
		
		Placement placement12= new Placement("VMware", "Full Stack Developer", 10, 71,8,15000,"Yes","Web Development","Germany",80000,5,"Yes");
		placement12.displayInfo();
		System.out.println(" ");
	}
}
