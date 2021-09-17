package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240W", dimensions);
        Monitor monitor = new Monitor("27inch Beast", "Samsung", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("Torus","NVIDIA", 6, 6, "v2.44");

        PC thePC = new PC(theCase,motherboard,monitor);

        thePC.powerUp();

    }
}
