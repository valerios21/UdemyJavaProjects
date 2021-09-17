package com.company;


public class Windows {

    private Dimensions dimension;
    private int number;

    public Windows(Dimensions dimension, int number) {
        this.dimension = dimension;
        this.number = number;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public int getNumber() {
        return number;
    }
}
