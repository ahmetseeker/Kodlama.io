
public class Navi {
	public void login(Users user) {
		System.out.println("Giris islemi basarıyla yapıldı!" + user.getName() + " " + user.getlastName());
	}
	
	public void register(Users user) {
		System.out.println("Kayit islemi basariyla yapildi!" + user.getName() + " " + user.getlastName());
	}
}
