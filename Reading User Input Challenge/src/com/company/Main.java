package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        int sum = 0;

        while(true){

            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("sum = " + sum);
        scanner.close();

    }
}

 // Second Solution
/*
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i<=10; i++){
            System.out.println("Enter number #" + i + ": ");
            boolean validInt = scanner.hasNextInt();
            if(validInt){
                int num = scanner.nextInt();
                sum += num;
            } else{
                System.out.println("Invalid Number");
                i--;
            }
            scanner.nextLine();
        }
        System.out.println("Sum was " + sum);
        scanner.close();
    }*/
