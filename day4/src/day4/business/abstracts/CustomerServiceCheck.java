package day4.business.abstracts;

import day4.entities.concretes.Customer;

	public interface CustomerServiceCheck {
		boolean checkIfRealPerson(Customer customer);
	}

