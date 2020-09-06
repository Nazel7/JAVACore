package com.javaproject.algorithmbasic;

public class CompareTo {
    public static void main(String[] args){
        boolean compare = areEqualByThreeDecimalPlaces(1.234, 1.4556);
        System.out.println(compare);
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        double number=  number1*1000;
        double number0= number2 *1000;
        int numb= (int) number;
        int numb0= (int) number0;
        System.out.println(numb0);
        System.out.println(numb);
if(numb== numb0){
    return true;
}
return false;
    }
}
