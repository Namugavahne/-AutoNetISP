package service;

import model.Bill;
import model.Customer;
import java.time.LocalDate;

public class BillingService {
    public Bill generateBill(Customer customer) {
        return new Bill(customer, LocalDate.now(), customer.plan.price);
    }

    public void printBill(Bill bill) {
        System.out.println("---- BILL ----");
        System.out.println("Customer: " + bill.customer.name);
        System.out.println("Plan: " + bill.customer.plan.name);
        System.out.println("Amount: ₹" + bill.amount);
        System.out.println("Date: " + bill.billDate);
        System.out.println("--------------");
    }
}

