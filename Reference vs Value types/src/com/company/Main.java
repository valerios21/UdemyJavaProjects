package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // value type
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue ++;

        System.out.println(anotherIntValue);

        //reference type
        int[] myIntArray = new int[5];
        myIntArray[0] = 5;
        myIntArray[1] = 10;
        System.out.println(myIntArray[1]);

        int[] anotherArray = myIntArray;
        System.out.println(anotherArray[1]);

        System.out.println("MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("MyIntArray modify = " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray modify = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
