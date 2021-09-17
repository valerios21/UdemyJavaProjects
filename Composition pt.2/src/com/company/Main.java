package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(5,5);

        Door door = new Door(dimensions,"Red");
        Windows windows = new Windows(dimensions,2);
        Bed bed = new Bed(dimensions,"Blue",2,1);

        Room room = new Room(door,windows,bed);
        room.makeBed();

        System.out.println(room.getDoor().getColor());


    }
}
