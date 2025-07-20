package model;

public class Customer {
    public int id;
    public String name, email, address;
    public Plan plan;

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
