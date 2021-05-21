package day4.business.concretes;

import day4.business.abstracts.CustomerServiceCheck;
import day4.entities.concretes.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager {

	private CustomerServiceCheck customerServiceCheck;

	public StarbucksCustomerManager(CustomerServiceCheck customerServiceCheck) {
		super();
		this.customerServiceCheck = customerServiceCheck;
	}
	
	@Override
	public void add(Customer customer) {
		
		if(customerServiceCheck.checkIfRealPerson(customer))
		{
			super.add(customer);
		}
		else 
		{
			System.out.println("Not a valid person");
		}		
		
	}
}
