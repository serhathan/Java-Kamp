package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisServiceReferance.UQAKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer)   {
        UQAKPSPublicSoap client=new UQAKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
