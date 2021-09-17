package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double lastNumber;



    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }


    public double getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(double lastNumber) {
        this.lastNumber = lastNumber;
    }

    public double getAdditionResult(){
        return firstNumber + lastNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - lastNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * lastNumber;
    }

    public double getDivisionResult(){
        if (lastNumber == 0){
            return 0;
        }else
            return firstNumber / lastNumber;
    }

}
