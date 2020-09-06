package com.javaproject.functionControl;

class Car1 {
    private String cylinders, names;
    private int wheel;
    private boolean engine;

    public Car1(String cylinders, String names) {
        this.cylinders = cylinders;
        this.names = names;
        engine= true;
        wheel= 4;
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
        System.out.println("The car engine is down");
    }
    public void accelerate(){
        System.out.println("The car is accelerating");
    }
    public void brake(){
        System.out.println("The car break is press");

    }

}
