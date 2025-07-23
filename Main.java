import java.util.Scanner;

import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        PlanService planService = new PlanService();
        BillingService billingService = new BillingService();
        String name;
        String email;
        String address;
        String planName;
        int planValidity;
        int price;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your email");
        email = sc.nextLine();
        System.out.println("Enter your Address");
        address = sc.nextLine();

        System.out.println("Enter your plan name");
        planName = sc.nextLine();

        System.out.println("Enter your planValidity");
        planValidity = sc.nextInt();

        System.out.println("Enter your price");
        price = sc.nextInt();

        Customer c1 = customerService.addCustomer(name, email, address);
        Plan plan = planService.createPlan(planName, planValidity, price);

        customerService.assignPlan(c1, plan);

        Bill bill = billingService.generateBill(c1);
        billingService.printBill(bill);
    }
}
