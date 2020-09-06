package com.javaproject.algorithmbasic;

public class HasSameLastDigitCompare {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,10,10));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int number, int number1, int number2) {
        if (number < 10 || number > 1000 || number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000) {
            return false;
        }
        int count= 0;
        while (number != 0) {
            int numb = number % 10;
            int numb1 = number1 % 10;
            int numb2 = number2 % 10;
            count++;
            if(count==1)
            if (numb == numb1 || numb == numb2 || numb1 == numb2)
                return true;
            number /= 10;
            number1 /= 10;
            number2 /= 10;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
