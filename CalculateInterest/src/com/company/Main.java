package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = "+ calculateInterest(10000,2.0));

        for(int i=0 ; i<5; i++){
            System.out.println("Loop " + i + " Hello");
        }

        for (int i=2; i<9; i++){
            System.out.println("10.000 at "+ i + " interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println("-------------------------------------");

        for (int i=8; i>=2; i--){
            System.out.println("10.000 at "+ i + " interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println("-------------------------------------");

        int count = 0;
        for(int i=10; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number "+ i + " is a prime Number");
                if(count == 5){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        System.out.println("-------------------------------------");

        int count2 = 0;
        int sum = 0;

       for(int i = 1; i <= 1000; i++){

           if(i % 3 == 0 && i % 5 == 0){
               sum += i;
               count2++;
               System.out.println("Found number = " + i);
           }
           if (count2 == 5){
               System.out.println("Sum = " + sum);
               break;
           }
       }

    }


    public static boolean isPrime(int n){

        if( n == 1){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }




    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

}
