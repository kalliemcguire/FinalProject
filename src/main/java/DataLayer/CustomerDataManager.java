package DataLayer;

import BusinessLayer.Customer;
import java.util.ArrayList;

public class CustomerDataManager {

    private ArrayList<Customer> customers;
    
    public CustomerDataManager() {
        this.customers = new ArrayList<Customer>();
    }
    
    public Customer create(Customer customerToCreate) {
        this.customers.add(customerToCreate);
        
        return customerToCreate;
    }
    
    public ArrayList<Customer> getAll() {
        return this.customers;
    }
    
    public ArrayList<Customer> getByCustomerId(int customerId) {
        ArrayList<Customer> output = new ArrayList<Customer>();
        
        for (Customer cust : this.customers) {
            if (cust.getCustomerId() == customerId) {
                output.add(cust);
            }
        }
        return output;
    }
}
