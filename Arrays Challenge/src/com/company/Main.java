package com.company;

public class Main {

    public static void main(String[] args) {


        int[] myIntegers = SortedArrays.getIntegers(5);
        for (int i=0; i<myIntegers.length; i++)
        {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        SortedArrays.printArray(myIntegers);


    }

}
