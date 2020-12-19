package com.javaproject.functionControl;

public class SumEVen {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1141212234));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int digit =0;
        while (number > 0) {
            int dg = number % 10;
            if(dg % 2 == 0)
                digit+= dg;
            number /= 10;

        }
        return digit;
    }
}