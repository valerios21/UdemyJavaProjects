package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Your sum of digits is "+ sumDigits(100));
    }

    private static int sumDigits(int number){

        if (number<10){
            return -1;
        }

        int sum = 0;
        // e.g 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0){

            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
