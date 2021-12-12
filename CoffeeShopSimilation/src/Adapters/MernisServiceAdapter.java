package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements ICustomerCheckService{
	
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(),customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}



	

}
