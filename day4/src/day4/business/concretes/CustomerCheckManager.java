package day4.business.concretes;

import day4.business.abstracts.CustomerServiceCheck;
import day4.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerServiceCheck {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

}
