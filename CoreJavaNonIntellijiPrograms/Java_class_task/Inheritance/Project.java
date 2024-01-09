class Project{
	
	Project(){
		System.out.println("Project");
	}
	
	void validate(Person person){
		if(person!=null){
			person.eat();
			person.sleep();
			
			if(person instanceof Developer){
				Developer developer =(Developer)person;
				developer.eat();
				developer.sleep();
				developer.code();
			}
			if(person instanceof Tester){
				Tester tester =(Tester)person;
				tester.eat();
				tester.sleep();
				tester.qualityCheck();
			}
			if(person instanceof DataBaseDeveloper){
				DataBaseDeveloper databasedeveloper = (DataBaseDeveloper)person;
				databasedeveloper.eat();
				databasedeveloper.sleep();
				databasedeveloper.runScripts();
			}
			if(person instanceof ProductOwner){
				ProductOwner productowner=(ProductOwner)person;
				productowner.eat();
				productowner.sleep();
				productowner.validate();
		   }
		   if(person instanceof BuisnessAnalyst){
				BuisnessAnalyst buisnessAnalyst=(BuisnessAnalyst)person;
				buisnessAnalyst.eat();
				buisnessAnalyst.sleep();
				buisnessAnalyst.checkRequirement();
		   }
		   if(person instanceof Devops){
				Devops devops=(Devops)person;
				devops.eat();
				devops.sleep();
				devops.runBuild();
		}
		}
	}
}