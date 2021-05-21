package day5hw.otherAuths;

import day5hw.business.abstracts.AuthService;

public class GoogleAuthManager implements AuthService {

	@Override
	public void login(String email, String password) {
		System.out.println("Google ile giri� yap�ld�: " +email );
		
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		System.out.println("Google ile kay�t yap�ld�: " +email);
		
	}

}
