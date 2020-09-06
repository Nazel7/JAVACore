package com.javaproject.functionControl;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(112));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int remain= number % 10;
        int reverse= 0;
        while(number > 0) {
            int digit = number % 10;
            reverse = ((reverse * 10) + digit) % 10 ;
            number /= 10;
        }
        return remain + reverse;
    }
}
