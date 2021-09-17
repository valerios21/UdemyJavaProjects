package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,5,15);
        System.out.println(animal.getName());

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20,"Long Silky");
        System.out.println(dog.getBrain());
        dog.eat();
        dog.walk();
        dog.run();

    }
}
