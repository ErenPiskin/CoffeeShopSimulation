package Concreate;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustoemrCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
