package com.javaproject.algorithmbasic;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int number, int number1) {
        if (number < 10 || number1 < 10) {
            return -1;
        }
        while (number != number1) {
            if (number > number1)
                number = number - number1;
            else
                number1 = number1 - number;
        }
        return number1;
    }
}
