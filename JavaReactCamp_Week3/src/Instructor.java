
public class Instructor extends User{
	
	public Instructor() {
		System.out.println("Constructor calisti!");
	}
	
	public Instructor(String profession, double salary, String achievements) {
		this();
		this.profession = profession;
		this.salary = salary;
		this.achievements = achievements;
	}
	
	private String profession;
	private double salary;
	private String achievements;
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
}
