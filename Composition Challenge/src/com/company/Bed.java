package com.company;

public class Bed {

    private String style;
    private int pillows,height,sheets,guilt;

    public Bed(String style, int pillows, int height, int sheets, int guilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.guilt = guilt;
    }

    public void make(){
        System.out.println("Bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getGuilt() {
        return guilt;
    }
}
