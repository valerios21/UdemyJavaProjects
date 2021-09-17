package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Car carModel = new Car();
        carModel.setModel("caRrERa");
        System.out.println("Model is " + carModel.getModel().toLowerCase(Locale.ROOT));

        System.out.println("---------------------------------------------------------");

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setLastNumber(4);
        System.out.println("Add= " + calculator.getAdditionResult());
        System.out.println("Subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setFirstNumber(0);
        System.out.println("Multiply= "+ calculator.getMultiplicationResult());
        System.out.println("Divide= "+ calculator.getDivisionResult());

        System.out.println("---------------------------------------------------------");

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= "+ person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("FullName= "+ person.getFullName());
        System.out.println("Teen= "+ person.isTeen());
        person.setLastName("Smith");
        System.out.println("FullName= "+ person.getFullName());

        System.out.println("---------------------------------------------------------");


        //first constructor
        bankAccount account = new bankAccount(1,500,"Valerios","v.kitrom@gmail.com", 5959);

        System.out.println("Account constructor with parameters called.");
        System.out.println("Your acc name is " + account.getCustomerName() + " and your acc number is " + account.getAccNumber() + " and your email is " + account.getEmail() +
                " with phone number " + account.getPhone());
        System.out.println("Your total balance is " + account.getBalance());
        account.withdrawFunds(100);
        account.depositFunds(5000);


        //2nd constructor
        bankAccount valsAccount = new bankAccount("Valerios2","v.kitrom2@gmail.com",6969696);
        System.out.println(valsAccount.getAccNumber() + " name " + valsAccount.getCustomerName());

        System.out.println("---------------------------------------------------------");

        //1st con
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        //2nd con
        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getName());

        //3rd con
        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@gmail.com");
        System.out.println(person3.getName() + " " + person3.getEmail() + " " + person3.getCreditLimit());


        Wall wall1 = new Wall();
        System.out.println(wall1.createWall());


    }
}
