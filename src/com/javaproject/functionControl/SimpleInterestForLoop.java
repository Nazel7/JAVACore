package com.javaproject.functionControl;

public class SimpleInterestForLoop {
    public static void main(String[] args) {
        for(double i = 2; i < 9; i++ ){
            System.out.println(calculateInterest(10000, i));
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        double calSimple= (amount * interestRate) / 100;
        return calSimple;
    }
}
