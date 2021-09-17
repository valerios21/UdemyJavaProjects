package com.company;

public class Main {

    public static void main(String[] args) {
	 calcFeetAndInchesToCentimetres(10,10);
	 calcFeetAndInchesToCentimetres(100);
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){



        if ( feet >= 0 && (inches >= 0 && inches <=12)){
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet and  "+ inches + " inches = " + centimeters + " cm");
            return centimeters;

        }else
            System.out.println("invalid feet or inches parameters");
            return -1;

    }

    public static double calcFeetAndInchesToCentimetres(double inches){

        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " remaining inches");
        return calcFeetAndInchesToCentimetres(feet, remainingInches);
    }

}
