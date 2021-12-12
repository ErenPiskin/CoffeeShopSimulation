package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService �customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService icustomerCheckService) {
		
		this.�customerCheckService = icustomerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(this.�customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("not a valid Person");
		}
		
	}

}
