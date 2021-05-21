package day5hw;

import day5hw.business.abstracts.AuthService;
import day5hw.business.abstracts.UserService;
import day5hw.business.concretes.AuthManager;
import day5hw.business.concretes.UserManager;
import day5hw.core.concretes.UserValidationManager;
import day5hw.core.verifications.EmailVerificationManager;
import day5hw.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao());
		
		AuthService authService = new AuthManager(userService, new UserValidationManager(), 
				new EmailVerificationManager());

		System.out.println("***Register***");
		authService.register(1, "Büşra", "Gelik", "busra@busra.com", "1234");
		System.out.println("\n******");
		authService.register(2, "Büşra", "Gel", "busra1@busra1.com", "12345");
		
		
		System.out.println("****Login****");
		authService.login("busra@busra.com", "1234");
		System.out.println("\n###########################################################\n");
		authService.login("", ""); 
	}

}
