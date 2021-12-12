package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService ýcustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService icustomerCheckService) {
		
		this.ýcustomerCheckService = icustomerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(this.ýcustomerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("not a valid Person");
		}
		
	}

}
