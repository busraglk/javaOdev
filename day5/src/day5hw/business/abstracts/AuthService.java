package day5hw.business.abstracts;

public interface AuthService {

	void login(String email, String password);

	void register(int id, String firstName, String lastName, String email, String password);
}
