package com.company;

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car -> engine starts.";
    }

    public String accelerate(){
        return "Car -> accelerating.";
    }

    public String brake(){
        return "Car -> braking.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +"-> start Engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerating.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> braking.";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerating.";
    }

    @Override
    public String brake() {
        return "Holden -> braking.";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Ford -> engine starts.";
    }
    @Override
    public String accelerate() {
        return "Ford -> accelerating.";
    }
    @Override
    public String brake() {
        return "Ford -> braking.";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());


    }
}
