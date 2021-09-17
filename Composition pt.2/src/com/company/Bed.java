package com.company;

public class Bed {

    private Dimensions dimensions;
    private String color;
    private int pillows;
    private int sheets;


    public Bed(Dimensions dimensions, String color, int pillows, int sheets) {
        this.dimensions = dimensions;
        this.color = color;
        this.pillows = pillows;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }
}
