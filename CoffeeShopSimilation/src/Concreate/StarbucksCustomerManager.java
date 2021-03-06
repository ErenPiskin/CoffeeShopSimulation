package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService ıcustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService icustomerCheckService) {
		
		this.ıcustomerCheckService = icustomerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(this.ıcustomerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("not a valid Person");
		}
		
	}

}
