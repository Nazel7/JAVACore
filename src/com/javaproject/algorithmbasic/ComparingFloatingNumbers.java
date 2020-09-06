package com.javaproject.algorithmbasic;

public class ComparingFloatingNumbers {
    public static void main(String[] args) {
        boolean cal = areEqualByThreeDecimalPlaces(1.2345, 1.2349);
        System.out.println(cal);
    }

    public static boolean areEqualByThreeDecimalPlaces(double number, double number2) {
        int numb = (int) (number * 1000);
        int numb1 = (int) (number2 * 1000);
        if (numb== numb1) {
            return true;
        }
        return false;
    }
}
