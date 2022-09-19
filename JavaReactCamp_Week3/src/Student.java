
public class Student extends User {
	public Student() {
		System.out.println("Constructor calisti!");
	}
	
	public Student(String education, String attendedCourses, String completedCourses) {
		this();
		this.education = education;
		this.attendedCourses = attendedCourses;
		this.completedCourses = completedCourses;
	}
	
	private String education;
	private String attendedCourses;
	private String completedCourses;
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}

	public String getAttendedCourses() {
		return attendedCourses;
	}

	public void setAttendedCourses(String attendedCourses) {
		this.attendedCourses = attendedCourses;
	}

	public String getCompletedCourses() {
		return completedCourses;
	}

	public void setCompletedCourses(String completedCourses) {
		this.completedCourses = completedCourses;
	}
}
