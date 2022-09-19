
public class Main {

	public static void main(String[] args) {
		
		/*
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setId(1);
		instructor.seteMail("temp@gmail.com");
		instructor.setPassword("password");
		instructor.setProfession("Software Development");
		instructor.setSalary(20000);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.viewStatistics(instructor);
		
		
		LogManager logManager = new LogManager();
		logManager.log(new InstructorManager());
		logManager.log(new StudentManager());
		 */
		
		
		UserManager[] userManagers = {new UserManager(), new InstructorManager(), new StudentManager()};
		
		LogManager logManager = new LogManager();
		logManager.logMultiple(userManagers);
		
		
	}

}
