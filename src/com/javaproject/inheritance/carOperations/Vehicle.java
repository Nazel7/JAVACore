package com.javaproject.inheritance.carOperations;

public class Vehicle {
    private int changeGear;
    private String steering;
    private int move;
    private int tire;
    public Vehicle(int changeGear, String steering, int move, int tire){
        this.changeGear= changeGear;
        this.steering= steering;
        this.move = move;
        this.tire= tire;
    }

    public int setMove(){
        if(changeGear >= 1 && move >= 1){
          int speed= this.move *changeGear;
            System.out.println("The com.javaproject.inheritance.carOperations.Car is moving at " +speed);
            return speed;
        }

        else {
            return 0;
        }
    }
    public String setSteeringPosition(){
        steering= "Black";
      if(move >= 1 && move <= 160 && changeGear >= 1 && changeGear <= 6){
          System.out.println("Nigerian com.javaproject.inheritance.carOperations.Car and Steering position is Left with " +steering + " steering" );
          return steering;
      }
      else{
          steering= "Ash";
          return steering;
      }
    }
    public int setTire(){
        if(tire >= 4 && tire <= 24){
            return tire;
        }
        else{
            return -1;
        }
    }
}
