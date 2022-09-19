
public class InstructorManager extends UserManager{
	@Override
	public void login(User user) {
		System.out.println("(Instructor) Giris yapildi: " + user.getFirstName());
	}
	
	public void viewStatistics(User user) {
		System.out.println("Statistics viewed!" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void addCourse(User user) {
		System.out.println("Course Added Succesfully!");
	}
	
	public void deleteCourse(User user) {
		System.out.println("Course Deleted Succesfully!");
	}
}
