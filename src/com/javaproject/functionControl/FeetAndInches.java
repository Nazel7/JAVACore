package com.javaproject.functionControl;

public class FeetAndInches {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0, -12);
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }
    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && inches >= 0 && inches <= 12){
         double centimeters= (2.54 * feet * 12) + (2.54 * inches);
            System.out.println(feet + " feet(s) and " + inches + "inches is = " + centimeters + " centimeter(s)");
            return centimeters;
        }
        return -1;
    }
    private static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet= (int) inches / 12;
            double remainder= (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainder + " inches") ;
            return calcFeetAndInchesToCentimeters(feet, remainder);

        }
        return -1;
    }
}
