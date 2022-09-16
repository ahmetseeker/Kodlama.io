
public class Users {
	
	public Users() {
		System.out.println("Constructor Çalıştı!");
	}
	
	public Users(String name, String lastName, String eMail, String password) {
		this.name = name; 
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	
	private String name;
	private String lastName;
	private String eMail;
	private String password;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String geteMail() {
		return this.eMail;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
