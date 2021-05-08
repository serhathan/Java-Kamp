import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager= new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"Serhat","Güney", LocalDate.of(2001,9,6),"40399923368"));
        
    }
}