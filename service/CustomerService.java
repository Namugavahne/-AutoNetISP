package service;

import model.Customer;
import model.Plan;
import java.util.*;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();
    private static int idCounter = 1;

    public Customer addCustomer(String name, String email, String address) {
        Customer customer = new Customer(idCounter++, name, email, address);
        customers.add(customer);
        return customer;
    }

    public void assignPlan(Customer customer, Plan plan) {
        customer.plan = plan;
    }
}
