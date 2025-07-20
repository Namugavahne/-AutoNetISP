import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        PlanService planService = new PlanService();
        BillingService billingService = new BillingService();

        Customer c1 = customerService.addCustomer("Namdev", "namdev@gmail.com", "Pune");
        Plan plan = planService.createPlan("Basic", 30, 499.0);

        customerService.assignPlan(c1, plan);

        Bill bill = billingService.generateBill(c1);
        billingService.printBill(bill);
    }
}
