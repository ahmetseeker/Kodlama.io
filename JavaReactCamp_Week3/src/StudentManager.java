
public class StudentManager extends UserManager {
	@Override
	public void login(User user) {
		System.out.println("(Student) Giris yapildi: " + user.getFirstName());
	}
	
	public void viewCourseDetails(User user) {
		System.out.println("Viewed Succesfully!");
	}
	
	public void startCourse(User user) {
		System.out.println("Course Started!");
	}
	
	public void completeCourse(User user) {
		System.out.println("Course Completed!");
	}
}
