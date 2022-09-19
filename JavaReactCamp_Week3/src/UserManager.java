
public class UserManager {
	public void login(User user) {
		System.out.println("Giris yapildi: " + user.getFirstName());
	}
	
	public void register(User user) {
		System.out.println("Kayıt islemi gerceklesti: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void viewAccount(User user) {
		System.out.println("Account Viewed!");
	}
}
