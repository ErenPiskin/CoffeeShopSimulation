import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	
	public static void main(String[] args) {
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();	
		BaseCustomerManager starCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//If you type your correct ID number over this section , you will have the right conclusion at the end.
		Customer Eren = new Customer(1,"Eren","Piþkin","12345689",LocalDate.of(2001, 7, 26));
		Customer Serpil = new Customer(2,"Serpil","Piþkin","1354651365",LocalDate.of(2001, 7, 9));
		neroCustomerManager.Save(Serpil);
		neroCustomerManager.Save(Eren);
		starCustomerManager.Save(Eren);
		starCustomerManager.Save(Serpil);
		
		
	}

}
