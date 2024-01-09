class ProjectRunning{
	public static void main(String args[]){
		System.out.println("starting main in ProjectRunning");
		Project project=new Project();
		Person person=new Person();
		project.validate(person);
		
		Developer developer=new Developer();
		project.validate(developer);
		
		Tester tester=new Tester();
		project.validate(tester);
		
		DataBaseDeveloper databasedeveloper=new DataBaseDeveloper();
		project.validate(databasedeveloper);
		
		ProductOwner productowner=new ProductOwner();
		project.validate(productowner);
		
		BuisnessAnalyst buisnessAnalyst=new BuisnessAnalyst();
		project.validate(buisnessAnalyst);
		
		Devops devops=new Devops();
		project.validate(devops);
		
		
		System.out.println("ending main in ProjectRunning");
	}
}