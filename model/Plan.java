package model;

public class Plan {
    public String name;
    public int validity; // in days
    public double price;

    public Plan(String name, int validity, double price) {
        this.name = name;
        this.validity = validity;
        this.price = price;
    }
}
