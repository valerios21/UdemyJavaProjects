package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Vip Name", 100.50, "vip@gmail.com");
        System.out.println("Default Constructor called");
    }

    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"vip@gmail.com");
        System.out.println("Test 1 constructor called");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
