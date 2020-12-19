package com.javaproject.functionControl;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(-1));
        System.out.println(area(-1.0, 4.0));
    }
    private static double constantReturn= -1;
    public static double area(double radius){
        if(radius >= 0){
            double areaCalculate= Math.PI * (radius * radius);
            return areaCalculate;
        }
     return constantReturn;
    }
    public static double area(double x, double y){
        if(x >= 0 && y >= 0){
          double areaCalculate= x *y;
          return areaCalculate;
        }
        return constantReturn;
    }
}
