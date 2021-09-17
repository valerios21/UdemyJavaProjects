package com.company;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown Rye Bread");
    }

    public void addHealthyAddition1(String name,double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double currentTotal = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            currentTotal += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " at " + healthyExtra1Price);
        }

        if (healthyExtra2Name != null) {
            currentTotal += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " at " + healthyExtra2Price);
        }

        return currentTotal;
    }
}
