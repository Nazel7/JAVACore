package com.javaproject.inheritance.carOperations;

public class Ferarry extends Car {
    private int pointers;
    private int door1;

    public Ferarry(int changeGear, String steering, int move, int tire, double weight, int door, int pointers, int door1){
        super(changeGear, steering, move, tire, weight, door);
        this.pointers = pointers;
        this.door1 = door1;
    }

    private double getWeight() {
        return setWeight();
    }

    @Override
    public int setDoor() {
        if (door1 == 2) {
            return door1;
        }
        return -1;
    }

    public int getPointers() {
        if (pointers >= 2 && pointers <= 4) {
            return pointers;
        }
        else return -1;
    }

    public String getSteering() {
        return setSteeringP();
    }

    public int getMoving() {
        return setMoving();
    }

    public int getTires() {
        if (setTires() == 4) {
            return setTires();
        }
        return -1;
    }
}
