
public class Courses {
	
	public Courses() {
		System.out.println("Constructor Calisti!");
	}
	
	public Courses(String courseName, int courseDuration, double coursePrice, String instructor, String courseDetails) {
		this.setCourseName(courseName);
		this.setCourseDuration(courseDuration);
		this.setCoursePrice(coursePrice);
		this.setInstructor(instructor);
		this.setCourseDetails(courseDetails);
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	private String courseName;
	private int courseDuration;
	private double coursePrice;
	private String instructor;
	private String courseDetails;
	
}
