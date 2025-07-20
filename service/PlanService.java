package service;

import model.Plan;

public class PlanService {
    public Plan createPlan(String name, int validity, double price) {
        return new Plan(name, validity, price);
    }
}
