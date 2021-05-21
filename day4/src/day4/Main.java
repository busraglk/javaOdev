package day4;


import day4.adapters.MernisServiceAdapter;
import day4.business.concretes.BaseCustomerManager;
import day4.business.concretes.StarbucksCustomerManager;
import day4.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Büþra", "Gelik", 1995, "1111111111111"));	

	}

}
