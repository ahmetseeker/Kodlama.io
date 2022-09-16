
public class CourseManagement {
	public void courseDetails(Courses course) {
		System.out.println("Kurs Detayları: " + course.getCourseDetails());
	}
	
	public void startCourse(Courses course) {
		System.out.println("Kursa Hoşgeldiniz!" + " " + course.getCourseName());
	}
}
