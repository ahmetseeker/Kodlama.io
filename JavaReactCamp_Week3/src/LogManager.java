
public class LogManager {
	public void log(UserManager userManager) {
		//Student student = new Student();
		//student.setFirstName("Ahmet");
		//userManager.login(student);
		System.out.println("Loglama yapildi.");
		userManager.login(new User(1, "Engin", "Demiog" , "temp@mail.com", "password"));
		
	}
	
	public void logMultiple(UserManager[] userManagers) {
		for(UserManager userManager : userManagers) {
			log(userManager);
		}
	}
	
}
