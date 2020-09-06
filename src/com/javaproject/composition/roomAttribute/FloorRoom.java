package com.javaproject.composition.roomAttribute;

public class FloorRoom {
   private Bed bed;
    private boolean tiles;

    public FloorRoom(Bed bed) {
        this.tiles = true;
        this.bed= bed;
    }

    public Bed getBed() {
        return bed;
    }

    public boolean isTiles() {
        return tiles;
    }
}
