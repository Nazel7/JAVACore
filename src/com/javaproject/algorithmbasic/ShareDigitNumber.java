package com.javaproject.algorithmbasic;

public class  ShareDigitNumber {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(96, 11));
    }

    public static boolean hasSharedDigit(int number, int number1) {
        if (number < 10 || number > 99 || number1 < 10 || number1 > 99) {
            return false;
        }
        int reverse = 0;
        int reverse1 = 0;
        int digit = 0;
        int digit1 = 0;
        while (number != 0) {
            digit = number % 10;
            digit1 = number1 % 10;
            reverse = (reverse * 10) + digit;
            reverse1 = (reverse1 * 10) + digit1;
            number /= 10;
            number1 /= 10;
        }
        while (reverse != 0) {
            int yes = reverse % 10;
            int yes1 = reverse1 % 10;
            if (digit1 == yes || digit == yes1 || yes == yes1)
                return true;
            reverse /= 10;
            reverse1 /= 10;
        }
        return false;
    }
}
