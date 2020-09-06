package com.javaproject.functionControl;

public class SpeedCoverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            return Math.round(kilometersPerHour / 1.609);

        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }
        else{
        int milesPerHour= (int) toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }
}
