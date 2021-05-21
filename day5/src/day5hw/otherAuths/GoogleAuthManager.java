package day5hw.otherAuths;

import day5hw.business.abstracts.AuthService;

public class GoogleAuthManager implements AuthService {

	@Override
	public void login(String email, String password) {
		System.out.println("Google ile giriþ yapýldý: " +email );
		
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		System.out.println("Google ile kayýt yapýldý: " +email);
		
	}

}
