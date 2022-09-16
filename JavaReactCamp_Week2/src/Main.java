
public class Main {

	public static void main(String[] args) {
		Users user = new Users();
		user.setName("Ahmet");
		user.setLastName("ŞEKER");
		user.seteMail("skdjf@gmail.com");
		user.setPassword("qweasd123");
		
		Navi navi = new Navi();
		navi.login(user);
		
		navi.register(user);
		
		Courses course = new Courses();
		course.setCourseName("JavaReactCourse");
		course.setCourseDetails("Yazılım Kampı.");
		
		CourseManagement courseManagement = new CourseManagement();
		courseManagement.courseDetails(course);
		courseManagement.startCourse(course);

	}

}
