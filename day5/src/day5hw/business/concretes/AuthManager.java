package day5hw.business.concretes;

import day5hw.business.abstracts.AuthService;
import day5hw.business.abstracts.UserService;
import day5hw.core.abstracts.UserValidationService;
import day5hw.core.verifications.VerificationService;
import day5hw.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;
	UserValidationService userValidationService;
	VerificationService verificationService;

	public AuthManager() {
	}

	public AuthManager(UserService userService, UserValidationService userValidationService,
			VerificationService verificationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.verificationService = verificationService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User userToRegister = new User(id, firstName, lastName, email, password);

		if (!this.userValidationService.registerValidate(userToRegister)) {
			System.out.println("Kullanýcý bilgilerinizi kontrol ediniz!");
			return;
		}
		if (!checkIfUserExists(email)) {
			System.out.println("Baþarýsýz. Bu email ile daha önceden kayýt oluþturulmuþ!");
			return;
		}
		if (!this.verificationService.verificate(userToRegister)) {
			System.out.println("Doðrulama iþlemi iptal edildi.");
		}

		userService.add(userToRegister);

	}

	@Override
	public void login(String email, String password) {
		if (!this.userValidationService.loginValidate(email, password)) {
			System.out.println("Kullanýcý bilgilerinizi kontrol ediniz!");
			return;
		}

		User userToLogin = userService.getByEmailAndPassword(email, password);

		if (userToLogin == null) {
			System.out.println("Giriþ baþarýsýz.E-posta ya da þifre bilgileriniz yanlýþtýr ");
			return;
		}

		if (!checkIfUserVerified(userToLogin)) {
			System.out.println("Giriþ baþarýsýz. Önce üyeliðinizi doðrulamalsýnýz! ");
			return;
		}
		System.out.println("Giriþ baþarýlý. Hoþgeldiniz " + userToLogin.getFirstName() + " " + userToLogin.getLastName());

	}

	private boolean checkIfUserExists(String email) {
		return this.userService.getByMail(email) == null;
	}

	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}

}
