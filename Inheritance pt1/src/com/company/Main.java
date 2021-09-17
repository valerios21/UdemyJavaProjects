package com.company;

public class Main {

    public static void main(String[] args) {

        Porsche porsche = new Porsche(36);
        porsche.steer(45);
        porsche.accelerate(30);
        System.out.println(porsche.getName());
        porsche.accelerate(20);
        porsche.accelerate(-42);

    }
}
