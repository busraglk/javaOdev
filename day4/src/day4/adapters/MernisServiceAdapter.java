package day4.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import day4.business.abstracts.CustomerServiceCheck;
import day4.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerServiceCheck {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
		result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(new Locale("tr")), 
				customer.getLastName().toUpperCase(new Locale("tr")), 
				customer.getDateOfBirth());
		}catch (RemoteException e){
			e.printStackTrace();
		}
		return result;
	}

}
