package com.javaproject.composition.roomAttribute;

public class Room {
private Ceiling theCeiling;
private Wall1 theWall1;
private FloorRoom theFloorRoom;
private Window theWindow;
private Door theDoor;
    public Room(Ceiling ceiling, Wall1 theWall1, FloorRoom theFloorRoom, Window theWindow, Door theDoor) {
        this.theCeiling = ceiling;
        this.theWall1 = theWall1;
        this.theFloorRoom = theFloorRoom;
        this.theWindow = theWindow;
        this.theDoor = theDoor;
    }

    public Ceiling getCeiling() {
        return theCeiling;
    }

    public Wall1 getWall1() {
        return theWall1;
    }

    public FloorRoom getFloorRoom() {
        return theFloorRoom;
    }

    public Window getWindow() {
        return theWindow;
    }

    public Door getDoor() {
        return theDoor;
    }
}
