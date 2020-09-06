package com.javaproject.functionControl;

public class EqualPrint {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
    }

    public static void printEqual(int number, int number1, int number2) {
        if (number < 0 || number1 < 0 || number2 < 0) {
            System.out.println("Invalid Value");
        } else if (number == number1 && number1 == number2 ) {
            System.out.println("All numbers are equal");
        } else if (number != number1 && number1 != number2 && number != number2) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }
}