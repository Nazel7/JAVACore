package com.javaproject.polymorphism.vehicle;

public class Car2 {
    private String cylinders, names;
    private int wheel;
    private boolean engine;

    public Car2(String cylinders, String names) {
        this.cylinders = cylinders;
        this.names = names;
        engine= true;
        this.wheel= 4;
    }

    public String getCylinders() {
        return cylinders;
    }

    public int getWheel() {
        return wheel;
    }

    public String getNames() {
        return names;
    }

    public boolean isEngine() {
        return engine;
    }

    public void startEngine(){
        if(engine) {
            System.out.println("The car engine is ready to begin journey");
        }
        System.out.println("The car engine is off");
    }
    public void accelerate(){
        System.out.println("The car is accelerating");
    }
    public void brake(){
        System.out.println("The car break is press");

    }
}
class Ferrary extends Car2{
    public Ferrary(){
        super("Ferrary Cylinder", "Double Lasser");
    }
    public String getCylinders(){
        return super.getCylinders();
    }
    public int getWheel(){
        return super.getWheel();
    }

    @Override
    public String getNames() {
        return "Single Lasser";
    }
    public boolean isEngine() {
        return super.isEngine();
    }

    @Override
    public void startEngine() {
        if(isEngine()){
        System.out.println("The Ferrary is ready to move ");
        }
       else{ System.out.println("The Ferrary is off");
       }
    }
    public void accelerate(){
        System.out.println("The Ferrary accelerate");
    }
    public void brake(){
        System.out.println("The Ferrary applies brake");

    }
}
class FourRunner extends Car2{
    public FourRunner(){
        super("Four Runner Cylinder", "Double Lasser");
    }
    public String getCylinders(){
        return super.getCylinders();
    }
    public int getWheel(){
        return super.getWheel();
    }

    public String getNames() {
        return super.getNames();
    }
    public boolean isEngine() {
        return super.isEngine();
    }

    @Override
    public void startEngine() {
        if(isEngine()){
            System.out.println("The Four Runner is ready to move ");
        }
        else {System.out.println("The Four Runner is off");
        }
    }
    public void accelerate(){
        System.out.println("The Four Runner accelerate");
    }
    public void brake(){
        System.out.println("The Four Runner applies brake");

    }
}
class Maruwa extends Car2{
    public Maruwa(){
        super("Heavy com.javaproject.inheritance.carOperations.Vehicle Cylinder", "null");
    }
    public String getCylinders(){
        return super.getCylinders();
    }
    public int getWheel(){
        return 3;
    }

    public String getNames() {
        return super.getNames();
    }
    public boolean isEngine() {
        return super.isEngine();
    }

    @Override
    public void startEngine() {
        if(isEngine()){
            System.out.println("The Heavy com.javaproject.inheritance.carOperations.Vehicle is ready to move ");
        }
       else{ System.out.println("The Heavy com.javaproject.inheritance.carOperations.Vehicle is off");
       }
    }
    public void accelerate(){
        System.out.println("The Heavy com.javaproject.inheritance.carOperations.Vehicle accelerate");
    }
    public void brake(){
        System.out.println("The Heavy com.javaproject.inheritance.carOperations.Vehicle applies brake");

    }
}
  class Main{
    public static void main(String[] args) {
     for(int i= 1; i < 4; i++){
         System.out.println("\n com.javaproject.inheritance.carOperations.Car #"+ i+ ":"); randomCar();

     }
        }

      public static void randomCar() {
          int randomCar = (int) (Math.random() * 6);
          System.out.println("Random com.javaproject.inheritance.carOperations.Car function  "+ randomCar + " is in action");
          switch (randomCar) {
              case 0:
                  System.out.println("The Maruwa wheel is " +new Maruwa().getWheel());
                  break;
              case 1:
                  System.out.println("The Four Runner Wheel is " + new FourRunner().getWheel());
                  break;
              case 2:
                  System.out.println(new Ferrary().getCylinders() );
                  break;
              case 3:
                  new Ferrary().accelerate();
                  break;
              default:  System.out.println("No random com.javaproject.inheritance.carOperations.Car generated");
          }
      }
}
