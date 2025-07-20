package model;

import java.time.LocalDate;

public class Bill {
    public Customer customer;
    public LocalDate billDate;
    public double amount;

    public Bill(Customer customer, LocalDate billDate, double amount) {
        this.customer = customer;
        this.billDate = billDate;
        this.amount = amount;
    }
}
