package day5hw.core.verifications;

import java.util.Random;
import java.util.Scanner;

import day5hw.entities.concretes.User;

public class SmsVerificationManager implements VerificationService {

	@Override
	public boolean verificate(User user) {
		Scanner scanner = new Scanner(System.in);
		char isDecision = 'h';
		System.out.println(
				user.getFirstName() + " adlı kişinin telefonuna gelen doğrulama kodunu girmek istiyor musunuz? (E/H)");
		isDecision = scanner.next().charAt(0);

		if (isDecision == 'e' || isDecision == 'E') {
			Random random = new Random();
			int randomInteger, iAmNotARobot, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						"Hesabınızı doğrulamak için telefona gelen 6 haneli kodu giriniz:\n--> " + randomInteger);
				iAmNotARobot = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"Çok fazla yanlış denemenizden kaynaklı hesabınızı şuanda doğrulayamıyoruz. \nLütfen daha sonra tekrar deneyiniz.");
					scanner.close();
					return false;
				}
			} while (!(iAmNotARobot == randomInteger) && count < 4);
			System.out.println("Tebrikler hesabınız doğrulandı.");
			user.setVerified(true);
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
	}

}
