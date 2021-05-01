package day3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getEmail() + " " + " eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getEmail() + " " +  " silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getEmail() + " " + " güncellendi.");
	}
	
}
