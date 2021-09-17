package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while(count !=6 ){
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i=1; i<7; i++){
            System.out.println("Count value is " + i);
        }

        for(count =1; count !=6; count++){
            System.out.println("Count value is "+ count);
        }

        count = 1;
        while (true) {
            if (count == 5){
                break;
            }
            System.out.println("Count value is "+ count);
            count++;
        }

        count =6;
        do{
            System.out.println("Count value was "+ count); // executes once at least.
            count++;
            if (count > 100){
                break;
            }
        }while (count !=6 );

        System.out.println("----------------------------------");


        int number = 3;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number "+ number);
        }

        System.out.println("Total even numbers found = "+ evenNumbersFound);


    }

    public static boolean isEvenNumber(int number){

        return (number % 2) == 0;
    }
}
