package com.company;

public class Room {

    private Door door;
    private Windows windows;
    private Bed bed;

    public Room(Door door, Windows windows, Bed bed) {
        this.door = door;
        this.windows = windows;
        this.bed = bed;
    }

    public void makeBed(){
        getBed().make();
    }

    public Door getDoor() {
        return door;
    }

    public Windows getWindows() {
        return windows;
    }

    public Bed getBed() {
        return bed;
    }
}
