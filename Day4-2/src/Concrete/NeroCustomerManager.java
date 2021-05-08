package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

    ICustomerCheckService customerCheckService;

    public NeroCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else {
            System.out.println("Not valid person");
            System.out.println("merhabalar v 1.01");
        }

    }
}
