package day4.business.concretes;

import day4.business.abstracts.CustomerService;
import day4.entities.concretes.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		
		System.out.println("Saved To Database " + customer.getFirstName());	
		
	}

}
