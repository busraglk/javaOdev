package day5hw.core.abstracts;

import day5hw.entities.concretes.User;

public interface UserValidationService {
	boolean registerValidate(User user);
	
	boolean loginValidate(String email,String password);
		
}
