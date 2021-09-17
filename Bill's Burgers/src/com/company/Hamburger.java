package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Price += price;
        this.addition1Name = name;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Price += price;
        this.addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Price += price;
        this.addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Price += price;
        this.addition4Name = name;
    }

    public double itemizeHamburger(){

        double currentTotal = this.price;

        if (addition1Name != null) {
            currentTotal += addition1Price;
            System.out.println("Added " + addition1Name + " at " + addition1Price);
        }

        if (addition2Name != null) {
            currentTotal += addition2Price;
            System.out.println("Added " + addition2Name + " at " + addition2Price);
        }

        if (addition3Name != null) {
            currentTotal += addition3Price;
            System.out.println("Added " + addition3Name + " at " + addition3Price);
        }

        if (addition4Name != null) {
            currentTotal += addition4Price;
            System.out.println("Added " + addition4Name + " at " + addition4Price);
        }

        return currentTotal;
    }
}
