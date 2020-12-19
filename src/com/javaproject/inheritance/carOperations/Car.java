package com.javaproject.inheritance.carOperations;

public class Car extends Vehicle {
    private double weight;
    private int door;
    public Car(int changeGear, String steering, int move, int tire, double weight, int door) {
        super(changeGear, steering, move, tire);
        this.weight = weight;
        this.door = door;

    }
    public double setWeight(){
        if(weight >= 500){
     return weight;
        }
        else{
          return -1;
        }
    }
    public int setDoor(){
        if(door== 4 || door== 2){
//            System.out.println("A car is called");
            return door;
        }
        else return -1;
    }
    public String setSteeringP(){
        return setSteeringPosition();
    }
    public int setMoving(){
        return setMove();
    }
    public int setTires(){
        return setTire();
    }

}
