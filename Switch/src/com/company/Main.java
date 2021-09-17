package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

/*        int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

        char charValue = 'A';

        switch(charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Your char is " + charValue);
                break;

            default:
                System.out.println("Was not found A,B,C,D or E");
                break;
        }

        String month = "JANuaRy";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Your month is " + month);
                break;

            default:
                System.out.println("Not January");
                break;
        }



    }
}
